package test;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCExample {

    public static void main(String[] args) throws SQLException {

        //ec2-18-191-158-147.us-east-2.compute.amazonaws.com

        /**
         * 3 main classes in JDBC
         *
         * 1.Connection
         * 2.Statement
         * 3.ResultSet
         *
         */

        String oracleURL = "jdbc:oracle:thin:@ec2-18-191-158-147.us-east-2.compute.amazonaws.com:1521:xe";
        String oracleUsername="hr";
        String oraclePassword="hr";

        Connection connection= DriverManager.getConnection(oracleURL, oracleUsername, oraclePassword);

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet=statement.executeQuery("select employee_id, first_name, last_name from employees");

        resultSet.next();

        System.out.println("First row: "+resultSet.getObject("employee_id"));
        System.out.println("First row: "+resultSet.getObject("first_name"));
        System.out.println("First row: "+resultSet.getObject("last_name"));

        System.out.println("First row: "+resultSet.getObject(1));
                System.out.println("First row: "+resultSet.getObject(2));
                        System.out.println("First row: "+resultSet.getObject(3));

        System.out.println("Get row number: "+resultSet.getRow());
        System.out.println("Get row number: "+resultSet.last());

        statement.close();

        connection.close();

        List<Map<String, Object>> table=new ArrayList<>();

        Map<String, Object> map1=new HashMap<>();

        map1.put("employee_id", 100);
        map1.put("first_name", "Steven");
        map1.put("last_name", "King");
        map1.put("salary", 24000);

        Map<String, Object> map2=new HashMap<>();

        map1.put("employee_id", 101);
        map1.put("first_name", "Neen");
        map1.put("last_name", "Kochhar");
        map1.put("salary", 17000);

        Map<String, Object> map3=new HashMap<>();

        map1.put("employee_id", 102);
        map1.put("first_name", "Lex");
        map1.put("last_name", "De Haan");
        map1.put("salary", 17000);

        table.add(map1);
        table.add(map2);
        table.add(map3);

    }
}
