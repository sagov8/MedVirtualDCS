package src.InterfazEvolucionPaciente;

import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
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
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLNombrePaciente = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLApellidoPaciente = new javax.swing.JLabel();
        jLApellido = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLNivelAzucar = new javax.swing.JLabel();
        jTIngresarNivelAzucar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLDescripcionEvento = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDescripcionEvento = new javax.swing.JTextArea();
        jBGuardarEventoPaciente = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTAConsultar = new javax.swing.JTextArea();
        jBConsultarEvolucion = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTEvolucion = new javax.swing.JTable();
        jBSalir1 = new javax.swing.JButton();
        jBSalir2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTidEventoEliminar = new javax.swing.JTextField();
        jBEliminarEvento1 = new javax.swing.JButton();
        jBSalir3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTidEvento = new javax.swing.JTextField();
        jBConsultarEventos = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTConsultaDescripcion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jTNuevoNivelGlucosa = new javax.swing.JTextField();
        jTNuevaDescripcionEvento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jBModificarEvento = new javax.swing.JButton();
        jBSalir4 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLNombrePaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLNombrePaciente.setText("Nombre paciente:");

        jLApellidoPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLApellidoPaciente.setText("Apellido paciente:");

        jLNivelAzucar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLNivelAzucar.setText("Nivel de Azucar:");

        jTIngresarNivelAzucar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTIngresarNivelAzucarKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("mg/dl");

        jLDescripcionEvento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLDescripcionEvento.setText("Descripcion:");

        jTDescripcionEvento.setColumns(20);
        jTDescripcionEvento.setRows(5);
        jScrollPane1.setViewportView(jTDescripcionEvento);

        jBGuardarEventoPaciente.setText("Guardar evento");
        jBGuardarEventoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarEventoPacienteActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLDescripcionEvento)
                            .addComponent(jLNivelAzucar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTIngresarNivelAzucar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator3))
                .addGap(265, 265, 265))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(209, 209, 209))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jBGuardarEventoPaciente))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLNombrePaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLApellidoPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLNombrePaciente)
                    .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLApellidoPaciente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNivelAzucar)
                    .addComponent(jTIngresarNivelAzucar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDescripcionEvento)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBGuardarEventoPaciente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Registrar", jPanel2);

        jTAConsultar.setColumns(20);
        jTAConsultar.setRows(5);
        jScrollPane3.setViewportView(jTAConsultar);

        jBConsultarEvolucion.setText("Consultar");
        jBConsultarEvolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarEvolucionActionPerformed(evt);
            }
        });

        jTEvolucion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha y Hora", "Nivel Glucosa", "Estado", "Descripción"
            }
        ));
        jScrollPane5.setViewportView(jTEvolucion);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jBConsultarEvolucion)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jBConsultarEvolucion)
                .addContainerGap())
        );

        jBSalir1.setText("Salir");
        jBSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalir1ActionPerformed(evt);
            }
        });

        jBSalir2.setText("Salir");
        jBSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir2)
                .addGap(96, 96, 96))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(318, 318, 318)
                    .addComponent(jBSalir1)
                    .addContainerGap(319, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jBSalir2)
                .addGap(8, 8, 8))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(153, 153, 153)
                    .addComponent(jBSalir1)
                    .addContainerGap(154, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Consultar ", jPanel5);

        jLabel6.setText("ID Evento: ");

        jTidEventoEliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTidEventoEliminarKeyReleased(evt);
            }
        });

        jBEliminarEvento1.setText("Eliminar");
        jBEliminarEvento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarEvento1ActionPerformed(evt);
            }
        });

        jBSalir3.setText("Salir");
        jBSalir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalir3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTidEventoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBEliminarEvento1)
                .addContainerGap(368, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir3)
                .addGap(182, 182, 182))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTidEventoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminarEvento1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(jBSalir3)
                .addGap(41, 41, 41))
        );

        jTabbedPane1.addTab("Eliminar ", jPanel7);

        jLabel3.setText("ID Evento: ");

        jTidEvento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTidEventoKeyReleased(evt);
            }
        });

        jBConsultarEventos.setText("Consultar");
        jBConsultarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarEventosActionPerformed(evt);
            }
        });

        jTConsultaDescripcion.setColumns(20);
        jTConsultaDescripcion.setRows(5);
        jScrollPane4.setViewportView(jTConsultaDescripcion);

        jLabel4.setText("Nuevo nivel glucosa");

        jLabel5.setText("Nueva descripcion evento");

        jBModificarEvento.setText("Modificar");
        jBModificarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarEventoActionPerformed(evt);
            }
        });

        jBSalir4.setText("Salir");
        jBSalir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalir4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTidEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBConsultarEventos))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTNuevoNivelGlucosa, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBSalir4))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTNuevaDescripcionEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jBModificarEvento)))
                .addContainerGap(314, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTidEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBConsultarEventos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTNuevoNivelGlucosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTNuevaDescripcionEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jBModificarEvento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSalir4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar", jPanel6);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String fechaActual() {

        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }


    private void jBConsultarEvolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarEvolucionActionPerformed
        // Botón Consultar
        Paciente paciente = listaPacientes.get(indexPaciente);
        ArrayList<Evolucion> evoluciones = paciente.getEvoluciones();
        String mostrarEventos = "";

        /*for (int i = 0; i < evoluciones.size(); i++) {
            Evolucion eventoGuardado = evoluciones.get(i);
            mostrarEventos = mostrarEventos + "\nEVENTO " + (i + 1) + ":"
                    + "\nID Evento: " + eventoGuardado.getIdEvento()
                    + "\nFecha evento: " + eventoGuardado.getFechaEvento()
                    + "\nNivel Glucosa: " + eventoGuardado.getNivelGlucosa()
                    + "\nDescripcion Evento: " + eventoGuardado.getDescripcionEvento();

        }
        jTAConsultar.setText(mostrarEventos);*/
        String matriz[][]=new String[evoluciones.size()][5];
        for (int i = 0; i < evoluciones.size(); i++) {
            Evolucion eventoGuardado = evoluciones.get(i);
            String idEvolucion=String.valueOf(eventoGuardado.getIdEvento());
            String fechaEv=String.valueOf(eventoGuardado.getFechaEvento());
            String nivelG=String.valueOf(eventoGuardado.getNivelGlucosa());
            matriz[i][0]=idEvolucion;
            matriz[i][1]=fechaEv;
            matriz[i][2]=nivelG;
            matriz[i][3]=eventoGuardado.getEstadoNivel();
            matriz[i][4]=eventoGuardado.getDescripcionEvento();
        }
        jTEvolucion.setModel(new javax.swing.table.DefaultTableModel(matriz,new String[]{"ID",
                    "Fecha y Hora","Nivel Glucosa","Estado","Descripción"}));
        
    }//GEN-LAST:event_jBConsultarEvolucionActionPerformed

    private void jBConsultarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarEventosActionPerformed
        Paciente paciente = listaPacientes.get(indexPaciente);
        ArrayList<Evolucion> evoluciones = paciente.getEvoluciones();
        int idEventoCreado=Integer.parseInt(jTidEvento.getText());

        for (int i = 0; i < evoluciones.size(); i++) {

            Evolucion eventoConsultado=evoluciones.get(i);
            if (idEventoCreado==eventoConsultado.getIdEvento()) {
                jTConsultaDescripcion.setText(
                    "\nID Evento: " + eventoConsultado.getIdEvento()
                    + "\nFecha evento: " + eventoConsultado.getFechaEvento()
                    + "\nNivel Glucosa: " + eventoConsultado.getNivelGlucosa()
                    + "\nDescripcion Evento: " + eventoConsultado.getDescripcionEvento());
            }
        }

    }//GEN-LAST:event_jBConsultarEventosActionPerformed

    private void jBModificarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarEventoActionPerformed
        Paciente paciente = listaPacientes.get(indexPaciente);
        ArrayList<Evolucion> evoluciones = paciente.getEvoluciones();
        int idEventoCreado=Integer.parseInt(jTidEvento.getText());

        for (int i = 0; i < evoluciones.size(); i++) {

            Evolucion eventoModificado=evoluciones.get(i);
            if (idEventoCreado==eventoModificado.getIdEvento()) {
                int nivelGlucosa=Integer.parseInt(jTNuevoNivelGlucosa.getText());
                eventoModificado.setNivelGlucosa(nivelGlucosa);
                eventoModificado.setDescripcionEvento(jTNuevaDescripcionEvento.getText());
                JOptionPane.showMessageDialog(null, "Evento modificado correctamente");

            }
        }
    }//GEN-LAST:event_jBModificarEventoActionPerformed

    private void jBEliminarEvento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarEvento1ActionPerformed
        Paciente paciente = listaPacientes.get(indexPaciente);
        ArrayList<Evolucion> evoluciones = paciente.getEvoluciones();
        int idEventoEliminar=Integer.parseInt(jTidEventoEliminar.getText());

        for (int i = 0; i < evoluciones.size(); i++) {

            Evolucion eventoEliminar=evoluciones.get(i);
            if (idEventoEliminar==eventoEliminar.getIdEvento()) {
                evoluciones.remove(i);
                JOptionPane.showMessageDialog(null, "Evento eliminado correctamente");

            }
        }
    }//GEN-LAST:event_jBEliminarEvento1ActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
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
        evolucion.validacionNivelGlucosa(nivelGlucosa);//Valida si el nivel de glucosa es normal o no
        Paciente paciente = listaPacientes.get(indexPaciente);//Guarda en paciente la información de la cédula consultada
        paciente.setEvoluciones(evolucion);//Guarda la evolucion creado en el ArrayList evoluciones del Paciente consultado
        JOptionPane.showMessageDialog(null, "Evento Guardado\n"+evolucion.getEstadoNivel());
        if(evolucion.isAlerta()){
            JOptionPane.showMessageDialog(rootPane, "GLUCOSA EN NIVEL DE ALERTA"+
                                    "\nSOLICITE ATENCIÓN MÉDICA DE INMEDIATO", "ALERTA", HEIGHT);
        }
        jTIngresarNivelAzucar.setText(null);
        jTDescripcionEvento.setText(null);
    }//GEN-LAST:event_jBGuardarEventoPacienteActionPerformed

    private void jTIngresarNivelAzucarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIngresarNivelAzucarKeyReleased
        // verificar que el dato ingresado sea un número
        ingresarSoloNumeros(jTIngresarNivelAzucar);
    }//GEN-LAST:event_jTIngresarNivelAzucarKeyReleased

    private void jTidEventoEliminarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTidEventoEliminarKeyReleased
        // verificar que el dato ingresado sea un número
        ingresarSoloNumeros(jTidEventoEliminar);
    }//GEN-LAST:event_jTidEventoEliminarKeyReleased

    private void jTidEventoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTidEventoKeyReleased
        // verificar que el dato ingresado sea un número
        ingresarSoloNumeros(jTidEvento);
    }//GEN-LAST:event_jTidEventoKeyReleased

    private void jBSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSalir1ActionPerformed

    private void jBSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalir2ActionPerformed
        this.setVisible(false);
        dispose();
        FormularioHistorialVistaPaciente fhvp = new FormularioHistorialVistaPaciente();
        fhvp.setVisible(true);
    }//GEN-LAST:event_jBSalir2ActionPerformed

    private void jBSalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalir3ActionPerformed
        this.setVisible(false);
        dispose();
        FormularioHistorialVistaPaciente fhvp = new FormularioHistorialVistaPaciente();
        fhvp.setVisible(true);
    }//GEN-LAST:event_jBSalir3ActionPerformed

    private void jBSalir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalir4ActionPerformed
        this.setVisible(false);
        dispose();
        FormularioHistorialVistaPaciente fhvp = new FormularioHistorialVistaPaciente();
        fhvp.setVisible(true);
    }//GEN-LAST:event_jBSalir4ActionPerformed
    public void llenarDatos(){
        Paciente paciente = listaPacientes.get(indexPaciente);
        jLNombre.setText(paciente.getNombrePaciente());
        jLApellido.setText(paciente.getApellidoPaciente());
    }
    public void ingresarSoloNumeros(JTextField datoIngresado){
        //Procedimiento para verificar que el dato ingresado sea un número 
        if(!datoIngresado.getText().matches("[0-9]*$")){
            JOptionPane.showMessageDialog(null,"ingresar solo valores numéricos ");
            datoIngresado.setText(null);
            datoIngresado.requestFocus();
        } 
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
    private javax.swing.JButton jBConsultarEventos;
    private javax.swing.JButton jBConsultarEvolucion;
    private javax.swing.JButton jBEliminarEvento1;
    private javax.swing.JButton jBGuardarEventoPaciente;
    private javax.swing.JButton jBModificarEvento;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBSalir1;
    private javax.swing.JButton jBSalir2;
    private javax.swing.JButton jBSalir3;
    private javax.swing.JButton jBSalir4;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLApellidoPaciente;
    private javax.swing.JLabel jLDescripcionEvento;
    private javax.swing.JLabel jLNivelAzucar;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNombrePaciente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTAConsultar;
    private javax.swing.JTextArea jTConsultaDescripcion;
    private javax.swing.JTextArea jTDescripcionEvento;
    private javax.swing.JTable jTEvolucion;
    private javax.swing.JTextField jTIngresarNivelAzucar;
    private javax.swing.JTextField jTNuevaDescripcionEvento;
    private javax.swing.JTextField jTNuevoNivelGlucosa;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTidEvento;
    private javax.swing.JTextField jTidEventoEliminar;
    // End of variables declaration//GEN-END:variables
}
