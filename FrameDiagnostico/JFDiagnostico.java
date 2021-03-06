package FrameDiagnostico;
import src.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Date;
public class JFDiagnostico extends javax.swing.JFrame {

    ArrayList<Diagnostico> diagnosticos = new ArrayList<>();//Crea un ArrayList de objetos
    public JFDiagnostico() {
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

        jDialog1 = new javax.swing.JDialog();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jCBDiagnostico = new javax.swing.JComboBox<>();
        jLDiagnostico = new javax.swing.JLabel();
        jLEstado = new javax.swing.JLabel();
        jTEstado = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jBImprimir = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLMedicamento = new javax.swing.JLabel();
        jCBMedicNo = new javax.swing.JCheckBox();
        jCBMedicamentos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTARecomendaciones = new javax.swing.JTextArea();
        jCBMedicSi = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLDosis = new javax.swing.JLabel();
        jTFDosis = new javax.swing.JTextField();
        jBAgregarMedicamento = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCBDiagnostico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diabetes tipo 1", "Diabetes tipo 2", "Diabetes gestacional", "Diabetes relacionada con fibrosis quística", "Diabetes MODY", "Diabetes secundaria a medicamentos" }));
        jCBDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBDiagnosticoActionPerformed(evt);
            }
        });

        jLDiagnostico.setText("Diagnóstico");

        jLEstado.setText("Estado del Paciente");

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBImprimir.setText("Imprimir");
        jBImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImprimirActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBGuardar)
                        .addGap(31, 31, 31)
                        .addComponent(jBImprimir)
                        .addGap(29, 29, 29)
                        .addComponent(jBSalir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLEstado)
                            .addComponent(jLDiagnostico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDiagnostico)
                    .addComponent(jCBDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEstado)
                    .addComponent(jTEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBImprimir)
                    .addComponent(jBSalir))
                .addGap(63, 63, 63))
        );

        jTabbedPane1.addTab("Diagnostico", jPanel1);

        jLabel1.setText("Recomendaciones:");

        jLMedicamento.setText("Medicamento:");

        jCBMedicNo.setText("No");
        jCBMedicNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMedicNoActionPerformed(evt);
            }
        });

        jCBMedicamentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metformina", "Sulfonilureas", "Meglitinidas", "Tiazolidinadionas", "Inhibidores de la DPP-4", "Agonistas del receptor de la GLP-1", "Inhibidores de la SGLT2", "Insulina" }));
        jCBMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMedicamentosActionPerformed(evt);
            }
        });

        jTARecomendaciones.setColumns(20);
        jTARecomendaciones.setRows(5);
        jScrollPane1.setViewportView(jTARecomendaciones);

        jCBMedicSi.setText("Si");
        jCBMedicSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMedicSiActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Metformina", "Sulfonilureas", "Meglitinidas", "Tiazolidinadionas", "Inhibidores de la DPP-4", "Agonistas del receptor de la GLP-1", "Inhibidores de la SGLT2", "Insulina" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jLDosis.setText("Dosis");

        jBAgregarMedicamento.setText("Agregar Medicamento");
        jBAgregarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarMedicamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLMedicamento)
                                .addGap(26, 26, 26)
                                .addComponent(jCBMedicSi)
                                .addGap(27, 27, 27)
                                .addComponent(jCBMedicNo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCBMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLDosis)
                                .addGap(18, 18, 18)
                                .addComponent(jTFDosis, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jBAgregarMedicamento)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLMedicamento)
                    .addComponent(jCBMedicNo)
                    .addComponent(jCBMedicSi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDosis)
                    .addComponent(jTFDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAgregarMedicamento))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Receta", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jCBDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBDiagnosticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBDiagnosticoActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        //Botón Guardar
        Diagnostico diagnostico = new Diagnostico();//Crear objeto de la clase Diagnóstico
        diagnostico.setObservacion(jCBDiagnostico.getSelectedItem().toString());
        diagnostico.setEstadoPaciente(jTEstado.getText());
        Date fechaDiagostico = new Date();
        diagnostico.setFechaDiagnostico(fechaDiagostico); 
        diagnosticos.add(diagnostico);//Guarda el diagnostico creado en el ArrayList
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimirActionPerformed
        // Botón Imprimir
        String imprimir="";
        for (int i = 0; i < diagnosticos.size(); i++) {
            Diagnostico diagnostico = diagnosticos.get(i);
            imprimir=imprimir+"\nDiagnostico: " + (i + 1)+
                "\nId: "+ diagnostico.getIdDiagnostico()+
                "\nFecha: " + diagnostico.getFechaDiagnostico()+
                "\nDiagnostico: " + diagnostico.getObservacion()+
                "\nEstado: " + diagnostico.getEstadoPaciente();
            
        }
        JOptionPane.showMessageDialog(null,imprimir,"Imprimir",JOptionPane.PLAIN_MESSAGE);
        
    }//GEN-LAST:event_jBImprimirActionPerformed

    private void jCBMedicNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMedicNoActionPerformed
        // TODO add your handling code here:
        if(jCBMedicNo.isSelected()){
        }
     
    }//GEN-LAST:event_jCBMedicNoActionPerformed

    private void jCBMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMedicamentosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCBMedicamentosActionPerformed

    private void jCBMedicSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMedicSiActionPerformed
        // TODO add your handling code here:
        if(jCBMedicSi.isSelected()){
            jCBMedicamentos.setEnabled(true);
        }
    }//GEN-LAST:event_jCBMedicSiActionPerformed

    private void jBAgregarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarMedicamentoActionPerformed
        // Botón agregar medicamento
        JOptionPane.showMessageDialog(null, jCBMedicamentos.getSelectedItem().toString()+" agregado");
    }//GEN-LAST:event_jBAgregarMedicamentoActionPerformed

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
            java.util.logging.Logger.getLogger(JFDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFDiagnostico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JButton jBAgregarMedicamento;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBImprimir;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBDiagnostico;
    private javax.swing.JCheckBox jCBMedicNo;
    private javax.swing.JCheckBox jCBMedicSi;
    private javax.swing.JComboBox<String> jCBMedicamentos;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLDiagnostico;
    private javax.swing.JLabel jLDosis;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLMedicamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTARecomendaciones;
    private javax.swing.JTextField jTEstado;
    private javax.swing.JTextField jTFDosis;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
