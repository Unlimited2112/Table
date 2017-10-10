/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Connect
{

    String driver = "jdbc:ucanaccess://";
    Connection connection;
    private static volatile Connect instance = null;

    // private constructor
    private Connect()
    {
    }

    public Connect(String databasePath)
    {
        try
        {
            connection = DriverManager.getConnection(driver + databasePath);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static Connect getInstance()
    {
        if (instance == null)
        {
            synchronized (Connect.class)
            {
                instance = new Connect();
            }
        }
        return instance;
    }
}
