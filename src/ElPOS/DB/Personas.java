/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package ElPOS.DB;

import static ElPOS.DB.PhyDB.getConnection;
import ElPOS.Logica.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Phycas
 */
public class Personas {
    
    //ver si X persona existe en la DB
    public static boolean existe(String user, String pass){
        boolean esreal = false;
        
        // terminar
   
        return esreal;
    }
    
    //Ingresar una persona a la tabla personas
    public static void crearPersona(Persona p)throws Exception{
		try{
			Connection conn = getConnection(); 
			//Preparando la query
                            //WIP
                            // https://alvinalexander.com/java/java-mysql-insert-example-preparedstatement
                        String query = "INSERT INTO personas"//hacer esta parte con string builder
                                + " (usuario, pass, nombre, apellido, rut, permisos, mail, cargo)"
                                + " VALUES('"+p.getUser()+"', '"+p.getPass()+"', '"+p.getNombre()+"',"
                                + " '"+p.getApellido()+"', '"+p.getRut().getRut()+"', '"+p.getPermisos().quePermisos()
                                +"', '"+p.getMail()+"', '"+p.getCargo()+"')";
                        
                        
			PreparedStatement posted = conn.prepareStatement(query);// la query va en la string 
			posted.executeUpdate();
		}
		catch(Exception ex)
		{
			throw new Exception("Error al ejecutar la query, contacte a IT"); //cambiar por mensaje
		}
    }
    
    public static void editPerson(Persona p){
       
    }
    
    public static ResultSet buscarPersonaU(String user)throws Exception{
        StringBuilder query = new StringBuilder();
        Persona pers = new Persona();
        query.append("SELECT * FROM personas WHERE usuario=phycas");
        query.append(user);
        query.append(";");
        
        ResultSet rs = null;
        try{
            Connection con = PhyDB.getConnection();
            Statement sta = con.createStatement();
            rs = sta.executeQuery(query.toString());
	}catch(Exception ex)
		{
			throw new Exception("Error al ejecutar la query, contacte a IT");
		}
        
        
        return rs;
        
    }
    
    
    public static ResultSet getTabla(){
        ResultSet rs = null;
        String query = "SELECT * FROM personas";
        try {
            Connection con = PhyDB.getConnection();
            Statement sta = con.createStatement();
            rs = sta.executeQuery(query);
        } catch (Exception ex){
            //Codigo error
        }
        
        return rs;
    }
    
    //Este metodo sirve para registrar a dios en la base de datos
    public static void registrarADIOS(){
        /*
        testeando
        */
        Persona user = new Persona();
        try{
        crearPersona(user);
        } 
        catch(Exception ex){
           //poner un mensaje mostrando el error
            }
        /*
        fin
        */
    }
    
}
