
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
    
    public Permisos(){
       admin = false; 
       ventas = false; 
       bodega = false;
       historial = false; 
       productos = false;
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

    public void setPermisos(String p){
        String[] permi = p.split(",");
        int[] nums = new int[permi.length];
        for(int x = 0 ; x > permi.length; x++){
            nums[x] = Integer.parseInt(permi[x]);
        }
        
       this.admin = (nums[0] == 1); 
       this.ventas = (nums[1] == 1); 
       this.bodega = (nums[2] == 1);
       this.historial = (nums[3] == 1); 
       this.productos = (nums[4] == 1);
    }
    
    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isVentas() {
        return ventas;
    }

    public void setVentas(boolean ventas) {
        this.ventas = ventas;
    }

    public boolean isBodega() {
        return bodega;
    }

    public void setBodega(boolean bodega) {
        this.bodega = bodega;
    }

    public boolean isHistorial() {
        return historial;
    }

    public void setHistorial(boolean historial) {
        this.historial = historial;
    }

    public boolean isProductos() {
        return productos;
    }

    public void setProductos(boolean productos) {
        this.productos = productos;
    }
    
}
