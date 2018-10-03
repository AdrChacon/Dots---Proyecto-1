/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JFrame;
import Comunicacion.JSONPackage;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;


/**
 *
 * @author kejor
 */
public class juedo extends javax.swing.JFrame {
    private String getServerAddress() {
        return JOptionPane.showInputDialog(
            frame,
            "Enter IP Address of the Server:",
            "Welcome to the Chatter",
            JOptionPane.QUESTION_MESSAGE);
    }
    public void ToJson(int X1, int Y1, int X2, int Y2){
        JSONPackage Conection = new JSONPackage(X1, Y1, X2, Y2);
        try{
        JsonConection = mapper.writeValueAsString(Conection);
        out.println(JsonConection);
        } catch(JsonParseException e){    
        } catch(JsonMappingException e){
        } catch(IOException e){
    }
        
    }
    private void run() throws IOException {

        String serverAddress = getServerAddress();
        Socket socket = new Socket(serverAddress, 12500);
        in = new BufferedReader(new InputStreamReader(
            socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);
    
    }
    public juedo() {
        
        initComponents();
        this.setLocationRelativeTo(null);//para centrar la pantalla     
        Conexiones = new ArrayList();
        cor = new ArrayList();
        roc = new ArrayList();
        
        
    }
    int i1;
    int j1;
    int i2;
    int j2;
    int x1;
    int y1;
    int x2;
    int y2;
    int ver2=0;
    ArrayList Conexiones;
    ArrayList cor;
    ArrayList roc;
    public void dibujar (int i,int j,int ver,int x,int y){
        ver2+=ver;
        //System.out.println(ver2);
            if (ver2==2){
                i1+=i;
                j1+=j;
                x1+=x;
                y1+=y;
                //System.out.println(ver2);
            }
            if(ver2==4){
                i2+=i;
                j2+=j;
                x2+=x;
                y2+=y;
            
                
                if(x1==x2 && y1==y2){
                    
                        ver2=0;
                        i1=0;
                        j1=0;
                        i2=0;
                        j2=0;
                        x1=0;
                        y1=0;
                        x2=0;
                        y2=0;  
                        JOptionPane.showMessageDialog(null, "movimiento incorrecto, intenta otra vez");
                        
                        
                }
                else{
                    if ((x2==x1 || x2==x1 + 1 || x2== x1 - 1) &&
                    (y2==y1 || y2==y1 + 1 || y2== y1 - 1)){
                        cor.add(x1);
                        cor.add(y1);
                        cor.add(x2);
                        cor.add(y2);
                        roc.add(x2);
                        roc.add(y2);
                        roc.add(x1);
                        roc.add(y1);
                        //System.out.println("Cor: " + cor);
                        //System.out.println("Roc: " + roc);
                        //System.out.println("Conexiones: " + Conexiones);
                        if (Conexiones.contains(cor) || Conexiones.contains(roc)){
                            cor.clear();
                            roc.clear();
                            JOptionPane.showMessageDialog(null, "movimiento incorrecto, intenta otra vez");
                            ver2=0;
                            i1=0;
                            j1=0;
                            i2=0;
                            j2=0;
                            x1=0;
                            y1=0;
                            x2=0;
                            y2=0;
                        }
                        else {
                            //System.out.println("Conexiones: " + Conexiones);
                            //System.out.println("cor: " + cor);
                            //System.out.println("acor: " + roc);
                            System.out.println(x1+","+y1+","+x2+","+y2);
                            hacerlinea(getGraphics(),i1,j1,i2,j2);
                            Conexiones.add(cor.clone());
                            Conexiones.add(roc.clone());
                            ToJson(x1, y1, x2, y2);
                            ver2=0;
                            i1=0;
                            j1=0;
                            i2=0;
                            j2=0;
                            x1=0;
                            y1=0;
                            x2=0;
                            y2=0;
                            cor.clear();
                            roc.clear();
                            
                            
                            //System.out.println("Conexiones: " + Conexiones);
                        }
                    }
                    else{
                        ver2=0;
                        i1=0;
                        j1=0;
                        i2=0;
                        j2=0;
                        x1=0;
                        y1=0;
                        x2=0;
                        y2=0; 
                        JOptionPane.showMessageDialog(null, "movimiento incorrecto, intenta otra vez");
                            }
                }
            }
    }
    public void hacerlinea(Graphics g,int i1,int j1,int i2,int j2){    
    g.drawLine(i1, j1, i2, j2);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        player1 = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        Node1 = new javax.swing.JButton();
        Node2 = new javax.swing.JButton();
        Node3 = new javax.swing.JButton();
        Node4 = new javax.swing.JButton();
        Node5 = new javax.swing.JButton();
        Node6 = new javax.swing.JButton();
        Node7 = new javax.swing.JButton();
        Node8 = new javax.swing.JButton();
        Node9 = new javax.swing.JButton();
        Node10 = new javax.swing.JButton();
        Node11 = new javax.swing.JButton();
        Node12 = new javax.swing.JButton();
        Node13 = new javax.swing.JButton();
        Node14 = new javax.swing.JButton();
        Node15 = new javax.swing.JButton();
        Node16 = new javax.swing.JButton();
        Node17 = new javax.swing.JButton();
        Node18 = new javax.swing.JButton();
        Node19 = new javax.swing.JButton();
        Node20 = new javax.swing.JButton();
        Node21 = new javax.swing.JButton();
        Node22 = new javax.swing.JButton();
        Node23 = new javax.swing.JButton();
        Node24 = new javax.swing.JButton();
        Node25 = new javax.swing.JButton();
        nameDO = new javax.swing.JLabel();
        nameTS = new javax.swing.JLabel();
        SALIR = new javax.swing.JButton();
        jLabelFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        player1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        player1.setForeground(new java.awt.Color(0, 153, 0));
        player1.setText("Player1");
        getContentPane().add(player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, 20));

        player2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        player2.setForeground(new java.awt.Color(0, 0, 102));
        player2.setText("Player2");
        getContentPane().add(player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        Node1.setBackground(new java.awt.Color(0, 0, 0));
        Node1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node1ActionPerformed(evt);
            }
        });
        getContentPane().add(Node1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 10, 10));

        Node2.setBackground(new java.awt.Color(0, 0, 0));
        Node2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node2ActionPerformed(evt);
            }
        });
        getContentPane().add(Node2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 10, 10));

        Node3.setBackground(new java.awt.Color(0, 0, 0));
        Node3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node3ActionPerformed(evt);
            }
        });
        getContentPane().add(Node3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 10, -1));

        Node4.setBackground(new java.awt.Color(0, 0, 0));
        Node4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node4ActionPerformed(evt);
            }
        });
        getContentPane().add(Node4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 10, -1));

        Node5.setBackground(new java.awt.Color(0, 0, 0));
        Node5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node5ActionPerformed(evt);
            }
        });
        getContentPane().add(Node5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 10, -1));

        Node6.setBackground(new java.awt.Color(0, 0, 0));
        Node6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node6ActionPerformed(evt);
            }
        });
        getContentPane().add(Node6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 10, -1));

        Node7.setBackground(new java.awt.Color(0, 0, 0));
        Node7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node7ActionPerformed(evt);
            }
        });
        getContentPane().add(Node7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 10, 10));

        Node8.setBackground(new java.awt.Color(0, 0, 0));
        Node8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node8ActionPerformed(evt);
            }
        });
        getContentPane().add(Node8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 10, 10));

        Node9.setBackground(new java.awt.Color(0, 0, 0));
        Node9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node9ActionPerformed(evt);
            }
        });
        getContentPane().add(Node9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 10, -1));

        Node10.setBackground(new java.awt.Color(0, 0, 0));
        Node10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node10ActionPerformed(evt);
            }
        });
        getContentPane().add(Node10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 10, 10));

        Node11.setBackground(new java.awt.Color(0, 0, 0));
        Node11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node11ActionPerformed(evt);
            }
        });
        getContentPane().add(Node11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 10, 10));

        Node12.setBackground(new java.awt.Color(0, 0, 0));
        Node12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node12ActionPerformed(evt);
            }
        });
        getContentPane().add(Node12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 10, -1));

        Node13.setBackground(new java.awt.Color(0, 0, 0));
        Node13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node13ActionPerformed(evt);
            }
        });
        getContentPane().add(Node13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 10, -1));

        Node14.setBackground(new java.awt.Color(0, 0, 0));
        Node14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node14ActionPerformed(evt);
            }
        });
        getContentPane().add(Node14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 10, -1));

        Node15.setBackground(new java.awt.Color(0, 0, 0));
        Node15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node15ActionPerformed(evt);
            }
        });
        getContentPane().add(Node15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 10, -1));

        Node16.setBackground(new java.awt.Color(0, 0, 0));
        Node16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node16ActionPerformed(evt);
            }
        });
        getContentPane().add(Node16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 10, -1));

        Node17.setBackground(new java.awt.Color(0, 0, 0));
        Node17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node17ActionPerformed(evt);
            }
        });
        getContentPane().add(Node17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 10, -1));

        Node18.setBackground(new java.awt.Color(0, 0, 0));
        Node18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node18ActionPerformed(evt);
            }
        });
        getContentPane().add(Node18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 10, -1));

        Node19.setBackground(new java.awt.Color(0, 0, 0));
        Node19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node19ActionPerformed(evt);
            }
        });
        getContentPane().add(Node19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 10, -1));

        Node20.setBackground(new java.awt.Color(0, 0, 0));
        Node20.setName(""); // NOI18N
        Node20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node20ActionPerformed(evt);
            }
        });
        getContentPane().add(Node20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 10, -1));

        Node21.setBackground(new java.awt.Color(0, 0, 0));
        Node21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node21ActionPerformed(evt);
            }
        });
        getContentPane().add(Node21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 10, -1));

        Node22.setBackground(new java.awt.Color(0, 0, 0));
        Node22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node22ActionPerformed(evt);
            }
        });
        getContentPane().add(Node22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 10, -1));

        Node23.setBackground(new java.awt.Color(0, 0, 0));
        Node23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node23ActionPerformed(evt);
            }
        });
        getContentPane().add(Node23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 10, -1));

        Node24.setBackground(new java.awt.Color(0, 0, 0));
        Node24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node24ActionPerformed(evt);
            }
        });
        getContentPane().add(Node24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 10, -1));

        Node25.setBackground(new java.awt.Color(0, 0, 0));
        Node25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Node25ActionPerformed(evt);
            }
        });
        getContentPane().add(Node25, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 10, -1));

        nameDO.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        nameDO.setForeground(new java.awt.Color(51, 153, 0));
        nameDO.setText("DO");
        getContentPane().add(nameDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        nameTS.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        nameTS.setForeground(new java.awt.Color(0, 0, 102));
        nameTS.setText("TS");
        getContentPane().add(nameTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        SALIR.setBackground(new java.awt.Color(204, 204, 255));
        SALIR.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        SALIR.setForeground(new java.awt.Color(204, 0, 0));
        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        getContentPane().add(SALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        jLabelFondo2.setIcon(new javax.swing.ImageIcon("C:\\Users\\kejor\\OneDrive\\Documentos\\NetBeansProjects\\dots\\src\\imagenes\\fondo-home-1.jpg")); // NOI18N
        getContentPane().add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void Node21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node21ActionPerformed
        int x;
        int y;
        x=4;
        y=0;
        dibujar(55,255,2,x,y);
        //Matriz.Buscalista(x,y);
    }//GEN-LAST:event_Node21ActionPerformed

    private void Node25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node25ActionPerformed
        int x;
        int y;
        x=4;
        y=4;
        //Matriz.Buscalista(x,y);
        dibujar(255,255,2,x,y);
    }//GEN-LAST:event_Node25ActionPerformed

    private void Node1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node1ActionPerformed
        int x;
        int y;
        x=0;
        y=0;
        //Matriz.Buscalista(x,y);
        dibujar(55,55,2,x,y);
    }//GEN-LAST:event_Node1ActionPerformed

    private void Node13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node13ActionPerformed
        int x;
        int y;
        x=2;
        y=2;
        //Matriz.Buscalista(x,y);
        dibujar(155,155,2,x,y);
    }//GEN-LAST:event_Node13ActionPerformed

    private void Node14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node14ActionPerformed
        int x;
        int y;
        x=2;
        y=3;
        //Matriz.Buscalista(x,y);
        dibujar(205,155,2,x,y);
    }//GEN-LAST:event_Node14ActionPerformed

    private void Node15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node15ActionPerformed
        int x;
        int y;
        x=2;
        y=4;
        //Matriz.Buscalista(x,y);
        dibujar(255,155,2,x,y);
    }//GEN-LAST:event_Node15ActionPerformed

    private void Node12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node12ActionPerformed
        int x;
        int y;
        x=2;
        y=1;
        //Matriz.Buscalista(x,y);
        dibujar(105,155,2,x,y);
    }//GEN-LAST:event_Node12ActionPerformed

    private void Node2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node2ActionPerformed
        int x;
        int y;
        x=0;
        y=1;
        //Matriz.Buscalista(x,y);
        dibujar(105,55,2,x,y);
    }//GEN-LAST:event_Node2ActionPerformed

    private void Node3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node3ActionPerformed
        int x;
        int y;
        x=0;
        y=2;
        //Matriz.Buscalista(x,y);
        dibujar(155,55,2,x,y);
    }//GEN-LAST:event_Node3ActionPerformed

    private void Node4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node4ActionPerformed
        int x;
        int y;
        x=0;
        y=3;
        //Matriz.Buscalista(x,y);
        dibujar(205,55,2,x,y);
    }//GEN-LAST:event_Node4ActionPerformed

    private void Node5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node5ActionPerformed
        int x;
        int y;
        x=0;
        y=4;
        //Matriz.Buscalista(x,y);
        dibujar(255,55,2,x,y);
    }//GEN-LAST:event_Node5ActionPerformed

    private void Node6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node6ActionPerformed
        int x;
        int y;
        x=1;
        y=0;
        //Matriz.Buscalista(x,y);
        dibujar(55,105,2,x,y);
    }//GEN-LAST:event_Node6ActionPerformed

    private void Node7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node7ActionPerformed
        int x;
        int y;
        x=1;
        y=1;
        //Matriz.Buscalista(x,y);
        dibujar(105,105,2,x,y);
    }//GEN-LAST:event_Node7ActionPerformed

    private void Node8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node8ActionPerformed
        int x;
        int y;
        x=1;
        y=2;
        //Matriz.Buscalista(x,y);
        dibujar(155,105,2,x,y);
    }//GEN-LAST:event_Node8ActionPerformed

    private void Node9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node9ActionPerformed
        int x;
        int y;
        x=1;
        y=3;
        //Matriz.Buscalista(x,y);
        dibujar(205,105,2,x,y);
    }//GEN-LAST:event_Node9ActionPerformed

    private void Node10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node10ActionPerformed
        int x;
        int y;
        x=1;
        y=4;
        //Matriz.Buscalista(x,y);
        dibujar(255,105,2,x,y);
    }//GEN-LAST:event_Node10ActionPerformed

    private void Node11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node11ActionPerformed
        int x;
        int y;
        x=2;
        y=0;
        //Matriz.Buscalista(x,y);
        dibujar(55,155,2,x,y);
    }//GEN-LAST:event_Node11ActionPerformed

    private void Node16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node16ActionPerformed
        int x;
        int y;
        x=3;
        y=0;
        //Matriz.Buscalista(x,y);
        dibujar(55,205,2,x,y);
    }//GEN-LAST:event_Node16ActionPerformed

    private void Node17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node17ActionPerformed
        int x;
        int y;
        x=3;
        y=1;
        //Matriz.Buscalista(x,y);
        dibujar(105,205,2,x,y);
    }//GEN-LAST:event_Node17ActionPerformed

    private void Node18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node18ActionPerformed
        int x;
        int y;
        x=3;
        y=2;
        //Matriz.Buscalista(x,y);
        dibujar(155,205,2,x,y);
    }//GEN-LAST:event_Node18ActionPerformed

    private void Node19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node19ActionPerformed
       int x;
        int y;
        x=3;
        y=3;
        //Matriz.Buscalista(x,y);
        dibujar(205,205,2,x,y);
    }//GEN-LAST:event_Node19ActionPerformed

    private void Node22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node22ActionPerformed
        int x;
        int y;
        x=4;
        y=1;
        //Matriz.Buscalista(x,y);
        dibujar(105,255,2,x,y);
    }//GEN-LAST:event_Node22ActionPerformed

    private void Node23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node23ActionPerformed
        int x;
        int y;
        x=4;
        y=2;
        //Matriz.Buscalista(x,y);
        dibujar(155,255,2,x,y);
    }//GEN-LAST:event_Node23ActionPerformed

    private void Node24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node24ActionPerformed
        int x;
        int y;
        x=4;
        y=3;
        //Matriz.Buscalista(x,y);
        dibujar(205,255,2,x,y);
    }//GEN-LAST:event_Node24ActionPerformed

    private void Node20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Node20ActionPerformed
        int x;
        int y;
        x=3;
        y=4;
       //Matriz.Buscalista(x,y);
       dibujar(255,205,2,x,y);
    }//GEN-LAST:event_Node20ActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        System.exit(0);//para salir de la pantalla
    }//GEN-LAST:event_SALIRActionPerformed
  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception{
        juedo client = new juedo();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new juedo().setVisible(true);
            }
        });
        client.run();
    }
    BufferedReader in;
    PrintWriter out;
    JFrame frame = new JFrame("Chatter");
    ObjectMapper mapper = new ObjectMapper();
    private String JsonConection;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Node1;
    private javax.swing.JButton Node10;
    private javax.swing.JButton Node11;
    private javax.swing.JButton Node12;
    private javax.swing.JButton Node13;
    private javax.swing.JButton Node14;
    private javax.swing.JButton Node15;
    private javax.swing.JButton Node16;
    private javax.swing.JButton Node17;
    private javax.swing.JButton Node18;
    private javax.swing.JButton Node19;
    private javax.swing.JButton Node2;
    private javax.swing.JButton Node20;
    private javax.swing.JButton Node21;
    private javax.swing.JButton Node22;
    private javax.swing.JButton Node23;
    private javax.swing.JButton Node24;
    private javax.swing.JButton Node25;
    private javax.swing.JButton Node3;
    private javax.swing.JButton Node4;
    private javax.swing.JButton Node5;
    private javax.swing.JButton Node6;
    private javax.swing.JButton Node7;
    private javax.swing.JButton Node8;
    private javax.swing.JButton Node9;
    private javax.swing.JButton SALIR;
    private javax.swing.JLabel jLabelFondo2;
    private javax.swing.JLabel nameDO;
    private javax.swing.JLabel nameTS;
    private javax.swing.JLabel player1;
    private javax.swing.JLabel player2;
    // End of variables declaration//GEN-END:variables

    
    }
   
   



