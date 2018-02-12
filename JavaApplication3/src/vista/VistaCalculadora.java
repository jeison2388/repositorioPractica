/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;
import modelo.Calculadora;

/**
 *
 * @author YS
 */
public class VistaCalculadora extends javax.swing.JFrame {

    static final String SUMAR = "SUMAR";
    static final String RESTAR = "RESTAR";
    static final String LIMPIAR = "LIMPIAR";
    
    private int primerNumero ;
    private int segundoNumero ;
    private String informacionMostrar = "0";
    
    private Calculadora calculadora;
  
    
    
    public VistaCalculadora() {
        initComponents();
        calculadora = new Calculadora();
        txt_mostrarInformacion.setText(informacionMostrar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_mostrarInformacion = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        btn_restar = new javax.swing.JButton();
        btn_sumar = new javax.swing.JButton();
        txt_primerNumero = new javax.swing.JTextField();
        txt_segundoNumero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_mostrarInformacion.setEditable(false);
        txt_mostrarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mostrarInformacionActionPerformed(evt);
            }
        });

        btn_limpiar.setText("limpiar");
        btn_limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_limpiarMouseClicked(evt);
            }
        });

        btn_restar.setText("Restar");
        btn_restar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_restarMouseClicked(evt);
            }
        });

        btn_sumar.setText("Sumar");
        btn_sumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sumarMouseClicked(evt);
            }
        });

        txt_primerNumero.setName(""); // NOI18N

        jLabel1.setText("Primer numero");

        jLabel2.setText("Segundo numero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_mostrarInformacion)
                        .addComponent(txt_primerNumero)
                        .addComponent(txt_segundoNumero)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btn_restar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                            .addComponent(btn_sumar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(txt_mostrarInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(txt_primerNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(txt_segundoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_restar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sumar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_mostrarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mostrarInformacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mostrarInformacionActionPerformed

    private void btn_limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseClicked
        ejecutarOperacion(LIMPIAR);
    }//GEN-LAST:event_btn_limpiarMouseClicked

    private void btn_restarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_restarMouseClicked
        this.asignarValores();
        ejecutarOperacion(RESTAR);
    }//GEN-LAST:event_btn_restarMouseClicked

    private void btn_sumarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sumarMouseClicked
        this.asignarValores();
        ejecutarOperacion(SUMAR);
    }//GEN-LAST:event_btn_sumarMouseClicked

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
            java.util.logging.Logger.getLogger(VistaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_restar;
    private javax.swing.JButton btn_sumar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_mostrarInformacion;
    private javax.swing.JTextField txt_primerNumero;
    private javax.swing.JTextField txt_segundoNumero;
    // End of variables declaration//GEN-END:variables

    private void asignarValores()
    {
        String valorUno = txt_primerNumero.getText();
        String valorDos = txt_segundoNumero.getText();
        try 
        {
            if (valorUno.equals("") || valorDos.equals(""))
            {
                JOptionPane.showMessageDialog(this, "alguno de los campos se encuentra vacio");
                valorUno = "0";
                valorDos = "0";
            }
            primerNumero = Integer.parseInt(valorUno);
            segundoNumero =  Integer.parseInt(valorDos);
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "recuerde que solo se permiten números");
            this.ejecutarOperacion(LIMPIAR);
        } 
    }
    
  private void ejecutarOperacion (String operacion)
  {
      switch(operacion)
      {
          case SUMAR: 
              informacionMostrar = ""+calculadora.sumar(primerNumero, segundoNumero);
              txt_mostrarInformacion.setText(informacionMostrar);
              break;
          case RESTAR:
              informacionMostrar = ""+calculadora.restar(primerNumero, segundoNumero);
              txt_mostrarInformacion.setText(informacionMostrar);
              break;
          case LIMPIAR:
              informacionMostrar = "0";
              txt_mostrarInformacion.setText(informacionMostrar);
              txt_primerNumero.setText("");
              txt_segundoNumero.setText("");
              primerNumero = 0;
              segundoNumero = 0;              
      }
  }
   
}

