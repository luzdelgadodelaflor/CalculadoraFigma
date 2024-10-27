/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pantallas;

/**
 *
 * @author Luz
 */
public class MiCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form MiCalculadora
     */
     private Operaciones operaciones;
     private String operacionA;
    public MiCalculadora() {
        initComponents();
        operaciones=new Operaciones();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtrespuesta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnsumar = new javax.swing.JLabel();
        btnrestar = new javax.swing.JLabel();
        btnmultiplicar = new javax.swing.JLabel();
        btndividir = new javax.swing.JLabel();
        btnigual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 245, 245));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 50, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel8.setText("Calculadora");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 150, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\OneDrive\\Escritorio\\Top app bar.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 580, 100));

        txtrespuesta.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtrespuesta.setText("0");
        txtrespuesta.setBorder(null);
        txtrespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrespuestaActionPerformed(evt);
            }
        });
        jPanel1.add(txtrespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 112, 470, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\OneDrive\\Escritorio\\Text field.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 550, 90));

        btnsumar.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\OneDrive\\Escritorio\\Group 7.png")); // NOI18N
        btnsumar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsumarMouseClicked(evt);
            }
        });
        jPanel1.add(btnsumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 70));

        btnrestar.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\OneDrive\\Escritorio\\Group 8.png")); // NOI18N
        btnrestar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnrestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnrestarMouseClicked(evt);
            }
        });
        jPanel1.add(btnrestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, 70));

        btnmultiplicar.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\OneDrive\\Escritorio\\Group 9.png")); // NOI18N
        btnmultiplicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmultiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmultiplicarMouseClicked(evt);
            }
        });
        jPanel1.add(btnmultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 185, 80, 80));

        btndividir.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\OneDrive\\Escritorio\\Group 10.png")); // NOI18N
        btndividir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndividirMouseClicked(evt);
            }
        });
        jPanel1.add(btndividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 80, 70));

        btnigual.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\OneDrive\\Escritorio\\Group 11.png")); // NOI18N
        btnigual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnigual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnigualMouseClicked(evt);
            }
        });
        jPanel1.add(btnigual, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 80, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private double convertirTexto(){
        return Double.parseDouble(txtrespuesta.getText());
    }
    
     private void prepararOperacion(String operacion) {
        operacionA = operacion;
        operaciones.setNumero1(convertirTexto());
        operaciones.setOperacion(operacion);
        txtrespuesta.setText("");
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnsumarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsumarMouseClicked
        prepararOperacion("suma");
    }//GEN-LAST:event_btnsumarMouseClicked

    private void btnrestarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrestarMouseClicked
        prepararOperacion("resta");
    }//GEN-LAST:event_btnrestarMouseClicked

    private void btnmultiplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmultiplicarMouseClicked
         prepararOperacion("multiplicacion");
    }//GEN-LAST:event_btnmultiplicarMouseClicked

    private void btndividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndividirMouseClicked
        prepararOperacion("division");
    }//GEN-LAST:event_btndividirMouseClicked

    private void btnigualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnigualMouseClicked
         if (operacionA != null) {
             operaciones.setNumero2(convertirTexto());
            double resultado = operaciones.calcular(); 
            // Formatear el resultado para mostrar siempre 2 decimales
            String resultadoFormateado = String.format("%.2f", resultado);
            txtrespuesta.setText(resultadoFormateado);
            operacionA = null;
        }
    }//GEN-LAST:event_btnigualMouseClicked

    private void txtrespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrespuestaActionPerformed

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
            java.util.logging.Logger.getLogger(MiCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btndividir;
    private javax.swing.JLabel btnigual;
    private javax.swing.JLabel btnmultiplicar;
    private javax.swing.JLabel btnrestar;
    private javax.swing.JLabel btnsumar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtrespuesta;
    // End of variables declaration//GEN-END:variables
}
