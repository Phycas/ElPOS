/*
 Phycas 16/11/2017
 */
package ElPOS.GUI;

import javax.swing.JOptionPane;

/**
 * @version 0.01a
 * @author Phycas
 */
public class PhyUXUtils  extends javax.swing.JInternalFrame{
   
   //Declaracion de variables
    //Metodos para mensajes
   public void mostrarError(Exception error){
        JOptionPane.showMessageDialog(null,error);
    }
   
   public void mostrarError(String error){
        JOptionPane.showMessageDialog(null,error);
    }
    
    public void dialogo(String error){
        JOptionPane.showMessageDialog(null,
    error);
    }
    
    public boolean siNoDialogo(String men) throws Exception{
        boolean sino = true; //default: 0
        //hacer un dialogo para confirmar borrar
        
        return sino;
    }
}
