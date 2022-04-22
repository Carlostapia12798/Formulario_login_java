
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class LogicaProductos {
   
    public DefaultTableModel mostrarDatosProductos(){
    String [] columnas = {"IdProductos","nombre","marca","categoria","precio","cantidad"}; //se crea un arreglo con los nombres de las columnas
    String [] datos = new String[6];   //se crea otro arreglo donde se van a ir almacenando los registros con 5 posiciones en la columnas
    
    DefaultTableModel modelo = new DefaultTableModel(null,columnas);
    
    String consulta = "select * from Productos"; //se crea variable con el codigo sql a ejecutar
    
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try{
        //establece la conexion y un codigo a ejecutar sql
        ps = Conexion.getconnection().prepareStatement(consulta); 
        rs = ps.executeQuery(); //aca se ejecuta todo el codigo y lo trae
        
        //se van iterando los valores que este encontrando en las posiciones por eso esta dentro de un bucle while
        while(rs.next()){
        datos[0] = rs.getString("IdProductos");
        datos[1] = rs.getString("nombre");
        datos[2] = rs.getString("marca");
        datos[3] = rs.getString("categoria");
        datos[4] = rs.getString("precio");
        datos[5] = rs.getString("cantidad");
        modelo.addRow(datos);//luego de recorrer las posiciones se va a agregar en la variable modelo una nueva fila
        }  
    }catch (SQLException e) {
            
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "error al actualizar");
        } 
    return modelo;
    }
    
    
    //datos de registro
    public DefaultTableModel mostrarDatos(){
    String [] columnas = {"idUsuario ","NombreUsuario ","Nombre ","Apellido ","Telefono ","Correo ","Pasword "}; //se crea un arreglo con los nombres de las columnas
    String [] datos = new String[7];   //se crea otro arreglo donde se van a ir almacenando los registros con 5 posiciones en la columnas
    
    DefaultTableModel modelo = new DefaultTableModel(null,columnas);
    
    String consulta = "select * from Registro"; //se crea variable con el codigo sql a ejecutar
    
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try{
        //establece la conexion y un codigo a ejecutar sql
        ps = Conexion.getconnection().prepareStatement(consulta); 
        rs = ps.executeQuery(); //aca se ejecuta todo el codigo y lo trae
        
        //se van iterando los valores que este encontrando en las posiciones por eso esta dentro de un bucle while
        while(rs.next()){
        datos[0] = rs.getString("idUsuario");
        datos[1] = rs.getString("NombreUsuario");
        datos[2] = rs.getString("Nombre");
        datos[3] = rs.getString("Apellido");
        datos[4] = rs.getString("Telefono");
        datos[5] = rs.getString("Correo");
        datos[6] = rs.getString("Pasword");
        modelo.addRow(datos);//luego de recorrer las posiciones se va a agregar en la variable modelo una nueva fila
        }  
    }catch (SQLException e) {
            
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "error al actualizar");
        } 
    return modelo;
    }
    
    //------------------------------------------------------------------------------------------------
    
    
}
