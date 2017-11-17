/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package ElPOS.GUI;

import ElPOS.Logica.Permisos;
import ElPOS.Logica.PersonasGestion;
import ElPOS.Logica.Rut;

/**
 *
 * @author Phycas
 */
public class CrearUsuarioForm extends javax.swing.JInternalFrame {
    private Rut uRut = new Rut();
    /**
     * Creates new form CrearUsuarioForm
     */
    public CrearUsuarioForm() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingresarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        usuarioTF = new javax.swing.JTextField();
        nombreTF = new javax.swing.JTextField();
        passTF = new javax.swing.JTextField();
        apellidoTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rutTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mailTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cargoTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        adminRB = new javax.swing.JRadioButton();
        ventasRB = new javax.swing.JRadioButton();
        bodegaRB = new javax.swing.JRadioButton();
        historialRB = new javax.swing.JRadioButton();
        productosRB = new javax.swing.JRadioButton();
        rutTF2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rutErr = new javax.swing.JLabel();

        ingresarButton.setText("Ingresar");
        ingresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarButtonActionPerformed(evt);
            }
        });

        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        passTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTFActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        rutTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutTFActionPerformed(evt);
            }
        });

        jLabel5.setText("Rut");

        jLabel6.setText("Permisos");

        jLabel7.setText("Mail");

        jLabel8.setText("Cargo");

        adminRB.setText("Admin");

        ventasRB.setText("Ventas");
        ventasRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasRBActionPerformed(evt);
            }
        });

        bodegaRB.setText("Bodega");

        historialRB.setText("Auditoria");

        productosRB.setText("Inventario");

        rutTF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutTF2ActionPerformed(evt);
            }
        });

        jLabel9.setText("-");

        rutErr.setForeground(new java.awt.Color(255, 51, 51));
        rutErr.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ingresarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cargoTF, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rutTF, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rutTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(rutErr))
                            .addComponent(apellidoTF)
                            .addComponent(nombreTF)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(usuarioTF, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mailTF)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adminRB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ventasRB))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bodegaRB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(historialRB))
                            .addComponent(productosRB))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(apellidoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(rutTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(rutErr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(mailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(adminRB)
                    .addComponent(ventasRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bodegaRB)
                    .addComponent(historialRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productosRB)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresarButton)
                    .addComponent(cancelarButton))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTFActionPerformed

    private void ventasRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ventasRBActionPerformed

    private void rutTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutTFActionPerformed
        // comprobar si el rut esta bien
        rutErr.setText("");
        try{
        uRut = new Rut(
                Integer.parseInt(rutTF.getText()), rutTF2.getText());
        } catch (Exception ex){
            rutErr.setText("Rut invalido");
        }
        
    }//GEN-LAST:event_rutTFActionPerformed

    private void rutTF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutTF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutTF2ActionPerformed

    private void ingresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarButtonActionPerformed
        // Intentar ingresar la Persona
        Mensajes mensajes = new Mensajes("editar: ");
        String nombre =  nombreTF.getText();
        String pass = passTF.getText();
        String user = usuarioTF.getText();
        String mail = mailTF.getText();
        String apellido = apellidoTF.getText();
        String cargo = cargoTF.getText();
        
        boolean admin = adminRB.isSelected();
        boolean ventas = ventasRB.isSelected();
        boolean bodega = bodegaRB.isSelected();
        boolean historial = historialRB.isSelected();
        boolean productos = productosRB.isSelected();
         try{
        uRut = new Rut(
                Integer.parseInt(rutTF.getText()), rutTF2.getText());
        } catch (Exception ex){
            rutErr.setText("Rut invalido");
        }
         Permisos permis = new Permisos(admin, ventas, bodega, historial, productos);
        try{
            //(String u, String p, String n, String a, String m,String c, Rut r, Permisos permi)
            PersonasGestion.ingresarPersona(user, pass, nombre, apellido, mail, cargo, uRut, permis);
           mensajes.mostrarError("Usuario creado exitosamente");
        } catch(Exception ex){
            mensajes.mostrarError(ex.getMessage());
        }
        
        dispose();
    }//GEN-LAST:event_ingresarButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        dispose();    
    }//GEN-LAST:event_cancelarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton adminRB;
    private javax.swing.JTextField apellidoTF;
    private javax.swing.JRadioButton bodegaRB;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTextField cargoTF;
    private javax.swing.JRadioButton historialRB;
    private javax.swing.JButton ingresarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mailTF;
    private javax.swing.JTextField nombreTF;
    private javax.swing.JTextField passTF;
    private javax.swing.JRadioButton productosRB;
    private javax.swing.JLabel rutErr;
    private javax.swing.JTextField rutTF;
    private javax.swing.JTextField rutTF2;
    private javax.swing.JTextField usuarioTF;
    private javax.swing.JRadioButton ventasRB;
    // End of variables declaration//GEN-END:variables
}
