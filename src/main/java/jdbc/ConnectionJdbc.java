package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJdbc {

    public Connection getMyConnection () throws SQLException, ClassNotFoundException {

        String connectionUrl = "jdbc:mysql://localhost:3306/Company";
        String password = "admin123";
        String user = "root";
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(connectionUrl, user, password);
        return connection;
    }
}
