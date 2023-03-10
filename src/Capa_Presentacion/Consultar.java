package Capa_Presentacion;
import Capa_Negocio.Componentes;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Consultar extends javax.swing.JFrame {

    
    public Consultar() 
    {
        this.setSize(960,500);
        initComponents();
        ListarArticulos();
    }

    public void ListarArticulos() {
        DefaultTableModel tabla = new DefaultTableModel();
        Componentes objart = new Componentes();
        ArrayList<Componentes> lista4 = new ArrayList();
        lista4 = objart.ListaArticulos();
        tabla.addColumn("Componente");
        tabla.addColumn("Precio");
        tabla.setRowCount(lista4.size());
        int i = 0;
        for (Componentes x: lista4){
                                 
            tabla.setValueAt(x.getComponente(),i,0);
            tabla.setValueAt(x.getPrecio(),i,1);
            i++;
        }
        this.jTable3.setModel(tabla);        
    }

    public void LimpiarCajasTexto() {
    this.componente1.setText("");
    this.precio1.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Salir1 = new javax.swing.JButton();
        PAGAR = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        componente1 = new javax.swing.JTextField();
        precio1 = new javax.swing.JTextField();
        BtnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(97, 53, 74));

        jTable3.setBackground(new java.awt.Color(108, 49, 69));
        jTable3.setForeground(new java.awt.Color(247, 170, 88));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable3.setGridColor(new java.awt.Color(247, 170, 88));
        jTable3.setSelectionBackground(new java.awt.Color(108, 49, 69));
        jTable3.setSelectionForeground(new java.awt.Color(247, 170, 88));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable3MousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        Salir1.setBackground(new java.awt.Color(108, 49, 69));
        Salir1.setForeground(new java.awt.Color(247, 170, 88));
        Salir1.setText("salir ");
        Salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir1ActionPerformed(evt);
            }
        });

        PAGAR.setBackground(new java.awt.Color(108, 49, 69));
        PAGAR.setForeground(new java.awt.Color(247, 170, 88));
        PAGAR.setText("pagar");
        PAGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAGARActionPerformed(evt);
            }
        });

        Cancelar.setBackground(new java.awt.Color(108, 49, 69));
        Cancelar.setForeground(new java.awt.Color(247, 170, 88));
        Cancelar.setText("cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(PAGAR)
                        .addGap(35, 35, 35)
                        .addComponent(BtnEliminar)
                        .addGap(84, 84, 84)
                        .addComponent(Salir1))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(componente1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(precio1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Cancelar))
                .addContainerGap(368, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(componente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(precio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir1)
                    .addComponent(PAGAR)
                    .addComponent(Cancelar)
                    .addComponent(BtnEliminar))
                .addGap(40, 40, 40))
        );

        jTabbedPane1.addTab("Precios", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir1ActionPerformed
        int r = JOptionPane.showConfirmDialog(null,"Esta seguro?");
        if(r == 0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_Salir1ActionPerformed

    private void PAGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAGARActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Dir??jase a la caja");
    }//GEN-LAST:event_PAGARActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        dispose();
        Main mainFrame = new Main();
        mainFrame.setVisible(true);
    }//GEN-LAST:event_CancelarActionPerformed

    private void jTable3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MousePressed
    int rec = this.jTable3.getSelectedRow();
    this.componente1.setText(jTable3.getValueAt(rec, 0).toString());
    this.precio1.setText(jTable3.getValueAt(rec, 1).toString());
    }//GEN-LAST:event_jTable3MousePressed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
        
        int Res=JOptionPane.showConfirmDialog(null,"Esta seguro de Eliminar el Articulo: "+this.componente1.getText());
        if(Res==0)
        {
            Componentes objart=new Componentes();
            objart.setComponente(this.componente1.getText());
            JOptionPane.showMessageDialog(null, objart.EliminarArticulo());
            ListarArticulos();
            JOptionPane.showMessageDialog(null,"Articulo Eliminado:"+this.componente1.getText());
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton PAGAR;
    private javax.swing.JButton Salir1;
    private javax.swing.JTextField componente1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField precio1;
    // End of variables declaration//GEN-END:variables
}
