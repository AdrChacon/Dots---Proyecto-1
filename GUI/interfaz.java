/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.TextField;
import javax.swing.JOptionPane;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author kejor
 */
public class interfaz extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    public interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);//para enviar la pantalla al centro
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        Solisitud = new javax.swing.JButton();
        jLabelIcono = new javax.swing.JLabel();
        nameDO = new javax.swing.JLabel();
        nameTS = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        IP = new javax.swing.JTextField();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setBackground(new java.awt.Color(0, 153, 0));
        jButtonSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(0, 0, 102));
        jButtonSalir.setText("SALIR");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        Solisitud.setBackground(new java.awt.Color(0, 0, 102));
        Solisitud.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Solisitud.setForeground(new java.awt.Color(0, 153, 0));
        Solisitud.setText("ENVIAR SOLISITUD");
        Solisitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolisitudActionPerformed(evt);
            }
        });
        getContentPane().add(Solisitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        jLabelIcono.setIcon(new javax.swing.ImageIcon("C:\\Users\\kejor\\OneDrive\\Documentos\\NetBeansProjects\\dots\\src\\imagenes\\usuario.png")); // NOI18N
        getContentPane().add(jLabelIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        nameDO.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        nameDO.setForeground(new java.awt.Color(0, 153, 0));
        nameDO.setText("DO");
        getContentPane().add(nameDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        nameTS.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        nameTS.setForeground(new java.awt.Color(0, 0, 102));
        nameTS.setText("TS");
        getContentPane().add(nameTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("INGRESE IP:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        IP.setBackground(new java.awt.Color(153, 102, 255));
        IP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        IP.setForeground(new java.awt.Color(0, 0, 0));
        IP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPActionPerformed(evt);
            }
        });
        getContentPane().add(IP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 240, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\kejor\\OneDrive\\Documentos\\NetBeansProjects\\dots\\src\\imagenes\\164075217-black-striped-wallpapers.jpg")); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);//para salir de la pantalla
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void SolisitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolisitudActionPerformed
        
           /* String thisIp = null;
        try {
            thisIp = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException ex) {
            Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println(thisIp);*/
        String Ip=null;
        Ip=(IP.getText());
        System.out.println(Ip);
        /*juedo obj=new juedo();//aqui se ancla la ventana principal con
        obj.setVisible(true);//el juego
        dispose();*/
        
    }//GEN-LAST:event_SolisitudActionPerformed

    private void IPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPActionPerformed
        
    }//GEN-LAST:event_IPActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IP;
    private javax.swing.JButton Solisitud;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JLabel nameDO;
    private javax.swing.JLabel nameTS;
    // End of variables declaration//GEN-END:variables
}
