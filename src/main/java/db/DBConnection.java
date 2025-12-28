/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author juan
 */
public class DBConnection {
    
    private static final String URL =
        
    "jdbc:oracle:thin:@sistemadeinventario_high";

    private static final String USER = "usuario_prueba";
    private static final String PASSWORD = "PruebaUsuario2025";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}






