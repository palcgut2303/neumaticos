/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Factura;
import Modelo.Linea_Factura;
import Modelo.Neumatico;
import Modelo.Precio;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author manana
 */
public class Controlador {
    
    private static final String db = "neumaticos";
    private static final String url = "jdbc:mysql://localhost/";
    private static final String sDriver = "com.mysql.cj.jdbc.Driver";
    private Connection conn = null;
    private static final String db_user = "root";
    private static final String db_pw = "";
    Statement stmt = null;
    
    public java.sql.Connection getConexion() {
        return (java.sql.Connection) conn;
    }

    public boolean close() throws IOException, SQLException {

        if (conn != null) {
            conn.close();
            return true;
        }
        return false;
    }

    public boolean conectar() {
        try {
            conn = (Connection) DriverManager.getConnection(url + db, db_user, db_pw);
            return true;
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
        return false;
    }
    
    public boolean altaNeumaticos(int cod, String marca, String modelo,int ancho, String perfil,double precio) {
        boolean b = true;
        String query;
        
        query = "INSERT INTO `neumatico` (`cod`,`marca`,`modelo`,`ancho`,`perfil`,`precio`) VALUES ( '" + cod + "', '" + marca + "', '" + modelo + "', '" + ancho + "', '" + perfil + "', '"+ precio+"')";

        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            b = true;
            
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return b;
    }
    
    public ArrayList<Neumatico> listarNeumaticos() {

        
        ArrayList<Neumatico> lista = new ArrayList<>();

        try {

            stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM neumatico");

            while (resultSet.next()) {
                Neumatico miNeumatico = new Neumatico();

                miNeumatico.setCodigo(resultSet.getString("cod"));

                miNeumatico.setMarca(resultSet.getString("marca"));

                miNeumatico.setModelo(resultSet.getString("modelo"));

                miNeumatico.setAncho(resultSet.getInt("ancho"));
                
                miNeumatico.setPerfil(resultSet.getString("perfil"));
                
                miNeumatico.setPrecio(resultSet.getDouble("precio"));
                
                lista.add(miNeumatico);
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        return lista;
    }
    
    public boolean modificarNeumaticos(String codigo, String marca, String modelo,int ancho,String perfil,double precio) {
        boolean b = true;
        String query;

        query = "UPDATE neumatico set marca= ?, modelo= ?, ancho= ?, perfil = ?, precio= ? WHERE cod= ?";
        try {

            PreparedStatement prStmt = conn.prepareStatement(query);
            prStmt.setString(1, marca);
            prStmt.setString(2, modelo);
            prStmt.setInt(3, ancho);
            prStmt.setString(4, perfil);
            prStmt.setDouble(5, precio);
            prStmt.setString(6, codigo);
            
            int filasAfectadas = prStmt.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Actualización exitosa. Filas afectadas: " + filasAfectadas);
            } else {
                System.out.println("No se realizaron cambios.");
            }

            // Cierra la conexión y los recursos
            prStmt.close();
            conn.close();
            b = true;
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        return b;
    }
    
    public ArrayList<String> listarNIF(){
        
        ArrayList<String> listaNIF = new ArrayList<>();
        
        try {

            stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT nif FROM cliente");

            while (resultSet.next()) {
                String NIF; 
                 NIF = resultSet.getString("nif");
                listaNIF.add(NIF);
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        
        return listaNIF;
    }
    
    /*public ArrayList<String> rellenarDatos(String nif){
        
        ArrayList<String> lista = new ArrayList<>();
        
        try {
            stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT nif FROM cliente");
            
            
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        
        
        
        return lista;
    }*/
    
    public ArrayList<String> listarCodNeumaticos(){
        
        ArrayList<String> listaCod = new ArrayList<>();
        
        try {

            stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT cod FROM neumatico");

            while (resultSet.next()) {
                String Codigo; 
                 Codigo = resultSet.getString("cod");
                listaCod.add(Codigo);
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        
        return listaCod;
    }
    
    public String generarMarcaNeumaticos(String codigo){
        String marca = ""; 
        try {
            stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT marca FROM neumatico where cod="+codigo);

            while (resultSet.next()) {
               // String marca; 
                marca = resultSet.getString("marca");
            }
        }catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return marca;
    }
    
    public double generarPrecioNeumatico(String codigo){
        double precio = 0; 
        try {
            stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT precio FROM neumatico where cod="+codigo);

            while (resultSet.next()) {
               // String marca; 
                precio = resultSet.getDouble("precio");
            }
        }catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return precio;
    }
    
    public int numeroFacturas(){
        
        int contador;
        
        ArrayList<Integer> listaFactura = new ArrayList<>();
        
        try {

            stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT numFactura FROM factura");

            while (resultSet.next()) {
                int numFac; 
                 numFac = resultSet.getInt("numfactura");
                listaFactura.add(numFac);
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        contador = listaFactura.size()+1;
        
        return contador;
    }

    public boolean insertarFactura(int numFactura,String nifCliente,String nifEmisor,String fechaSistema,double base,double iva,double total,int pagada,String numCuenta){
         boolean b = true;
        String query;
        
        query = "INSERT INTO `factura` (`numfactura`,`nifcliente`,`nifemisor`,`fechasistema`,`base`,`iva`,`total`,`pagada`,`numcuenta`) "
                + "VALUES ( '" + numFactura + "', '" + nifCliente + "', '"+ nifEmisor + "', '" + fechaSistema 
                + "', '" + base + "', '"+ iva+"','"+total+"', '"+ pagada+"', '"+ numCuenta+"')";

        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            b = true;
            
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return b;
        
        
        
    }
    
    public ArrayList<Factura> listarFacturas(){
        ArrayList<Factura> lista = new ArrayList<>();

        try {

            stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM factura");

            while (resultSet.next()) {
                Factura miFactura = new Factura();

                miFactura.setNumFactura(resultSet.getInt("numfactura"));

                miFactura.setNifCliente(resultSet.getString("nifcliente"));

                miFactura.setNifEmisor(resultSet.getString("nifemisor"));

                miFactura.setFechaSistema(resultSet.getString("fechasistema"));
                
                miFactura.setPrec_base(resultSet.getDouble("base"));
                
                miFactura.setIva(resultSet.getDouble("iva"));
                
                miFactura.setPrec_total(resultSet.getDouble("total"));
                
                miFactura.setNum_Cuenta(resultSet.getString("numcuenta"));
                
                lista.add(miFactura);
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        return lista;
        
    }
    
    public String listarNumCuenta(String numFactura){
        String numCuenta= "";
        
        try {
            stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT numcuenta FROM factura where numfactura= '" + numFactura +  "'");
            
            while (resultSet.next()) {
               // String marca; 
                numCuenta = resultSet.getString("numcuenta");
            }
            
            
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        
        return numCuenta;
    }
    
    
    public int numeroLineaFactura(){
        
        int contador;
        
        ArrayList<Integer> listaNumLinea = new ArrayList<>();
        
        try {

            stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT numlinea FROM linea_factura");

            while (resultSet.next()) {
                int numLinea; 
                numLinea = resultSet.getInt("numlinea");
                listaNumLinea.add(numLinea);
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        contador = listaNumLinea.size()+1;
        
        return contador;
    }
    
   public boolean insertarLineaFactura(int numFactura,int codNeumatico,String concepto, int numNeumaticos,double precio){
       boolean esCorrecto = false;
       
       conectar();
       int numLinea = numeroLineaFactura();
       
       String query = "INSERT INTO `linea_factura` (`numlinea`,`numfactura`,`codneumatico`,`concepto`,`numneumaticos`,`precio`) VALUES ( '"+ numLinea +"','"+numFactura+"','"+codNeumatico+"','"+concepto+"','"+numNeumaticos+"','"+precio+"')";
       
       try {
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            esCorrecto = true;
           
           
       } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
       return esCorrecto;
   }
   
   public ArrayList<Linea_Factura> listarLinea(String numFactura){
       
        ArrayList<Linea_Factura> listarLinea = new ArrayList<>();
       
        String query = "SELECT numneumaticos,concepto,precio from linea_Factura where numfactura= '" + numFactura +  "'";
        
       try {
           stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);
           
           while (resultSet.next()) {
               Linea_Factura miLinea = new Linea_Factura();
               
               miLinea.setNumNeumatico(resultSet.getInt("numneumaticos"));
               miLinea.setConcepto(resultSet.getString("concepto"));
               miLinea.setPrecio(resultSet.getDouble("precio"));
               
               listarLinea.add(miLinea);
           }
           
       } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
       
       
       return listarLinea;
   }
   
   public ArrayList<Precio> listarPrecio(String numFactura){
       
       ArrayList<Precio> listarPrecio = new ArrayList<>();
       
       String query = "SELECT base, iva, total from factura where numfactura= '" + numFactura +  "'";
       try {
            stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);
            
            while(resultSet.next()){
                Precio misPrecios = new Precio();
                misPrecios.setPrec_base(resultSet.getDouble("base"));
                misPrecios.setIva(resultSet.getDouble("iva"));
                misPrecios.setPrec_total(resultSet.getDouble("total"));
                
                listarPrecio.add(misPrecios);
            }
           
           
       } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
       return listarPrecio;
   }
   
   public int numeroUsuarios(){
        
        int contador;
        
        ArrayList<String> listaUsuarios = new ArrayList<>();
        
        try {

            stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT usuario FROM usuario");

            while (resultSet.next()) {
                String numLinea; 
                numLinea = resultSet.getString("usuario");
                listaUsuarios.add(numLinea);
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        contador = listaUsuarios.size()+1;
        
        return contador;
    }
   
   
   public boolean insertarUsuarios(String usuario,String contraseña){
       boolean esCorrecto = false;
       
       conectar();
       int codigo = numeroUsuarios();
       String query = "INSERT INTO `usuario` (`codigo`,`usuario`,`contrasena`) VALUES ( '"+ codigo +"','"+usuario+"','"+contraseña+"')";
       
       try {
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            esCorrecto = true;
           
           
       } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
       return esCorrecto;
   }
   
   public boolean comprobarUsuario(String usuario,String contraseña){
        boolean esCorrecto = false;
       
       conectar();
       
       String query = "SELECT * FROM usuario where usuario= '"+usuario+"' AND contrasena= '"+contraseña+"'";
       
       try {
            stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);

            while (resultSet.next()) {
                esCorrecto = true;
            }
           
           
       } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
       return esCorrecto;
   }
}
