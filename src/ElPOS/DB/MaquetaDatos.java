package ElPOS.DB;

import ElPOS.Logica.Permisos;
import ElPOS.Logica.Persona;
import ElPOS.Logica.Rut;
import java.awt.List;
import java.util.ArrayList;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

/**
 *
 * @author Phycas
 */
public class MaquetaDatos {
    public ArrayList<Persona> Personas;
    
    public MaquetaDatos(){
         //Personas
    Personas = new ArrayList<Persona>();
    
    Rut tempR;
    tempR = new Rut(18148332,"6");
    Persona phs = new Persona("phycas", "123456", "Phycas", 
            "El Increíble",
            "Gran Amo y Señor", tempR, 
            new Permisos(1,1,1,1,1));
    
    tempR = new Rut(19158543,"9");
    Persona p2 = new Persona("phil", "123456", "Phil", 
            "Truename",
            "Un esclavo más", tempR, 
            new Permisos(1,0,0,0,0));
    tempR = new Rut(99999999,"9");
    Persona p3 = new Persona("vader", "123456", "Vader", 
            "Skywalker",
            "Sith Lord", tempR, 
            new Permisos(1,0,0,0,0));
    Personas.add(phs);
    Personas.add(p2);
    Personas.add(p3);

    //Tiendas
    //Bodegas
    //Productos
   
    }
    public MaquetaDatos(MaquetaDatos ma){
        this.Personas = ma.Personas;
    }
   
    public void configurar(){
         //Personas
    Personas = new ArrayList<Persona>();
    
    Rut tempR;
    tempR = new Rut(18148332,"6");
    Persona phs = new Persona("phycas", "123456", "Phycas", 
            "El Increíble",
            "Gran Amo y Señor", tempR, 
            new Permisos(1,1,1,1,1));
    
    tempR = new Rut(19158543,"9");
    Persona p2 = new Persona("phil", "123456", "Phil", 
            "Truename",
            "Un esclavo más", tempR, 
            new Permisos(1,0,0,0,0));
    Personas.add(phs);
    Personas.add(p2);

    //Tiendas
    //Bodegas
    //Productos
   
    }
    
    public ArrayList<Persona>getPersonas(){
        return Personas;
    }
    
    
}
