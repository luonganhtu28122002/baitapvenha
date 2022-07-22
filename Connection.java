package baitap;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    public static void main(String[] args) throws SQLException {

        java.sql.Connection connection = getConnection();
        if (connection != null) {
            System.out.printf("Ket noi thanh cong");
        }

    }
    public static java.sql.Connection getConnection() throws SQLException {
        String dbURL = "jdbc:mysql://localhost:3306/baitap";
        String username = "root";
        String password = "123456789";
        java.sql.Connection connection = DriverManager.getConnection(dbURL, username, password);
        return connection;
    }

}
