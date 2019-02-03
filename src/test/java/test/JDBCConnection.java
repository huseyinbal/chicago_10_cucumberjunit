package test;

import org.junit.Test;

import java.sql.*;

public class JDBCConnection {

    String oracleDbUrl = "jdbc:oracle:thin:@ec2-18-191-158-147.us-east-2.compute.amazonaws.com:1521:xe";
    String oracleDbUsername="hr";
    String oracleDbPassword="hr";


    @Test
    public void oracleJDBC() throws SQLException {

Connection connection= DriverManager.getConnection(oracleDbUrl,oracleDbUsername,oracleDbPassword);

Statement statement=connection.createStatement();
ResultSet resultSet=statement.executeQuery("select * from countries");

resultSet.next();

System.out.println(resultSet.getString("country_name"));
System.out.println(resultSet.getString(1));
System.out.println(resultSet.getString("region_id"));

        resultSet.next();
        System.out.println(resultSet.getString("country_name"));
        System.out.println(resultSet.getString(1));
        System.out.println(resultSet.getString("region_id"));
resultSet.close();
statement.close();
connection.close();
    }

/**
 * JDBC has 3 important classes:
 * 1)Connection-->helps to connect database
 * 2)Statement-->helps write sql query and execute
 * 3)ResultSet-->data that came from database will be stored in ResultSet format
 */

}
