/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CINETIX;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Arta
 */
public class koneksi {
    public static Connection getConnection() throws SQLException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver JDBC tidak ditemukan!", e);
        }

        String url = "jdbc:mysql://localhost:3306/cinetix";
        String user ="root";
        String pass = "";
        return DriverManager.getConnection(url,user,pass);

    }
}
