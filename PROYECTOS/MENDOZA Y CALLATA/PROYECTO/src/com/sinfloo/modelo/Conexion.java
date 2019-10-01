package com.sinfloo.modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
    String url="jdbc:mysql://localhost:3307/bd_crud";
    String user,pass="12345678";    
    Connection con;

    public Conexion() {
        this.user = "Michelin";
    }
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } catch (ClassNotFoundException | SQLException e) {            
        }
        return con;
    }
}
