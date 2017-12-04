/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElPOS.GUI;


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
    /*
    Teclas de acceso rapido
        Alt+f4 = Salir
        F1 = Ayuda
        F9 = Personal
    */
    
   
    public MainMenu(Persona user) {
        Persona usuario = new Persona(user);
        this.setUndecorated(true);
        
        
        addWindowListener(new WindowAdapter() {

                    @Override
                    public void windowClosing(WindowEvent e) {
                    salir();
                }
               }); 
        
        initComponents();
        
        //saludoLabel = label esquina superior derecha 
        saludoLabel.setText("Bienvenido, " + user.getNombre() + ".");
        
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
        personalLabel = new javax.swing.JLabel();
        zLabel = new javax.swing.JLabel();
        cajaLabel = new javax.swing.JLabel();
        bodegasLabel = new javax.swing.JLabel();
        tiendasLabel1 = new javax.swing.JLabel();
        minLabel = new javax.swing.JLabel();
        historialLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

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
        saludoLabel.setBounds(950, 10, 120, 16);

        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        desktopPane.add(jLabel2);
        jLabel2.setBounds(1090, 10, 8, 10);

        productosLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        productosLabel.setText("Productos");
        productosLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productosLabelMouseClicked(evt);
            }
        });
        desktopPane.add(productosLabel);
        productosLabel.setBounds(20, 30, 110, 30);

        personalLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        personalLabel.setText("Personal");
        personalLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personalLabelMouseClicked(evt);
            }
        });
        personalLabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                personalLabelKeyTyped(evt);
            }
        });
        desktopPane.add(personalLabel);
        personalLabel.setBounds(680, 30, 100, 30);

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
        minLabel.setBounds(1070, 0, 10, 16);

        historialLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        historialLabel1.setText("Historial");
        historialLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historialLabel1MouseClicked(evt);
            }
        });
        desktopPane.add(historialLabel1);
        historialLabel1.setBounds(580, 30, 100, 30);

        jMenuBar2.setOpaque(false);

        jMenu1.setText("File");

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem11.setText("Ayuda");
        jMenu1.add(jMenuItem11);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem10.setText("Salir");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuBar2.add(jMenu1);

        jMenu4.setText("Funciones");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem3.setText("Productos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem4.setText("Caja");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem5.setText("Cierre Z");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem9.setText("Bodegas");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem7.setText("Tiendas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jMenuItem8.setText("Historial");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        jMenuItem6.setText("Personal");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
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

    private void personalLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personalLabelMouseClicked
        mostarPersonal();
    }//GEN-LAST:event_personalLabelMouseClicked

    private void historialLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historialLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_historialLabel1MouseClicked

    private void personalLabelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_personalLabelKeyTyped
     
    }//GEN-LAST:event_personalLabelKeyTyped

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       mostrarProductos();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        salir();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       mostrarCaja();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        mostrarZ();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        mostrarBodegas();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        mostrarTiendas();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        mostrarHistorial();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        mostarPersonal();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void mostrar(Persona user) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainMenu menu = new MainMenu(user);
                menu.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                menu.setVisible(true);
                 
                  }
        });
        
    }
    
    private void configurarGUI(Persona user){
        try{
        
        } catch(Exception ex){
            
        }
    }
    
    
    
    public void cuf(){
        CrearUsuarioForm uForm = new CrearUsuarioForm();
        mostrarCrearUsuario(uForm);
        
    }
    
    public javax.swing.JDesktopPane getEscritorio(){
        
        return escritorio;
    }
    
    private void mostrarCrearUsuario(CrearUsuarioForm uForm){
        //abrir ventana CrearUsuarioForm
        
        escritorio.add(uForm);
        
        Dimension escrSize = escritorio.getSize();
        Dimension salSize = uForm.getSize();
         int width = (escrSize.width - salSize.width) / 2;
         int height = (escrSize.height - salSize.height) / 2;
        uForm.setLocation(width, height);
                
        uForm.show();
        
    }
    
    private void mostrarEditarUsuario(CrearUsuarioForm uForm){
        
        
        escritorio.add(uForm);
        
        Dimension escrSize = escritorio.getSize();
        Dimension salSize = uForm.getSize();
         int width = (escrSize.width - salSize.width) / 2;
         int height = (escrSize.height - salSize.height) / 2;
        uForm.setLocation(width, height);
                
        uForm.show();
        
    }
    
   private void mostarPersonal(){
       //abrir ventana PersonalGestion
        PersonalGestion perForm = new PersonalGestion(this);
        escritorio.add(perForm);
        
        Dimension escrSize = escritorio.getSize();
        Dimension salSize = perForm.getSize();
         int width = (escrSize.width - salSize.width) / 2;
         int height = (escrSize.height - salSize.height) / 2;
        perForm.setLocation(width, height);
                
        perForm.show();
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
    private javax.swing.JLabel historialLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel minLabel;
    private javax.swing.JLabel msn;
    private javax.swing.JLabel personalLabel;
    private javax.swing.JLabel productosLabel;
    private javax.swing.JLabel saludoLabel;
    private javax.swing.JLabel tiendasLabel1;
    private javax.swing.JLabel zLabel;
    // End of variables declaration//GEN-END:variables

}
