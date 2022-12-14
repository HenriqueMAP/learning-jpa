package model.database.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTablePeople {

    public static void main(String[] args) throws SQLException {

        Connection factoryConnection = DatabaseConnectivityManager.getConnection();
        String sqlCommand =
                "CREATE TABLE IF NOT EXISTS people ("
                        + "person_code INT AUTO_INCREMENT PRIMARY KEY,"
                        + "person_name VARCHAR(80) NOT NULL"
                        + ")";


        Statement factoryStatement = factoryConnection.createStatement();
        factoryStatement.execute(sqlCommand);

        System.out.println("People table created successfully.");
        factoryConnection.close();
    }
}
