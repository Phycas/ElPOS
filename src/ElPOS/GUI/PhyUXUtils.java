/*
 Phycas 16/11/2017
 */
package ElPOS.GUI;

import javax.swing.JOptionPane;

/**
 * @version 0.01a
 * @author Phycas
 */
public class PhyUXUtils {
   
   //Declaracion de variables
    //Metodos para mensajes
   public void mostrarError(Exception error){
        JOptionPane.showMessageDialog(null,error);
    }
    
    public void dialogo(String error){
        JOptionPane.showMessageDialog(null,
    error);
    }
}
