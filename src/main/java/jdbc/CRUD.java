package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD {

    ConnectionJdbc connectionJdbc = new ConnectionJdbc();
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet resultSet;
    String sql;

    public void create() {
        sql = "insert into Users (username, password, email) values (?, ?, ?)";

        try {
            preparedStatement = connectionJdbc.getMyConnection().prepareStatement(sql);
            preparedStatement.setString(1, "userNameOne");
            preparedStatement.setString(2, "userPasswordOne");
            preparedStatement.setString(3, "userEmailOne");

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0)
                System.out.println("A new user was inserted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void read() {
        sql = "select * from projects_developers";
        int count = 0;

        try {
            statement = connectionJdbc.getMyConnection().createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        while (true) {
            try {
                if (!resultSet.next()) break;
                String str1 = resultSet.getString(2);
                String str2 = resultSet.getString(3);

                String output = "Project - developers #%d: %s - %s";
                System.out.println(String.format(output, ++count, str1, str2));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void update() {

        sql = "UPDATE Users SET password=?, email=? WHERE username=?";
        int rowsUpdated = 0;

        try {
            preparedStatement = connectionJdbc.getMyConnection().prepareStatement(sql);
            preparedStatement.setString(1, "userPasswordOneNew");
            preparedStatement.setString(2, "userEmailOneNew");
            preparedStatement.setString(3, "userNameOne");
            rowsUpdated = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (rowsUpdated > 0) {
            System.out.println("An existing user was updated successfully!");

        }
    }

    public void delete() {

        sql = "delete from Users where username=?";
        int rowsDeleted = 0;

        try {
            preparedStatement = connectionJdbc.getMyConnection().prepareStatement(sql);
            preparedStatement.setString(1, "userNameOne");
            rowsDeleted = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (rowsDeleted > 0) {
            System.out.println("A user was deleted successfully!");
        }

    }
}
