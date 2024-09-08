/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Programador
 */
public class Conexion {
    // urlConexion = jdbc,mysql,localhost,3306,db_empresa
   public final String puerto = "3306";
   public final String bd = "db_empresa";
   public final String urlConexion = String.format( "jdbc:mysql://localhost:%s/%s?serverTimezone=UTC",puerto,bd);
   public final String usuario = "root";
   public final String contra = "Admin@123";
   public final String jdbc = "com.mysql.cj.jdbc.Driver";
   public Connection conexionBD;
   public void abrir_conexion(){
    try{
        // codigo aqui
        Class.forName(jdbc);
        conexionBD = DriverManager.getConnection(urlConexion,usuario,contra);
        System.out.println("Conexion Exitosa :)");
        } catch(ClassNotFoundException | SQLException ex){
            System.out.println("Algo Salio mal :( "+ ex.getMessage());
        }
   }
   public void cerrar_conexion(){
    try{
        // codigo aqui
        conexionBD.close();
        } catch(SQLException ex){
            System.out.println("Algo Salio mal :( "+ ex.getMessage());
        }
   }
}
