/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carlot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AlexC
 */
public class DBConnection {
     //private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static Connection connection = null;
    private static final String CONNECTION_STRING  = "jdbc:mysql://localhost/carlot";
    private static final String USERNAME = "scott";
    private static final String PASSWORD = "tiger";
    
    public static void dbConnect() throws SQLException, ClassNotFoundException{
        try{
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        }catch (SQLException e) {
            System.out.println("Connection Failed. Check output console." + e);
            throw e;
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
