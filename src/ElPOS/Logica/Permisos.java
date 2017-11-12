
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
    
    public Permisos(boolean ad, boolean ve, boolean bo, boolean hi, boolean pro){
       admin = ad; 
       ventas = ve; 
       bodega = bo;
       historial = hi; 
       productos = pro;
    }
    
    public String quePermisos()
    {
        StringBuilder permisos = new StringBuilder();
        
        String ad = this.admin ? "1," : "0,";
        String ve = this.ventas ? "1," : "0,";
        String bo = this.bodega ? "1," : "0,";
        String hi = this.historial ? "1," : "0,";
        String pro = this.productos ? "1" : "0";
        
        permisos.append(ad);
        permisos.append(ve);
        permisos.append(bo);
        permisos.append(hi);
        permisos.append(pro);
        
        return permisos.toString();
    }
    
}
