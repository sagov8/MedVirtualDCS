package src.InterfazEvolucionPaciente;

import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import src.Evolucion;
import src.InterfazEvolucionPaciente.RegistrarEvolucionPaciente;
import static src.InterfazHistorial.FormularioHistorialVistaMedico.indexPaciente;
import src.InterfazHistorial.FormularioHistorialVistaPaciente;
import static src.InterfazHistorial.RegistrarUsuario.listaPacientes;
import src.Paciente;

public class RegistrarEvolucionPaciente extends javax.swing.JFrame {

    public RegistrarEvolucionPaciente() {
        initComponents();
        setResizable(false);
        setTitle("MedVirtualDCS - Evolución Paciente");
        llenarDatos();
        //   setIconImage(new ImageIcon(getClass().getResource("/MedVirtualDCS/iconoAplicacion.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLNivelAzucar = new javax.swing.JLabel();
        jBGuardarEventoPaciente = new javax.swing.JButton();
        jBImprimirEvento = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLDescripcionEvento = new javax.swing.JLabel();
        jLNombrePaciente = new javax.swing.JLabel();
        jLApellidoPaciente = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDescripcionEvento = new javax.swing.JTextArea();
        jBEliminarEvento = new javax.swing.JButton();
        jTIngresarNivelAzucar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLApellido = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Registrar Evolución");

        jLNivelAzucar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLNivelAzucar.setText("Nivel de Azucar:");

        jBGuardarEventoPaciente.setText("Guardar evento");
        jBGuardarEventoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarEventoPacienteActionPerformed(evt);
            }
        });

        jBImprimirEvento.setText("Imprimir evento");
        jBImprimirEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImprimirEventoActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLDescripcionEvento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLDescripcionEvento.setText("Descripcion:");

        jLNombrePaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLNombrePaciente.setText("Nombre paciente:");

        jLApellidoPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLApellidoPaciente.setText("Apellido paciente:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Información paciente");

        jTDescripcionEvento.setColumns(20);
        jTDescripcionEvento.setRows(5);
        jScrollPane1.setViewportView(jTDescripcionEvento);

        jBEliminarEvento.setText("Eliminar y/o Modificar Evento");
        jBEliminarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarEventoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("mg/dl");
        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(178, 178, 178)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addComponent(jLabel1)))
                                .addGap(0, 321, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLNivelAzucar)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTIngresarNivelAzucar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBEliminarEvento)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jBImprimirEvento))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLNombrePaciente)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLApellidoPaciente)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBSalir)))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBGuardarEventoPaciente)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLDescripcionEvento)
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombrePaciente)
                    .addComponent(jLApellidoPaciente)
                    .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNivelAzucar)
                    .addComponent(jTIngresarNivelAzucar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(19, 19, 19)
                .addComponent(jLDescripcionEvento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardarEventoPaciente)
                    .addComponent(jBImprimirEvento)
                    .addComponent(jBSalir)
                    .addComponent(jBEliminarEvento))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String fechaActual() {

        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }


    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        //System.exit(0);
        this.setVisible(false);
        dispose();
        FormularioHistorialVistaPaciente fhvp = new FormularioHistorialVistaPaciente();
        fhvp.setVisible(true);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBGuardarEventoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarEventoPacienteActionPerformed
        Evolucion evolucion = new Evolucion();
        float nivelGlucosa = Float.parseFloat(jTIngresarNivelAzucar.getText());
        evolucion.setNivelGlucosa(nivelGlucosa);
        evolucion.setDescripcionEvento(jTDescripcionEvento.getText());
        Date fechaEvento = new Date();
        evolucion.setFechaEvento(fechaEvento);
        Paciente paciente = listaPacientes.get(indexPaciente);//Guarda en paciente la información de la cédula consultada
        paciente.setEvoluciones(evolucion);//Guarda la evolucion creado en el ArrayList evoluciones del Paciente consultado
        JOptionPane.showMessageDialog(null, "Evento Guardado");
        jTIngresarNivelAzucar.setText(null);
        jTDescripcionEvento.setText(null);
    }//GEN-LAST:event_jBGuardarEventoPacienteActionPerformed

    private void jBImprimirEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimirEventoActionPerformed
        Paciente paciente = listaPacientes.get(indexPaciente);
        ArrayList<Evolucion> evoluciones = paciente.getEvoluciones();
        String mostrarEventos = "";

        for (int i = 0; i < evoluciones.size(); i++) {
            Evolucion eventoGuardado = evoluciones.get(i);
            mostrarEventos = mostrarEventos + "\nEVENTO " + (i + 1) + ":"
                    + "\nID Evento: " + eventoGuardado.getIdEvento()
                    + "\nFecha evento: " + eventoGuardado.getFechaEvento()
                    + "\nNivel Glucosa: " + eventoGuardado.getNivelGlucosa()
                    + "\nDescripcion Evento: " + eventoGuardado.getDescripcionEvento();

        }

        JOptionPane.showMessageDialog(null, mostrarEventos);
        
    }//GEN-LAST:event_jBImprimirEventoActionPerformed

    private void jBEliminarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarEventoActionPerformed
        EliminarEventosPaciente eliminarEventos = new EliminarEventosPaciente();
        eliminarEventos.setVisible(true);
        dispose();


    }//GEN-LAST:event_jBEliminarEventoActionPerformed
    public void llenarDatos(){
        Paciente paciente = listaPacientes.get(indexPaciente);
        jLNombre.setText(paciente.getNombrePaciente());
        jLApellido.setText(paciente.getApellidoPaciente());
    }
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
            java.util.logging.Logger.getLogger(RegistrarEvolucionPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarEvolucionPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarEvolucionPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarEvolucionPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarEvolucionPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminarEvento;
    private javax.swing.JButton jBGuardarEventoPaciente;
    private javax.swing.JButton jBImprimirEvento;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLApellidoPaciente;
    private javax.swing.JLabel jLDescripcionEvento;
    private javax.swing.JLabel jLNivelAzucar;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNombrePaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTDescripcionEvento;
    private javax.swing.JTextField jTIngresarNivelAzucar;
    // End of variables declaration//GEN-END:variables
}
