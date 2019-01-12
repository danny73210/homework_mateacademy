package jdbc;

import java.sql.*;

public class StatementJdbc {

    ConnectionJdbc connectionJdbc = new ConnectionJdbc();
    Statement statement;
    ResultSet resultSet;

    {
        try {
            statement = connectionJdbc.getMyConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ConnectionJdbc createTable (String nameOfTable) {
        try {

            statement.execute("create table " + nameOfTable + "(id int not null auto_increment, primary key (id))");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return connectionJdbc;
    }

    public ConnectionJdbc dropTable (String nameOfTable) {
        try {

            statement.execute("drop table " + nameOfTable);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return connectionJdbc;
    }

    public ConnectionJdbc alterTable (String nameOfTable, String columnName) {
        try {

            statement.execute("alter table " + nameOfTable + " add column " + columnName + " varchar(30) not null");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return connectionJdbc;
    }

    public ConnectionJdbc insertTable (String nameOfTable, String columnName, String data) {
        try {

            statement.execute("insert into " + nameOfTable + " set " + columnName + " = '" + data + "'");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return connectionJdbc;
    }

    public ConnectionJdbc showTable () {
        try {
            connectionJdbc.getMyConnection().createStatement();
            resultSet = statement.executeQuery("select * from TestTable");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        while (true) {
            try {
                if (!resultSet.next()) break;
                String name = resultSet.getString(2);

                int count = 0;

                String output = "User #%d: %s";
                System.out.println(String.format(output, ++count, name));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connectionJdbc;
    }
}
