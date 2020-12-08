package scr.InterfazDiagnostico;

import src.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTextField;
import src.InterfazHistorial.FormularioHistorialVistaMedico;
import static src.InterfazHistorial.FormularioHistorialVistaMedico.indexPaciente;
import static src.InterfazHistorial.RegistrarUsuario.listaPacientes;

public class RegistrarDiagnostico extends javax.swing.JFrame {
    
    ArrayList<Formula> formulas = new ArrayList<>();
    String dietaDescripcion;
    String cirugiaDescripcion;
    ArrayList<String> nombreMedicamento = new ArrayList<>();//Solo se usa en el Frame RegistrarDiagnostico
    ArrayList<String> dosisMedicamento = new ArrayList<>();//Solo se usa en el Frame RegistrarDiagnostico
   
    public RegistrarDiagnostico() {
        
        initComponents();
        jTFMedicamento.enable(false);
        setTitle("MedVirtualDCS - Registro Tratamiento");
        llenarDatos();
    }

 
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
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane10 = new javax.swing.JTabbedPane();
        jTabbedPane9 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane11 = new javax.swing.JTabbedPane();
        jTabbedPane12 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jBGuardarDiagnostico = new javax.swing.JButton();
        jBVolverHC1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLNombreP = new javax.swing.JLabel();
        jLDocumentoP = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel12 = new javax.swing.JPanel();
        jLDiagnostico = new javax.swing.JLabel();
        jCBDiagnostico = new javax.swing.JComboBox<>();
        jLRecomendaciones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTARecomendaciones = new javax.swing.JTextArea();
        jPanel19 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLMedicamento = new javax.swing.JLabel();
        jCBMedicamentos = new javax.swing.JComboBox<>();
        jLDosis = new javax.swing.JLabel();
        jTFDosis = new javax.swing.JTextField();
        jBAgregarMedicamento = new javax.swing.JButton();
        jLFormula = new javax.swing.JLabel();
        jTFMedicamento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTMedicamentos = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jBAgregarDieta = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTADieta = new javax.swing.JTextArea();
        jPanel21 = new javax.swing.JPanel();
        jBAgregarCirugia = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTFCirugia = new javax.swing.JTextField();
        jBAgregarCirugía = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jBConsultarDiagnostico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAMostrarDiagnosticos = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLPacienteImprimir = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLIdPacienteImrpimir = new javax.swing.JLabel();
        jBVolverHC2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        jBVolverHC3 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLNombrePacienteEliminar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLIdPacienteElim = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTFIdDiagnosticoEliminar = new javax.swing.JTextField();
        jBEliminarDiagnostico = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 686, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("tab1", jPanel3);

        jMenu1.setText("null");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("null");
        jMenuBar1.add(jMenu2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );

        jTabbedPane9.addTab("tab1", jPanel6);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(707, 660));

        jBGuardarDiagnostico.setText("GUARDAR DIAGNOSTICO");
        jBGuardarDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarDiagnosticoActionPerformed(evt);
            }
        });

        jBVolverHC1.setText("Volver a Historia Clínica");
        jBVolverHC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverHC1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre del paciente:");

        jLabel2.setText("Documento:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLDocumentoP, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jLDocumentoP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLDiagnostico.setText("Seleccione Diagnóstico:");

        jCBDiagnostico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diabetes tipo 1", "Diabetes tipo 2", "Diabetes gestacional", "Diabetes relacionada con fibrosis quística", "Diabetes MODY", "Diabetes secundaria a medicamentos" }));

        jLRecomendaciones.setText("Ingrese Recomendaciones:");

        jTARecomendaciones.setColumns(20);
        jTARecomendaciones.setRows(5);
        jScrollPane2.setViewportView(jTARecomendaciones);

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel16.setText("TRATAMIENTO");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLRecomendaciones)
                    .addComponent(jLDiagnostico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jCBDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDiagnostico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLRecomendaciones)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLMedicamento.setText("Medicamento:");

        jCBMedicamentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Metformina", "Sulfonilureas", "Meglitinidas", "Tiazolidinadionas", "Inhibidores de la DPP-4", "Agonistas del receptor de la GLP-1", "Inhibidores de la SGLT2", "Insulina", "Otro" }));
        jCBMedicamentos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBMedicamentosItemStateChanged(evt);
            }
        });

        jLDosis.setText("Dosis:");

        jBAgregarMedicamento.setText("Agregar Medicamento");
        jBAgregarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarMedicamentoActionPerformed(evt);
            }
        });

        jLFormula.setText("FÓRMULA");

        jLabel11.setText("Otro:");

        jTMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Medicamento", "Dosis"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTMedicamentos);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLFormula)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLMedicamento)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCBMedicamentos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTFMedicamento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLDosis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFDosis)
                                .addGap(18, 18, 18)
                                .addComponent(jBAgregarMedicamento)))))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLFormula)
                .addGap(1, 1, 1)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLMedicamento)
                    .addComponent(jCBMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDosis)
                    .addComponent(jTFDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAgregarMedicamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTFMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jBAgregarDieta.setText("Agregar Dieta");
        jBAgregarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarDietaActionPerformed(evt);
            }
        });

        jLabel17.setText("DIETA");

        jTADieta.setColumns(20);
        jTADieta.setRows(5);
        jScrollPane8.setViewportView(jTADieta);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBAgregarDieta)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBAgregarDieta)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jBAgregarCirugia.setText("Agregar Cirugía");

        jLabel18.setText("CIRUGÍA");

        jBAgregarCirugía.setText("Agregar Cirugía");
        jBAgregarCirugía.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarCirugíaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(37, 37, 37)
                .addComponent(jTFCirugia, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAgregarCirugia)
                    .addComponent(jBAgregarCirugía))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCirugia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAgregarCirugía))
                .addGap(82, 82, 82)
                .addComponent(jBAgregarCirugia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBGuardarDiagnostico)
                        .addGap(300, 300, 300))
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBVolverHC1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBGuardarDiagnostico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBVolverHC1)
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Crear Diagnostico", jPanel1);

        jBConsultarDiagnostico.setText("CONSULTAR DIAGNÓSTICOS");
        jBConsultarDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarDiagnosticoActionPerformed(evt);
            }
        });

        jTAMostrarDiagnosticos.setColumns(20);
        jTAMostrarDiagnosticos.setRows(5);
        jScrollPane1.setViewportView(jTAMostrarDiagnosticos);

        jLabel6.setText("Nombre del paciente:");

        jLabel9.setText("Documento:");

        jBVolverHC2.setText("Volver a Historia Clínica");
        jBVolverHC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverHC2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(655, 655, 655)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLPacienteImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(156, 156, 156)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLIdPacienteImrpimir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jBConsultarDiagnostico)
                        .addGap(260, 260, 260))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jBVolverHC2)
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLPacienteImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLIdPacienteImrpimir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBConsultarDiagnostico)
                .addGap(60, 60, 60)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBVolverHC2)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar Diagnóstico", jPanel7);

        jBVolverHC3.setText("Volver a Historia Clínica");
        jBVolverHC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverHC3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre Paciente:");

        jLabel5.setText("Documento:");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLNombrePacienteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addComponent(jLIdPacienteElim, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLIdPacienteElim, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLNombrePacienteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel3.setText("Ingresar id del diagnóstico de eliminar:");

        jTFIdDiagnosticoEliminar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFIdDiagnosticoEliminarFocusLost(evt);
            }
        });

        jBEliminarDiagnostico.setText("ELIMINAR DIAGNÓSTICO");
        jBEliminarDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarDiagnosticoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFIdDiagnosticoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jBEliminarDiagnostico)
                .addContainerGap(355, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFIdDiagnosticoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jBEliminarDiagnostico)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBVolverHC3))
                    .addComponent(jSeparator3)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                .addComponent(jBVolverHC3)
                .addGap(55, 55, 55))
        );

        jTabbedPane1.addTab("Eliminar Diagnóstico", jPanel9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jTabbedPane1)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEliminarDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarDiagnosticoActionPerformed
        // Botón eliminar Diagnóstico
        int idDiagn=Integer.parseInt(jTFIdDiagnosticoEliminar.getText());
        int cont=0;
        boolean idDiagEncontrado=false;
        Paciente paciente = listaPacientes.get(indexPaciente);
        do{
            Diagnostico diagnostico=paciente.getDiagnosticos().get(cont);
            if(diagnostico.getIdDiagnostico()==idDiagn){
                idDiagEncontrado=true;
                paciente.getDiagnosticos().remove(cont);
                JOptionPane.showMessageDialog(null, "Diagnóstico Eliminado");
            }
            cont++;
        }while(!idDiagEncontrado && cont<paciente.getDiagnosticos().size());
        if(!idDiagEncontrado){
            JOptionPane.showMessageDialog(null, "Id de diagnóstico NO encontrado");
        }
        jTFIdDiagnosticoEliminar.setText("0");
       
    }//GEN-LAST:event_jBEliminarDiagnosticoActionPerformed

    private void jBConsultarDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarDiagnosticoActionPerformed
        // Botón Consultar Diagnósticos
        ArrayList<Diagnostico> diagnosticos = new ArrayList<>();//Crea un ArrayList de objetos de "Diagnostico"
        Paciente paciente = listaPacientes.get(indexPaciente);
        diagnosticos = paciente.getDiagnosticos();
        String imprimir = "";
        Diagnostico diagnostico=new Diagnostico();
        imprimir=diagnostico.imprimirDiagnostico(diagnosticos);
        jTAMostrarDiagnosticos.setText(imprimir);
    }//GEN-LAST:event_jBConsultarDiagnosticoActionPerformed

    private void jBVolverHC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverHC2ActionPerformed
        // Botón volver a Historia Clínica
        this.setVisible(false);
        dispose();
        FormularioHistorialVistaMedico fhvm = new FormularioHistorialVistaMedico();
        fhvm.setVisible(true);
    }//GEN-LAST:event_jBVolverHC2ActionPerformed

    private void jBVolverHC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverHC3ActionPerformed
        // Botón volver a Historia Clínica
        this.setVisible(false);
        dispose();
        FormularioHistorialVistaMedico fhvm = new FormularioHistorialVistaMedico();
        fhvm.setVisible(true);
    }//GEN-LAST:event_jBVolverHC3ActionPerformed

    private void jTFIdDiagnosticoEliminarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFIdDiagnosticoEliminarFocusLost
        // Condición para que sólo ingrese números 
        ingresarSoloNumeros(jTFIdDiagnosticoEliminar);
        
    }//GEN-LAST:event_jTFIdDiagnosticoEliminarFocusLost

    private void jBAgregarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarMedicamentoActionPerformed
        // Botón agregar medicamento
        if(jCBMedicamentos.getSelectedItem().toString().equals("Seleccione")){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un medicamento");
            jTFDosis.setText(null);//Limpiar el cuadro de dosis
            jTFMedicamento.setText(null);
        }else if(!jCBMedicamentos.getSelectedItem().toString().equals("Seleccione") && !jCBMedicamentos.getSelectedItem().toString().equals("Otro")){
            nombreMedicamento.add(jCBMedicamentos.getSelectedItem().toString());
            dosisMedicamento.add(jTFDosis.getText());
            JOptionPane.showMessageDialog(null, jCBMedicamentos.getSelectedItem().toString() + " agregado");
            jTFDosis.setText(null);//Limpiar el cuadro de dosis después de guardar el medicamento
            jTFMedicamento.setText(null);
        }else {
            if(jCBMedicamentos.getSelectedItem().toString().equals("Otro")){
                nombreMedicamento.add(jTFMedicamento.getText());
                dosisMedicamento.add(jTFDosis.getText());
                JOptionPane.showMessageDialog(null, jTFMedicamento.getText() + " agregado");
                jTFDosis.setText(null);//Limpiar el cuadro de dosis después de guardar el medicamento
                jTFMedicamento.setText(null);
            }
        }
        String matriz[][]=new String[nombreMedicamento.size()][3];
        for (int i = 0; i < nombreMedicamento.size(); i++) {
            matriz[i][0]=Integer.toString(i+1);
            matriz[i][1]=nombreMedicamento.get(i);
            matriz[i][2]=dosisMedicamento.get(i);
        }
        jTMedicamentos.setModel(new javax.swing.table.DefaultTableModel(matriz,new String[]{"ID","Medicamento","Dosis"}));
    }//GEN-LAST:event_jBAgregarMedicamentoActionPerformed

    private void jCBMedicamentosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBMedicamentosItemStateChanged
        // Habilita el textFiel para agregar un medicamento que no esté en el comboBox
        if(!jCBMedicamentos.getSelectedItem().toString().equals("Otro")){
            jTFMedicamento.enable(false);
        }else{
            jTFMedicamento.enable(true);
        }
    }//GEN-LAST:event_jCBMedicamentosItemStateChanged

    private void jBVolverHC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverHC1ActionPerformed
        //Botón volver a Historia Clínica
        this.setVisible(false);
        dispose();
        FormularioHistorialVistaMedico fhvm = new FormularioHistorialVistaMedico();
        fhvm.setVisible(true);
    }//GEN-LAST:event_jBVolverHC1ActionPerformed

    private void jBGuardarDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarDiagnosticoActionPerformed
        //Botón Guardar Diagnóstico
        Diagnostico diagnostico = new Diagnostico();//Crear objeto de la clase Diagnóstico
        diagnostico.crearDiagnostico(jCBDiagnostico.getSelectedItem().toString(), jTARecomendaciones.getText());

        //Guardar formula y medicamentos
        Formula formula = new Formula();

        for (int i = 0; i < nombreMedicamento.size(); i++) {
            Medicamento medicamento = new Medicamento();
            medicamento.setNombreMedicamento(nombreMedicamento.get(i));
            medicamento.setDosis(dosisMedicamento.get(i));
            formula.medicamentos.add(medicamento);

        }
        diagnostico.setFormula(formula);//Guarda la formula al diagnóstico del paciente consultado
        Dieta dieta=new Dieta();
        dieta.setDescripcion(dietaDescripcion);
        diagnostico.setDieta(dieta);//Guarda la dieta al diagnóstico del paciente consultado
        Cirugia cirugia=new Cirugia();
        cirugia.setDescripcion(cirugiaDescripcion);
        diagnostico.setCirugia(cirugia);//Guarda la cirugía al diagnóstico del paciente consultado
        
        nombreMedicamento.clear();
        dosisMedicamento.clear();
        dietaDescripcion=null;
        cirugiaDescripcion=null;
        jTARecomendaciones.setText(null);//Limpiar textAt¿rea de recomendaciones
        jTMedicamentos.setModel(new javax.swing.table.DefaultTableModel(null,new String[]{"ID","Medicamento","Dosis"}));//Limpiar tabla de medicamentos

        Paciente paciente = listaPacientes.get(indexPaciente);//Guarda en paciente la información de la cédula consultada
        paciente.setDiagnosticos(diagnostico);//Guarda el diagnostico creado en el ArrayList diagnosticos del Paciente consultado
        JOptionPane.showMessageDialog(null, "Diagnostico Registrado");

    }//GEN-LAST:event_jBGuardarDiagnosticoActionPerformed

    private void jBAgregarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarDietaActionPerformed
        // Botón agregar Dieta
        dietaDescripcion=jTADieta.getText();
        JOptionPane.showMessageDialog(null, "Dieta Agregada");
        jTADieta.setText(null);
        
    }//GEN-LAST:event_jBAgregarDietaActionPerformed

    private void jBAgregarCirugíaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarCirugíaActionPerformed
        // Botón agregar cirugia
        cirugiaDescripcion=jTFCirugia.getText();
        JOptionPane.showMessageDialog(null, "Cirugia Agregada");
        jTFCirugia.setText(null);
    }//GEN-LAST:event_jBAgregarCirugíaActionPerformed
    public void ingresarSoloNumeros(JTextField datoIngresado){
        //Procedimiento para verificar que el dato ingresado sea un número 
        if(!datoIngresado.getText().matches("[0-9]*$")){
            JOptionPane.showMessageDialog(null,"ingresar solo valores numéricos ");
            datoIngresado.setText(null);
            datoIngresado.requestFocus();
        } 
    }
    public void buscarIdPaciente(JTextField idConsultado,JLabel nombrePaciente, JLabel idPaciente){
        //Procedimiento para buscar si el id ingresado corresponde al de un paciente registrado
        if(listaPacientes.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay pacientes registrados");
        }else{
            long cedula = Long.parseLong(idConsultado.getText());
            int cont = 0;
            boolean pacienteEncontrado = false;
            String nombre="";
            long documento=0;
            do {
                Paciente paciente = listaPacientes.get(cont);
                if (cedula == paciente.getNumeroDocumento()) {
                    pacienteEncontrado = true;
                    JOptionPane.showMessageDialog(null, paciente.toString());
                    indexPaciente = cont;
                    nombre=paciente.getNombrePaciente()+" "+paciente.getApellidoPaciente();
                    documento=paciente.getNumeroDocumento();
                }
                cont++;
            } while (!pacienteEncontrado && cont < listaPacientes.size());
            if (!pacienteEncontrado) {
                JOptionPane.showMessageDialog(null, "Paciente NO registrado");
            }
            String doc=Long.toString(documento);//Pasar id de Long a String
            nombrePaciente.setText(nombre);//Imprimir en el label el nombre del paciente
            idPaciente.setText(doc);//Imprimir en el label el documento del paciente
            idConsultado.setText(null);
            jLNombreP.setText(nombre);
            jLDocumentoP.setText(doc);
            jLNombrePacienteEliminar.setText(nombre);
            jLIdPacienteElim.setText(doc);
            jLPacienteImprimir.setText(nombre);
            jLIdPacienteImrpimir.setText(doc);
        }
    }
    public void llenarDatos(){
        Paciente paciente = listaPacientes.get(indexPaciente);
        String nombre=paciente.getNombrePaciente()+" "+paciente.getApellidoPaciente();
        String doc=Long.toString(paciente.getNumeroDocumento());
        jLNombreP.setText(nombre);
        jLDocumentoP.setText(doc);
        jLNombrePacienteEliminar.setText(nombre);
        jLIdPacienteElim.setText(doc);
        jLPacienteImprimir.setText(nombre);
        jLIdPacienteImrpimir.setText(doc);
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
            java.util.logging.Logger.getLogger(RegistrarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarDiagnostico().setVisible(true);
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
    private javax.swing.JButton jBAgregarCirugia;
    private javax.swing.JButton jBAgregarCirugía;
    private javax.swing.JButton jBAgregarDieta;
    private javax.swing.JButton jBAgregarMedicamento;
    private javax.swing.JButton jBConsultarDiagnostico;
    private javax.swing.JButton jBEliminarDiagnostico;
    private javax.swing.JButton jBGuardarDiagnostico;
    private javax.swing.JButton jBVolverHC1;
    private javax.swing.JButton jBVolverHC2;
    private javax.swing.JButton jBVolverHC3;
    private javax.swing.JComboBox<String> jCBDiagnostico;
    private javax.swing.JComboBox<String> jCBMedicamentos;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLDiagnostico;
    private javax.swing.JLabel jLDocumentoP;
    private javax.swing.JLabel jLDosis;
    private javax.swing.JLabel jLFormula;
    private javax.swing.JLabel jLIdPacienteElim;
    private javax.swing.JLabel jLIdPacienteImrpimir;
    private javax.swing.JLabel jLMedicamento;
    private javax.swing.JLabel jLNombreP;
    private javax.swing.JLabel jLNombrePacienteEliminar;
    private javax.swing.JLabel jLPacienteImprimir;
    private javax.swing.JLabel jLRecomendaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTADieta;
    private javax.swing.JTextArea jTAMostrarDiagnosticos;
    private javax.swing.JTextArea jTARecomendaciones;
    private javax.swing.JTextField jTFCirugia;
    private javax.swing.JTextField jTFDosis;
    private javax.swing.JTextField jTFIdDiagnosticoEliminar;
    private javax.swing.JTextField jTFMedicamento;
    private javax.swing.JTable jTMedicamentos;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane10;
    private javax.swing.JTabbedPane jTabbedPane11;
    private javax.swing.JTabbedPane jTabbedPane12;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTabbedPane jTabbedPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    private void buscarIdPaciente(JLabel jLPacienteImprimir) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
