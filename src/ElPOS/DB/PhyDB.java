/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package ElPOS.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PhyDB {

	public static void test(String[] args) {
		// TODO Auto-generated method stub
		try{
			postToDB();
		}catch (Exception ex)
		{
			System.out.println(ex);
		}
		
	}

        //revisar y despues borrar
	public static void postToDB() throws Exception{
		try{
			Connection conn = getConnection(); //esto no está muy bien... pasar a objeto?
			//Preparando la query
			PreparedStatement posted = conn.prepareStatement("");// la query va en la string 
			posted.executeUpdate();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
	}
	
	//limpiar
	public static Connection getConnection() throws Exception{
		try{
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/elgranpos";
		String username = "root";
		String password = "";
		Class.forName(driver); Connection conn = DriverManager.getConnection(url,username,password);
		//System.out.println("Connected");
		return conn;
		} catch(Exception e){
                    System.out.println(e);
                } 
                return null;
                
	}
	
}
