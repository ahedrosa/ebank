/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebank;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextPane;

/**
 *
 * @author Alex'sCucumbah
 */
public class BancoConIgSerializado extends javax.swing.JFrame {

    /**
     * Creates new form BancoConIgSerializado
     */
    public final static String NOMBREFICHERO = "eBanco.objeto";
    private Banco eBanco;
    
    //megustaria llamar al Objeto del tipo BancoConIgSerializado que se crea automaticamente 
    //con el constructor de abajo al iniciar el programa, porque si obtengo el nombre de ese objeto podria acceder
    // al eBanco original sin tener que andar heredándolo
    
    //Yo actualizo la posicion del banco cuando el frame principal gana el foco. Pero en ningún momento enlazo este eBanco 
    //con el que uso en el resto de clases, más que guardarlo. Pero yo nunca lo cargo mas que al inicio del programa
    public BancoConIgSerializado() {
        initComponents();                
        
        int numTarjetas = 1000;
        
        eBanco = new Banco(numTarjetas);
        
        if (eBanco.existe(NOMBREFICHERO)) {
            eBanco.cargar(NOMBREFICHERO);
        }
        
        jTextPaneSituacionBanco.setText(eBanco.toString());
    }

    public Banco geteBanco() {
        return eBanco;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AltajFrame = new javax.swing.JFrame();
        jButtonAceptarAlta = new javax.swing.JButton();
        jButtonBorrarAlta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNtarjeta = new javax.swing.JTextField();
        jTextFieldPIN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSaldo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelNombreBanco = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneSituacionBanco = new javax.swing.JTextPane();
        jButtonAlta = new javax.swing.JButton();
        jButtonBaja = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonCajero = new javax.swing.JButton();

        AltajFrame.setMaximizedBounds(new java.awt.Rectangle(0, 0, 400, 400));
        AltajFrame.setMinimumSize(new java.awt.Dimension(400, 400));
        AltajFrame.setSize(new java.awt.Dimension(400, 400));
        AltajFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                AltajFrameWindowClosing(evt);
            }
        });

        jButtonAceptarAlta.setText("Dar de Alta");
        jButtonAceptarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarAltaActionPerformed(evt);
            }
        });

        jButtonBorrarAlta.setText("Borrar");
        jButtonBorrarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarAltaActionPerformed(evt);
            }
        });

        jLabel1.setText("Numero Tarjeta");

        jLabel2.setText("Código PIN");

        jTextFieldNtarjeta.setColumns(1);
        jTextFieldNtarjeta.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jTextFieldNtarjeta.setText("Número de Tarjeta(16 Dígitos)");
        jTextFieldNtarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNtarjetaActionPerformed(evt);
            }
        });
        jTextFieldNtarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNtarjetaKeyPressed(evt);
            }
        });

        jTextFieldPIN.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jTextFieldPIN.setText("Introduzca un PIN válido");
        jTextFieldPIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPINActionPerformed(evt);
            }
        });
        jTextFieldPIN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPINKeyPressed(evt);
            }
        });

        jLabel3.setText("Saldo Inicial");

        jTextFieldSaldo.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jTextFieldSaldo.setText("Introduzca su saldo inicial en €");
        jTextFieldSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSaldoActionPerformed(evt);
            }
        });
        jTextFieldSaldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSaldoKeyPressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("ALTA");

        jLabel5.setText("Pulsar enter para verificar datos a introducir");

        jLabel6.setText("Desplazar entre campos usando TAB");

        javax.swing.GroupLayout AltajFrameLayout = new javax.swing.GroupLayout(AltajFrame.getContentPane());
        AltajFrame.getContentPane().setLayout(AltajFrameLayout);
        AltajFrameLayout.setHorizontalGroup(
            AltajFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AltajFrameLayout.createSequentialGroup()
                .addGroup(AltajFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AltajFrameLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jButtonBorrarAlta))
                    .addGroup(AltajFrameLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AltajFrameLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AltajFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AltajFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5))
                            .addGroup(AltajFrameLayout.createSequentialGroup()
                                .addGroup(AltajFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(AltajFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonAceptarAlta)
                                    .addGroup(AltajFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldPIN)
                                        .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                        .addComponent(jTextFieldNtarjeta)))))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        AltajFrameLayout.setVerticalGroup(
            AltajFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AltajFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(AltajFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNtarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AltajFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AltajFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(AltajFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptarAlta)
                    .addComponent(jButtonBorrarAlta))
                .addGap(34, 34, 34))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelNombreBanco.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        jLabelNombreBanco.setText("eBanco");
        jLabelNombreBanco.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jTextPaneSituacionBanco.setEditable(false);
        jTextPaneSituacionBanco.setBackground(new java.awt.Color(102, 204, 255));
        jTextPaneSituacionBanco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cuentas en eBank", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jScrollPane1.setViewportView(jTextPaneSituacionBanco);

        jButtonAlta.setText("Alta");
        jButtonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaActionPerformed(evt);
            }
        });

        jButtonBaja.setText("Baja");
        jButtonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajaActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonCajero.setText("Cajero Automatico");
        jButtonCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCajeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jLabelNombreBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jButtonBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNombreBanco)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButtonCajero, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaActionPerformed
        // TODO add your handling code here:        
        AltajFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        if (eBanco.buscaPosLibre()== -1) {
            javax.swing.JOptionPane.showMessageDialog(this,"Lo sentimos, no se puede dar de alta, banco completo"); 
        }else{
            AltajFrame.setVisible(true);
        }
        
    }//GEN-LAST:event_jButtonAltaActionPerformed

    private void jButtonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajaActionPerformed
        // TODO add your handling code here:
        LogInNumTarjetaJDialog logIn = new LogInNumTarjetaJDialog(this, "Dar de Baja", eBanco);
        logIn.setVisible(true);
    }//GEN-LAST:event_jButtonBajaActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // TODO add your handling code here:
        LogInNumTarjetaJDialog logIn = new LogInNumTarjetaJDialog(this,"Modificacion", eBanco);
        logIn.setVisible(true);
    }//GEN-LAST:event_jButtonModificarActionPerformed

    public void setjTextPaneSituacionBanco(String jTextPaneSituacionBanco) {
        this.jTextPaneSituacionBanco.setText(jTextPaneSituacionBanco);
    }

    private void jButtonAceptarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarAltaActionPerformed
        // TODO add your handling code here:
        String nTarj, PIN;
        Double saldoTarj;
        if (jTextFieldNtarjeta.getBackground()!= Color.green || jTextFieldPIN.getBackground() != Color.green || jTextFieldSaldo.getBackground() != Color.green) {
            javax.swing.JOptionPane.showMessageDialog(this,"Error, al menos uno de los campos introducidos es erróneo, RECUERDE VALIDARLOS pulsando "
                                                        + "\"enter\", y revisar aquellos que queden de color rojo");
        }else{
            nTarj = jTextFieldNtarjeta.getText();
            PIN = jTextFieldPIN.getText();
            saldoTarj = Double.parseDouble(jTextFieldSaldo.getText());
            eBanco.alta(nTarj, PIN, saldoTarj);
            jTextPaneSituacionBanco.setText(eBanco.toString());
            eBanco.guardar(NOMBREFICHERO);
            jButtonAceptarAlta.setVisible(false);
        }
        
        
        
    }//GEN-LAST:event_jButtonAceptarAltaActionPerformed

    private void jTextFieldNtarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNtarjetaActionPerformed
        // TODO add your handling code here:
        
        if(!TarjetaCredito.esNumTarjetaValido(jTextFieldNtarjeta.getText())){
           javax.swing.JOptionPane.showMessageDialog(this,"Error el Número de la tarjeta debe de estar compuesto unicamente por 16 números");
        }else 
            if(eBanco.buscaPosicion(jTextFieldNtarjeta.getText())!=-1){
                javax.swing.JOptionPane.showMessageDialog(this,"Error este número de tarjeta ya existe");
            }else{
                    jTextFieldNtarjeta.setBackground(Color.green);
                    jTextFieldNtarjeta.setEditable(false);
            }     
        
        
    }//GEN-LAST:event_jTextFieldNtarjetaActionPerformed

    private void jTextFieldPINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPINActionPerformed
        // TODO add your handling code here:
         if(!TarjetaCredito.esPinValido(jTextFieldPIN.getText())){
           javax.swing.JOptionPane.showMessageDialog(this,"Error el PIN ha de estar compuesto por 4 dígitos numéricos");
        }else{
            jTextFieldPIN.setBackground(Color.green);
            jTextFieldPIN.setEditable(false);
        }
        
        
    }//GEN-LAST:event_jTextFieldPINActionPerformed

    private void jTextFieldNtarjetaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNtarjetaKeyPressed
        // TODO add your handling code here:
        
         if (this.jTextFieldNtarjeta.getText().compareTo("Número de Tarjeta(16 Dígitos)") == 0){
            this.jTextFieldNtarjeta.setText("");
            jTextFieldNtarjeta.setBackground(Color.red);
            jTextFieldNtarjeta.setFont(new java.awt.Font("Tahoma", 0, 12));
        }
    }//GEN-LAST:event_jTextFieldNtarjetaKeyPressed

    private void jTextFieldPINKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPINKeyPressed
        // TODO add your handling code here:
         if (this.jTextFieldPIN.getText().compareTo("Introduzca un PIN válido") == 0){
            this.jTextFieldPIN.setText("");
            jTextFieldPIN.setBackground(Color.red);
            jTextFieldPIN.setFont(new java.awt.Font("Tahoma", 0, 12));
        }
    }//GEN-LAST:event_jTextFieldPINKeyPressed

    private void jTextFieldSaldoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSaldoKeyPressed
        // TODO add your handling code here:
        
         if (this.jTextFieldSaldo.getText().compareTo("Introduzca su saldo inicial en €") == 0){
            this.jTextFieldSaldo.setText("");
            jTextFieldSaldo.setBackground(Color.red);
            jTextFieldSaldo.setFont(new java.awt.Font("Tahoma", 0, 12));
        }
    }//GEN-LAST:event_jTextFieldSaldoKeyPressed

    private void jTextFieldSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSaldoActionPerformed
        // TODO add your handling code here:
        double saldo =0.0;
        
        boolean error = false;
        try{
           saldo = Double.parseDouble(jTextFieldSaldo.getText());          
        }catch(NumberFormatException e){
            javax.swing.JOptionPane.showMessageDialog(this,"Error el valor introducido no es del formato esperado ej:123.12");
            error = true; 
        }
        if (saldo < 0 && !error) {
            javax.swing.JOptionPane.showMessageDialog(this,"Error el valor del saldo ha de ser 0 mayor que 0 y, en caso de ser decimal, ha de separarse mediante un punto(.)");
        }else if(!error){
            jTextFieldSaldo.setBackground(Color.green);
            jTextFieldSaldo.setEditable(false);
        }
        
        
    }//GEN-LAST:event_jTextFieldSaldoActionPerformed

    private void jButtonBorrarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarAltaActionPerformed
        // TODO add your handling code here:
        jTextFieldNtarjeta.setText("Número de Tarjeta(16 Dígitos)");
        jTextFieldNtarjeta.setBackground(Color.white);
        jTextFieldNtarjeta.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTextFieldNtarjeta.setEditable(true);
        
        
        jTextFieldPIN.setText("Introduzca un PIN válido");
        jTextFieldPIN.setBackground(Color.white);
        jTextFieldPIN.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTextFieldPIN.setEditable(true);
        
        jTextFieldSaldo.setText("Introduzca su saldo inicial en €");
        jTextFieldSaldo.setBackground(Color.white);
        jTextFieldSaldo.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTextFieldSaldo.setEditable(true);
        
        jButtonAceptarAlta.setVisible(true);
    }//GEN-LAST:event_jButtonBorrarAltaActionPerformed

    private void AltajFrameWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_AltajFrameWindowClosing
        // TODO add your handling code here:
        jTextFieldNtarjeta.setText("Número de Tarjeta(16 Dígitos)");
        jTextFieldNtarjeta.setBackground(Color.white);
        jTextFieldNtarjeta.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTextFieldNtarjeta.setEditable(true);
        
        
        jTextFieldPIN.setText("Introduzca un PIN válido");
        jTextFieldPIN.setBackground(Color.white);
        jTextFieldPIN.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTextFieldPIN.setEditable(true);
        
        jTextFieldSaldo.setText("Introduzca su saldo inicial en €");
        jTextFieldSaldo.setBackground(Color.white);
        jTextFieldSaldo.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTextFieldSaldo.setEditable(true);
        
        jButtonAceptarAlta.setVisible(true);
    }//GEN-LAST:event_AltajFrameWindowClosing

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        jTextPaneSituacionBanco.setText(eBanco.toString());
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        eBanco.guardar(NOMBREFICHERO);
    }//GEN-LAST:event_formWindowClosing

    private void jButtonCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCajeroActionPerformed
         boolean hayCuentas = false;
         
        for (int i = 0; i < eBanco.gettTarjetas().length; ++i){
                if (eBanco.gettTarjetas()[i].getNumTarjeta().length() != 0){
                    hayCuentas = true;
                    i = eBanco.gettTarjetas().length;
                }
        }
                
        if (!hayCuentas) {
            javax.swing.JOptionPane.showMessageDialog(this,"Lo sentimos, no hay ninguna cuenta dada de alta. Pruebe a crear una para después acceder a sus operaciones"); 
        }else{
            CajeroLogInJDialog cajero = new CajeroLogInJDialog(this, "Log In Cajero", eBanco);
            cajero.setVisible(true);
        }
        
    }//GEN-LAST:event_jButtonCajeroActionPerformed

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
            java.util.logging.Logger.getLogger(BancoConIgSerializado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BancoConIgSerializado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BancoConIgSerializado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BancoConIgSerializado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BancoConIgSerializado().setVisible(true);
            }
        });        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame AltajFrame;
    private javax.swing.JButton jButtonAceptarAlta;
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JButton jButtonBaja;
    private javax.swing.JButton jButtonBorrarAlta;
    private javax.swing.JButton jButtonCajero;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelNombreBanco;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNtarjeta;
    private javax.swing.JTextField jTextFieldPIN;
    private javax.swing.JTextField jTextFieldSaldo;
    private javax.swing.JTextPane jTextPaneSituacionBanco;
    // End of variables declaration//GEN-END:variables
}
