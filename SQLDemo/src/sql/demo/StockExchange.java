package sql.demo;

import java.sql.*;

public class StockExchange {
// Блок объявления констант

//    DB_Driver: Здесь мы определили имя драйвера, которое можно узнать,
//    например, кликнув мышкой на подключенную библиотеку и развернув её структуру в директории lib текущего проекта.
//    DB_URL: Адрес нашей базы данных. Состоит из данных, разделённых двоеточием:
//    Протокол=jdbc
//    Вендор (производитель/наименование) СУБД=h2
//    Расположение СУБД, в нашем случае путь до файла (c:/JavaPrj/SQLDemo/db/stockExchange).
//    Для сетевых СУБД тут дополнительно указываются имена или IP адреса удалённых серверов,
//    TCP/UDP номера портов и так далее.

    public static final String DB_URL = "jdbc:h2:/Users/alexandrkozhekin/Documents/IntaliIDEA/SQLDemo/db/stockExchange";
    public static final String DB_Driver = "org.h2.Driver";

    public static void main(String[] args) {

        try {
//Проверяем наличие JDBC драйвера для работы с БД
            Class.forName(DB_Driver);
//соединение с БД
            Connection connection = DriverManager.getConnection(DB_URL);

            System.out.println("Соединение с СУБД выполнено.");
// отключение от БД
            connection.close();

            System.out.println("Отключение от СУБД выполнено.");

        } catch (ClassNotFoundException e) {
// обработка ошибки  Class.forName
            e.printStackTrace();

            System.out.println("JDBC драйвер для СУБД не найден!");

        } catch (SQLException e) {
// обработка ошибок  DriverManager.getConnection
            e.printStackTrace();

            System.out.println("Ошибка SQL !");
        }
//        Логика работы:
//        Class.forName(DB_Driver) – убеждаемся в наличии соответствующего JDBC-драйвера
//        (который мы ранее загрузили и установили).
//        DriverManager.getConnection(DB_URL) – устанавливаем соединение СУБД.
//        По переданному адресу, JDBC сама определит тип и местоположение нашей СУБД
//        и вернёт Connection, который мы можем использовать для связи с БД.
//        connection.close() – закрываем соединение с СУБД и завершаем работу с программой.
    }
}
