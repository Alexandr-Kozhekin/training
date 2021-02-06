package sql.demo.service;

import org.h2.tools.DeleteDbFiles;
import sql.demo.repository.*;
import java.sql.*;

public class StockExchangeDB {

// Блок объявления констант

    public static final String DB_DIR = "/Users/alexandrkozhekin/Documents/IntaliIDEA/SQLDemo/db";
    public static final String DB_FILE = "stockExchange";
    public static final String DB_URL = "jdbc:h2:/" + DB_DIR + "/" + DB_FILE;
    public static final String DB_Driver = "org.h2.Driver";

// Таблицы СУБД

    Traiders traiders;
    ShareRates shareRates;
    Shares shares;
    TraiderShareActions traiderShareActions;


// Получить новое соединение с БД

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }


// Инициализация

    public StockExchangeDB(boolean renew) throws SQLException, ClassNotFoundException {
        if (renew)
            DeleteDbFiles.execute(DB_DIR, DB_FILE, false);
        Class.forName(DB_Driver);

// Инициализируем таблицы

        traiders = new Traiders();
        shares = new Shares();
        shareRates = new ShareRates();
        traiderShareActions = new TraiderShareActions();
    }


// Инициализация по умолчанию, без удаления файла БД

    public StockExchangeDB() throws SQLException, ClassNotFoundException {
        this(false);
    }


// Создание всех таблиц и внешних ключей

    public void createTablesAndForeignKeys() throws SQLException {
        shares.createTable();
        shareRates.createTable();
        traiders.createTable();
        traiderShareActions.createTable();

// Создание ограничений на поля таблиц

        traiderShareActions.createExtraConstraints();
        shares.createExtraConstraints();

// Создание внешних ключей (связи между таблицами)

        shareRates.createForeignKeys();
        traiderShareActions.createForeignKeys();
    }


    public static void main(String[] args) {
        try{
            StockExchangeDB stockExchangeDB = new StockExchangeDB(true);
            stockExchangeDB.createTablesAndForeignKeys();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ошибка SQL !");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC драйвер для СУБД не найден!");
        }
    }
}
