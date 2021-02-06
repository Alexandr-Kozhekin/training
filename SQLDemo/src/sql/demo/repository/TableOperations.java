package sql.demo.repository;

import java.sql.SQLException;

// Операции с таблицами

public interface TableOperations {

    // создание таблицы
    void createTable() throws SQLException;

    // создание связей между таблицами
    void createForeignKeys() throws SQLException;

    // создание дополнительных правил для значений полей таблиц
    void createExtraConstraints() throws SQLException;
}
