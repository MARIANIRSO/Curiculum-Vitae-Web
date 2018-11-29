package com.proyecto.web.dao;

import com.proyecto.web.util.PropertiesUntil;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionDB {

    private Connection conn;
    String driver;
    String url;
    String usuario;
    String pass;

    public ConexionDB(String driver, String url, String usuario, String pass) {
        this.driver = PropertiesUntil.getPropiedad("db.driver");
        this.url = PropertiesUntil.getPropiedad("db.url");
        this.usuario = PropertiesUntil.getPropiedad("db.usuario");
        this.pass = PropertiesUntil.getPropiedad("db.pass");
        
    }
    
    public Connection getConexion() throws SQLException{
    try{
        Class.forName(this.driver);
        conn=DriverManager.getConnection(this.url,this.usuario,this.pass);
          }catch(ClassNotFoundException ex){
              System.out.println("ERROR"+ex.getMessage());
              
          } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
return conn;
}
    public void desconectar() throws SQLException{
        if(conn!= null){
            conn.close();                    
        }
    }
}
