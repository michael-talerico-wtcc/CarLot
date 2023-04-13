/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carlot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
        
        getConnection();
    }
    
    private static void getConnection()throws SQLException, ClassNotFoundException{
        try{
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        }catch (SQLException e) {
            System.out.println("Connection Failed. Check output console." + e);
            throw e;
        }
    }
    
    //DB Execute Query Operation
    public static ResultSet dbExecuteQuery(String queryStmt)throws 
            SQLException, ClassNotFoundException {
          
        try{
            //Conect to DB
            dbConnect();
            
            //Create connection statement and execute query with query statement
            return connection.createStatement().executeQuery(queryStmt);
            
        } catch (SQLException e){
            System.out.println("Problem occurred at executeQuery operation : " + e);
            throw e;
        }
    }
    
    //DB Execute Update (For Update/Insert/Delete) Operation
    public static void dbExecuteUpdate(String sqlStmt) throws 
            SQLException, ClassNotFoundException {
        
        try{
            //Donnec to DB
            dbConnect();
            
            //Create connection statement and run executeUpdate with sql statement
            connection.createStatement().executeUpdate(sqlStmt);
            
        } catch (SQLException e){
            System.out.println("Problem occurred at executeUpdate operation : " + e);
            throw e;
        }
        
    }
}
