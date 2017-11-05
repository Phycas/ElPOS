/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElPOS.GUI;

import ElPOS.DB.MaquetaDatos;
import ElPOS.Logica.Persona;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author Phycas
 */
public class MainMenu extends javax.swing.JFrame{

    /**
     * Creates new form MainMenu
     */
   private Persona usuario;
    public MainMenu(MaquetaDatos datos, Persona user) {
        Persona usuario = new Persona();
        this.setUndecorated(true);
        
        //configurarGUI();
        addWindowListener(new WindowAdapter() {

                    @Override
                    public void windowClosing(WindowEvent e) {
                    salir();
                }
               }); //alfin
        
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        desktopPane = new javax.swing.JDesktopPane();
        escritorio = new javax.swing.JDesktopPane();
        helpButton = new javax.swing.JButton();
        msn = new javax.swing.JLabel();
        saludoLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        productosLabel = new javax.swing.JLabel();
        historialLabel = new javax.swing.JLabel();
        zLabel = new javax.swing.JLabel();
        cajaLabel = new javax.swing.JLabel();
        bodegasLabel = new javax.swing.JLabel();
        tiendasLabel1 = new javax.swing.JLabel();
        minLabel = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        helpButton.setText("?");

        escritorio.setLayer(helpButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(msn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(1080, Short.MAX_VALUE)
                .addComponent(helpButton)
                .addGap(20, 20, 20))
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(msn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(526, Short.MAX_VALUE)
                .addComponent(msn)
                .addGap(18, 18, 18)
                .addComponent(helpButton)
                .addContainerGap())
        );

        desktopPane.add(escritorio);
        escritorio.setBounds(0, 80, 1140, 580);

        saludoLabel.setText("Hola, username.");
        desktopPane.add(saludoLabel);
        saludoLabel.setBounds(978, 10, 120, 14);

        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        desktopPane.add(jLabel2);
        jLabel2.setBounds(1120, 15, 6, 10);

        productosLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        productosLabel.setText("Productos");
        productosLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productosLabelMouseClicked(evt);
            }
        });
        desktopPane.add(productosLabel);
        productosLabel.setBounds(20, 30, 110, 30);

        historialLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        historialLabel.setText("Historial");
        historialLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historialLabelMouseClicked(evt);
            }
        });
        desktopPane.add(historialLabel);
        historialLabel.setBounds(580, 30, 100, 30);

        zLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        zLabel.setText("Cierre Z");
        zLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zLabelMouseClicked(evt);
            }
        });
        desktopPane.add(zLabel);
        zLabel.setBounds(230, 30, 90, 30);

        cajaLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        cajaLabel.setText("Caja");
        cajaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cajaLabelMouseClicked(evt);
            }
        });
        desktopPane.add(cajaLabel);
        cajaLabel.setBounds(150, 30, 50, 30);

        bodegasLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        bodegasLabel.setText("Bodegas");
        bodegasLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bodegasLabelMouseClicked(evt);
            }
        });
        desktopPane.add(bodegasLabel);
        bodegasLabel.setBounds(350, 30, 100, 30);

        tiendasLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tiendasLabel1.setText("Tiendas");
        tiendasLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tiendasLabel1MouseClicked(evt);
            }
        });
        desktopPane.add(tiendasLabel1);
        tiendasLabel1.setBounds(470, 30, 100, 30);

        minLabel.setText("_");
        minLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minLabelMouseClicked(evt);
            }
        });
        desktopPane.add(minLabel);
        minLabel.setBounds(1100, 10, 10, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        salir();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void cajaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaLabelMouseClicked
        // TODO add your handling code here:
        mostrarCaja();
    }//GEN-LAST:event_cajaLabelMouseClicked

    private void productosLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosLabelMouseClicked
        mostrarProductos();
    }//GEN-LAST:event_productosLabelMouseClicked

    private void minLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minLabelMouseClicked
      this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minLabelMouseClicked

    private void zLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zLabelMouseClicked
        mostrarZ();
    }//GEN-LAST:event_zLabelMouseClicked

    private void bodegasLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bodegasLabelMouseClicked
        mostrarBodegas();
    }//GEN-LAST:event_bodegasLabelMouseClicked

    private void tiendasLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiendasLabel1MouseClicked
        mostrarTiendas();
    }//GEN-LAST:event_tiendasLabel1MouseClicked

    private void historialLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historialLabelMouseClicked
        mostrarHistorial();
    }//GEN-LAST:event_historialLabelMouseClicked

    /**
     * @param args the command line arguments
     */
    public void mostrar(MaquetaDatos datos, Persona user) {
        usuario = user;
        configurarGUI(user);
       // configurarGUI(user);
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainMenu menu = new MainMenu(datos, user);
                menu.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                saludoLabel.setText("error");
                
                menu.setVisible(true);
                 
                  }
        });
        
    }
    
    private void configurarGUI(Persona user){
        try{
        saludoLabel.setText(usuario.getNombre());
        } catch(Exception ex){
            saludoLabel.setText("error");
            mostrarError(ex);
        }
    }
    
    private void actualizarMaqueta(){
        
    }
    
    private void mostrarHistorial(){
         HistorialGestion hForm = new HistorialGestion();
        escritorio.add(hForm);
        
        Dimension escrSize = escritorio.getSize();
        Dimension salSize = hForm.getSize();
         int width = (escrSize.width - salSize.width) / 2;
         int height = (escrSize.height - salSize.height) / 2;
        hForm.setLocation(width, height);
                
        hForm.show();
        try{
        saludoLabel.setText(usuario.getNombre());
        } catch(Exception ex){
            saludoLabel.setText("error");
            mostrarError(ex);
        }
    }
    
    private void mostrarTiendas(){
         TiendasGestion prodForm = new TiendasGestion();
        escritorio.add(prodForm);
        
        Dimension escrSize = escritorio.getSize();
        Dimension salSize = prodForm.getSize();
         int width = (escrSize.width - salSize.width) / 2;
         int height = (escrSize.height - salSize.height) / 2;
        prodForm.setLocation(width, height);
                
        prodForm.show();
        
    }
    
    private void mostrarProductos(){
         ProductosGestion prodForm = new ProductosGestion();
        escritorio.add(prodForm);
        
        Dimension escrSize = escritorio.getSize();
        Dimension salSize = prodForm.getSize();
         int width = (escrSize.width - salSize.width) / 2;
         int height = (escrSize.height - salSize.height) / 2;
        prodForm.setLocation(width, height);
                
        prodForm.show();
        
    }
    
    private void mostrarZ(){
         Zform zForm = new Zform();
        escritorio.add(zForm);
        
        Dimension escrSize = escritorio.getSize();
        Dimension salSize = zForm.getSize();
         int width = (escrSize.width - salSize.width) / 2;
         int height = (escrSize.height - salSize.height) / 2;
        zForm.setLocation(width, height);
                
        zForm.show();
        
    }
    
    private void mostrarBodegas(){
         BodegasGestion bForm = new BodegasGestion();
        escritorio.add(bForm);
        
        Dimension escrSize = escritorio.getSize();
        Dimension salSize = bForm.getSize();
         int width = (escrSize.width - salSize.width) / 2;
         int height = (escrSize.height - salSize.height) / 2;
        bForm.setLocation(width, height);
                
        bForm.show();
        
    }
    
    private void mostrarCaja(){
        VentasGestion cajaForm = new VentasGestion();
        escritorio.add(cajaForm);
        
        Dimension escrSize = escritorio.getSize();
        Dimension salSize = cajaForm.getSize();
         int width = (escrSize.width - salSize.width) / 2;
         int height = (escrSize.height - salSize.height) / 2;
        cajaForm.setLocation(width, height);
                
        cajaForm.show();
        
    }
    
    
    private void salir(){
        SalirInternalForm salirForm = new SalirInternalForm();
        escritorio.add(salirForm);
        
        Dimension escrSize = escritorio.getSize();
        Dimension salSize = salirForm.getSize();
         int width = (escrSize.width - salSize.width) / 2;
         int height = (escrSize.height - salSize.height) / 2;
        salirForm.setLocation(width, height);
                
        salirForm.show();
    }
    public void mostrarError(String error){
        JOptionPane.showMessageDialog(this,
    error);
    }
    
    public void mostrarError(Exception error){
        JOptionPane.showMessageDialog(this,
    error);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bodegasLabel;
    private javax.swing.JLabel cajaLabel;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel historialLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel minLabel;
    private javax.swing.JLabel msn;
    private javax.swing.JLabel productosLabel;
    private javax.swing.JLabel saludoLabel;
    private javax.swing.JLabel tiendasLabel1;
    private javax.swing.JLabel zLabel;
    // End of variables declaration//GEN-END:variables

}
