package Forms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;

import javax.swing.JOptionPane;
/**
 *
 * @author josej
 */
public class Conexion {
    // Declaramos los datos de conexion a la bd
    private static final String driver="com.mysql.cj.jdbc.Driver";
    private static final String user="root";
    private static final String pass="1234";
    private static final String url="jdbc:mysql://localhost:3306/primerparcial ?useUnicode=true&"
            + "useJDBCCompliantTimezoneShift=true&useLegacy"
            + "DatetimeCode=false&serverTimezone=UTC";
    
    // Funcion que va conectarse a mi bd de mysql
                    
     public Connection getConnection() {
         
         
        Connection con =null;
        try{
            Class.forName(driver);
            // Nos conectamos a la bd
            con= (Connection) DriverManager.getConnection(url, user, pass);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (con!=null){
                JOptionPane.showMessageDialog(null, "Conexion establecida");
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog( null, "Error de conexion" + e);
        }
         
         
     
        return con; // Retorno el objeto Connection
        
    }                     
}
