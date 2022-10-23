/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Sergio
 */
public class Conexion {
    // Para establecer la conexión con la base de datos tenemos que seguir la siguiente estructura: jdbc:mysql://[host][:puerto]/[DB]
    private String host;
    private String port;
    private String dbName;
    private String user;
    private String pass;
    Connection conex;
    public Conexion(String host, String puerto, String dbName, String user, String pass) {
        this.host = host;
        this.port = puerto;
        this.dbName = dbName;
        this.user = user;
        this.pass = pass;
    }

// Para usarlo con MariaDB en una base de datos local llamada javanet  -> Connnection conex = new Conexion("localhost","3306","javanet","javanet","1234qwerty").makeconnect();
    
    public Connection makeConnect(){
        try{
            String url="jdbc:mariadb://"+this.host+":"+this.port+"/"+this.dbName;
            Connection conex = DriverManager.getConnection(url, this.user, this.pass);
            return conex;
        }catch(SQLException ex){
            System.out.println("Error al establecer la conexion "+ex.getMessage());
            return null;
        }
        
    }
    public void closeConnect(Connection con){
        try {
            // Cerramos posibles conexiones abiertas
            if (con!=null) con.close();    
          } catch (Exception e) {
            System.out.println("Error cerrando conexiones: " + e.toString());
          } 
    }
    
    public ResultSet getSelect(int resultSetType, int resultSetConcurrency, String consulta){
        try {
            Statement st= conex.createStatement(resultSetType, resultSetConcurrency);
            ResultSet rs=st.executeQuery(consulta);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
   
}
