/*
Esta clase gestiona la informacion de la tabla personas
 */
package ElPOS.Logica;

import static ElPOS.DB.Personas.crearPersona;
import static ElPOS.DB.Personas.getTabla;
import static ElPOS.DB.Personas.registrarADIOS;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Phycas
 */
public class PersonasGestion {
    
    public static void ingresarPersona(String u, String p, String n, String a, String m,
            String c, Rut r, Permisos permi) throws Exception{
        Persona persona = new Persona(u,p,n,a,m,c,r,permi);
        
        //comprobar rut
        //comprobar que usuario no se repite en la DB
        
        try{
        crearPersona(persona);
        } catch(Exception ex){
            throw new Exception("Error de datos");
        }
    }
    
    //TableModel con datos de tabla personas
    public static DefaultTableModel buildTableModel()
        throws SQLException {

    ResultSet rs = getTabla();
    ResultSetMetaData metaData = rs.getMetaData();

    // guardar los nombres de las columnas
    Vector<String> columnNames = new Vector<String>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
        columnNames.add(metaData.getColumnName(column));
    }

    // guardar datos de la tabla
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    while (rs.next()) {
        Vector<Object> vector = new Vector<Object>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
    }

    return new DefaultTableModel(data, columnNames);

}
    
    
    public static void ingresarPersona(Persona p){
        
    }
    
    public static void regDios(){
        registrarADIOS();
    }
    
}
