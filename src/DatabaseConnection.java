/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package Project;
import java.sql.*;
/**
 *
 * @author acer
 */

public class DatabaseConnection {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/QuizDB", "root", "P00j@123");
            return con;
        }
        catch (Exception e) {
            return null;
        }
    }
    public static void main(String[] args) {
        Connection con = getCon();
        if (con != null) {
            System.out.println("Connection successful!");
        } else {
            System.out.println("Connection failed.");
        }
    }
}



/**
 *
 * @author DELL
 */
