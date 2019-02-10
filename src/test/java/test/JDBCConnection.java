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

//Statement statement=connection.createStatement();
Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
ResultSet resultSet=statement.executeQuery("select * from countries");

//resultSet.next();
//
//System.out.println(resultSet.getString("country_name"));
//System.out.println(resultSet.getString(1));
//System.out.println(resultSet.getString("region_id"));




        while(resultSet.next()) {

            System.out.println(resultSet.getString(1)+"-"+resultSet.getString("region_id")+"-"+(resultSet.getString("country_name")));


        }

        resultSet.first();
        System.out.println(resultSet.getRow());

        /**
         * RESULTSET methods
         *
         * next()-> moves to next row
         * getObject(colname/index)-> will get everything from that column (getString will get if it is only string)
         * last()--> goes to last row
         * getRow->gets current row number
         * first()-->goes to first row
         */


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
