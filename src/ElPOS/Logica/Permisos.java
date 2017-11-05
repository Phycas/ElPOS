/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package ElPOS.Logica;

/**
 *
 * @author Phycas
 */
public class Permisos {
    boolean admin;
    boolean ventas;
    boolean bodega;
    boolean historial;
    boolean productos;
    
    public Permisos(int ad, int ve, int bo, int hi, int pro){
        admin = (ad == 1); 
        ventas = (ve == 1); 
       bodega = (bo == 1);
       historial = (hi == 1); 
       productos = (pro == 1);
    }
           
    
}
