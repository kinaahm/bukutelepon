/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukutelepon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sakinah
 */
public class koneksi {
    
 private static Connection mysqlkonek;
 public static Connection koneksiDB() throws SQLException{
 
 if(mysqlkonek==null){
 try {
 String url="jdbc:mysql://localhost:3306/bukutelepon";
 String user="root";
 String pass="";
 
 DriverManager.registerDriver(new com.mysql.jdbc.Driver());
 mysqlkonek = (Connection) DriverManager.getConnection(url,user,pass);
 } catch (Exception e) {
 JOptionPane.showMessageDialog(null,"gagal koneksi");
 }
 }
 return mysqlkonek;
 }
}