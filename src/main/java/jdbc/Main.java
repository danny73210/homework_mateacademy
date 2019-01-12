package jdbc;

import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String nameOfTable = "TestTable";
        StatementJdbc statementJdbc = new StatementJdbc();
        //statementJdbc.createTable(nameOfTable);
        //statementJdbc.alterTable(nameOfTable);
        //statementJdbc.insertTable(nameOfTable);
        //statementJdbc.dropTable(nameOfTable);

        CRUD crud = new CRUD();
        //crud.create();
        crud.read();
    }
}
