/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import com.mycompany.reto5.Controlador_Req;
import com.mycompany.reto5.Proyecto_VO;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zero_
 */
public class windowCons2 extends javax.swing.JFrame {

    private JLabel labelTitulo1;
    private JScrollPane jScrollPane1;
    private JTable tblCons2;
    /**
     * Creates new form windowCons1
     */
    public windowCons2() {
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

        labelTitulo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCons2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta # 2");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo1.setBackground(new java.awt.Color(204, 204, 204));
        labelTitulo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo1.setText("Consulta 2 SQL: Lista de Materiales Proyectos: 157, 386, 172, 264, 306.");
        labelTitulo1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(labelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 655, 67));
        labelTitulo1.getAccessibleContext().setAccessibleName("");

        tblCons2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tblCons2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Material", "Precio Unidad", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblCons2.setShowGrid(true);
        jScrollPane1.setViewportView(tblCons2);
        tblCons2.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 96, -1, 257));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Controlador_Req controlador = new Controlador_Req();
        try{
            ArrayList<Proyecto_VO> respuesta = controlador.consultarMaterialesProyectos();
            DefaultTableModel tblModel = (DefaultTableModel) tblCons2.getModel();
            for (Proyecto_VO registro : respuesta){
                tblModel.addRow(new Object[] { registro.getNombre_Material(), registro.getPrecio_Unidad(), registro.getTotal() });
            }
        }
        catch (Exception e){
                javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
        
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(windowCons1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(windowCons1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(windowCons1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(windowCons1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        */
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
          //  public void run() {
            //    new windowCons1().setVisible(true);
           // }
        //});
   /* }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitulo1;
    private javax.swing.JTable tblCons2;
    // End of variables declaration//GEN-END:variables
}
*/