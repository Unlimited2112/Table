/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aavhimovich
 */
public class Connect 
{
    static String s1 = "jdbc:ucanaccess://";
    static String s4 = "D:/Database2.mdb";
    static Connection connection;

    public static void connectToDB() {
        //database connection
        try {
            connection = DriverManager.getConnection(s1 + s4);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //end of database connection
    }
}