package src.InterfazHistorial;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import scr.InterfazDiagnostico.RegistrarDiagnostico;
import src.Cirugia;
import src.Diagnostico;
import src.Dieta;
import src.Evolucion;
import src.Formula;
import src.HistoriaClinica;
import static src.InterfazHistorial.InicioSesion.alertaMedico;
import static src.InterfazHistorial.RegistrarUsuario.listaPacientes;
import src.Paciente;
import src.Medicamento;
import src.Medico;
import src.Tratamiento;

public class FormularioHistorialVistaMedico extends javax.swing.JFrame {
    
    ArrayList<Formula> formulas = new ArrayList<>();
    String dietaDescripcion;
    String cirugiaDescripcion;
    ArrayList<String> nombreMedicamento = new ArrayList<>();
    ArrayList<String> dosisMedicamento = new ArrayList<>();
    ArrayList<Paciente> pacientesAlerta=new ArrayList<>();
    
    public static int indexPaciente;
    String id;
    ArrayList<Diagnostico> diagnosticos = new ArrayList<>();
    ArrayList<Medicamento> medicamentos = new ArrayList<>();
    ArrayList<Evolucion> evoluciones = new ArrayList<>();
    HistoriaClinica hc = new HistoriaClinica();
    Medico medico = new Medico(1234, "8123456", "Juan", "Cruz", "10611231234",
            "jcruz@gmail.com", "internista");
    
    int i = 0;

    public FormularioHistorialVistaMedico() {
        initComponents();
        setTitle("MedVirtualDCS - Módulo Médico");
        if(alertaMedico){
            JOptionPane.showMessageDialog(rootPane, "PACIENTE EN ESTADO DE ALERTA", "ALERTA", HEIGHT);
            jLAlerta.setForeground(Color.red);
            buscarPacientesAlerta();
            llenarTablaAlertas();
        }
        
        jTFMedicamento.enable(false);//Desabilita testField de medicamento "otro"
        jBGuardarDiagnostico.setEnabled(false);//Desabilita botón guardar diagnóstico hasta que ingrese documento de algún paciente registrado
        
        jTDiagnostico.setEditable(false);
        jTFechaDeDiagnostico.setEditable(false);
        jTEstado.setEditable(false);
        jTObservaciones.setEditable(false);
        jTMedicamentos.setEditable(false);
        jTTratamiento.setEditable(false);
        jTEvolucion.setEditable(false);

        jTNombre.setEditable(false);
        jTApellido.setEditable(false);
        jTTipoDocumento.setEditable(false);
        jTNumDocumento.setEditable(false);
        jTTelCel.setEditable(false);
        jTCorreoElectronico.setEditable(false);
        jTDireccion.setEditable(false);
        jTFechaNacimiento.setEditable(false);
        jTGenero.setEditable(false);
        jTPeso.setEditable(false);
        jTMotivosConsulta.setEditable(false);

        Date fecha = new Date();
        Evolucion evo = new Evolucion(1, fecha, "Nivel de Glucosa", "1.8");
        Evolucion evo2 = new Evolucion(2, fecha, "Nuevo síntoma", "Mareo en las mañanas");

        evoluciones.add(evo);
        evoluciones.add(evo2);

        Tratamiento tratamiento = new Tratamiento(1, "El paciente requiere una segunda evaluación",
                evoluciones);

        Paciente paciente = new Paciente(1, "CC", 10123456, "Pepe", "Perez", "3124567891", "pperez@gmail.com", "Calle 1 #2 33",
                "8/8/1991", "M", 45, "Mareos constantes");

        Diagnostico diagnostico = new Diagnostico(String.valueOf(paciente.getNumeroDocumento()), fecha,
                "Diabetes tipo 2", "Realizar pruebas de laboratorio", "estable",
                tratamiento, medico);

        paciente.setDiagnosticoYTratamiento(diagnostico);

        hc.crearHistoriaClinica(paciente);
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTAlertas = new javax.swing.JTable();
        jLAlerta = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFIdPacienteConsultar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTNombre1 = new javax.swing.JTextField();
        jTApellido1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTTipoDocumento1 = new javax.swing.JTextField();
        jTNumDocumento1 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTTelCel1 = new javax.swing.JTextField();
        jTCorreoElectronico1 = new javax.swing.JTextField();
        jTDireccion1 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jTFechaNacimiento1 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jTGenero1 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTPeso1 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTMotivosConsulta2 = new javax.swing.JTextArea();
        jLDiagnostico = new javax.swing.JLabel();
        jCBDiagnostico = new javax.swing.JComboBox<>();
        jLRecomendaciones = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTARecomendaciones = new javax.swing.JTextArea();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jCBMedicamentos = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        jTFDosis = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jTFMedicamento = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTMedicamentos2 = new javax.swing.JTable();
        jBAgregarMedicamento = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jBAgregarDieta = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTADieta = new javax.swing.JTextArea();
        jPanel14 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jBAgregarCirugía = new javax.swing.JButton();
        jTFCirugia = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jBGuardarDiagnostico = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTAMostrarDiagnosticos = new javax.swing.JTextArea();
        jBConsultarDiagnostico = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jTFIdDiagnosticoEliminar = new javax.swing.JTextField();
        jBEliminarDiagnostico = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTTipoDocumento = new javax.swing.JTextField();
        jTNumDocumento = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTTelCel = new javax.swing.JTextField();
        jTCorreoElectronico = new javax.swing.JTextField();
        jTDireccion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTDiagnostico = new javax.swing.JTextField();
        jTFechaDeDiagnostico = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTEstado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTObservaciones = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTMotivosConsulta = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTMedicamentos = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jTFechaNacimiento = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTGenero = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTPeso = new javax.swing.JTextField();
        jBConsultarHistoria = new javax.swing.JButton();
        jBEditarHistoria = new javax.swing.JButton();
        jBBorrarHistoria = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTTratamiento = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jTEvolucion = new javax.swing.JTextField();
        jBGuardarCambios = new javax.swing.JButton();

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
        jScrollPane7.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane12.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane13.setViewportView(jTable4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jTAlertas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Paciente", "Nombre Paciente", "Hora y fecha del evento", "Nivel Glucosa"
            }
        ));
        jScrollPane14.setViewportView(jTAlertas);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );

        jLAlerta.setText("ALERTA");

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLAlerta)
                        .addGap(52, 52, 52)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLAlerta)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBSalir)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jToolBar1.setRollover(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel1.setText("Ingresar ID del Paciente:");

        jTFIdPacienteConsultar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFIdPacienteConsultarKeyReleased(evt);
            }
        });

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTFIdPacienteConsultar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jButton1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFIdPacienteConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(411, Short.MAX_VALUE))
        );

        jToolBar1.add(jPanel1);

        jLabel23.setText("Información del paciente:");

        jLabel24.setText("Nombres:");

        jLabel25.setText("Apellidos:");

        jLabel26.setText("Tipo de documento:");

        jLabel27.setText("No. de documento:");

        jLabel28.setText("Información de contacto:");

        jLabel29.setText("Tel/Cel:");

        jLabel30.setText("Dirección:");

        jLabel31.setText("Correo electrónico:");

        jLabel32.setText("Evolución registrada por el paciente:");

        jLabel39.setText("Fecha de nacimiento:");

        jLabel40.setText("Genero:");

        jLabel41.setText("Peso:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha y hora", "Nivel Glucosa", "Estado", "Descripción"
            }
        ));
        jScrollPane5.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addGap(345, 345, 345))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addContainerGap(78, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTTelCel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTCorreoElectronico1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)
                                .addComponent(jLabel30)
                                .addGap(18, 18, 18)
                                .addComponent(jTDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(326, 326, 326)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTNombre1)
                                    .addComponent(jTTipoDocumento1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel23))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTNumDocumento1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(40, 40, 40)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFechaNacimiento1))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTPeso1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 29, Short.MAX_VALUE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator5)
                            .addComponent(jSeparator6))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jTApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(jTFechaNacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTTipoDocumento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jTNumDocumento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(jTGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(jTPeso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(jTTelCel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(jTDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTCorreoElectronico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Información del Paciente", jPanel7);

        jLabel42.setText("Motivo de consulta:");

        jTMotivosConsulta2.setColumns(20);
        jTMotivosConsulta2.setRows(5);
        jScrollPane8.setViewportView(jTMotivosConsulta2);

        jLDiagnostico.setText("Seleccione Diagnóstico:");

        jCBDiagnostico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diabetes tipo 1", "Diabetes tipo 2", "Diabetes gestacional", "Diabetes relacionada con fibrosis quística", "Diabetes MODY", "Diabetes secundaria a medicamentos" }));

        jLRecomendaciones.setText("Recomendaciones:");

        jTARecomendaciones.setColumns(20);
        jTARecomendaciones.setRows(5);
        jScrollPane6.setViewportView(jTARecomendaciones);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLRecomendaciones)
                    .addComponent(jLDiagnostico)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jCBDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane6))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDiagnostico)
                    .addComponent(jCBDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLRecomendaciones)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel37.setText("Tratamiento:");

        jPanel10.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), null));

        jCBMedicamentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Metformina", "Sulfonilureas", "Meglitinidas", "Tiazolidinadionas", "Inhibidores de la DPP-4", "Agonistas del receptor de la GLP-1", "Inhibidores de la SGLT2", "Insulina", "Otro" }));
        jCBMedicamentos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBMedicamentosItemStateChanged(evt);
            }
        });

        jLabel43.setText("Medicamento:");

        jLabel44.setText("Dosis:");

        jLabel46.setText("Otro:");

        jLabel47.setText("Fórmula:");

        jTMedicamentos2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane9.setViewportView(jTMedicamentos2);

        jBAgregarMedicamento.setText("+");
        jBAgregarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarMedicamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBAgregarMedicamento)
                .addContainerGap())
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel46)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jScrollPane9)
                        .addContainerGap())
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jTFDosis)
                        .addContainerGap())
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jCBMedicamentos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(193, 193, 193))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jTFMedicamento)
                        .addContainerGap())))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jBAgregarMedicamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jTFMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel45.setText("Dieta:");

        jBAgregarDieta.setText("+");
        jBAgregarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarDietaActionPerformed(evt);
            }
        });

        jTADieta.setColumns(20);
        jTADieta.setRows(5);
        jScrollPane10.setViewportView(jTADieta);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane10))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBAgregarDieta)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jBAgregarDieta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel48.setText("Cirugía:");

        jBAgregarCirugía.setText("+");
        jBAgregarCirugía.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarCirugíaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(jBAgregarCirugía))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTFCirugia)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jBAgregarCirugía))
                .addGap(18, 18, 18)
                .addComponent(jTFCirugia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jBGuardarDiagnostico.setText("Guardar");
        jBGuardarDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarDiagnosticoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator8)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(391, 391, 391)
                                .addComponent(jLabel37))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBGuardarDiagnostico)
                .addGap(486, 486, 486))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel37)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jBGuardarDiagnostico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registrar Diagnóstico", jPanel6);

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTAMostrarDiagnosticos.setColumns(20);
        jTAMostrarDiagnosticos.setRows(5);
        jScrollPane11.setViewportView(jTAMostrarDiagnosticos);

        jBConsultarDiagnostico.setText("Consultar Diagnósticos");
        jBConsultarDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarDiagnosticoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jBConsultarDiagnostico)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBConsultarDiagnostico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel33.setText("Eliminar");

        jTFIdDiagnosticoEliminar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFIdDiagnosticoEliminarFocusLost(evt);
            }
        });

        jBEliminarDiagnostico.setText("Eliminar Diagnóstico");
        jBEliminarDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarDiagnosticoActionPerformed(evt);
            }
        });

        jLabel34.setText("Ingresar id del diagnóstico de eliminar:");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel34)
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jTFIdDiagnosticoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jBEliminarDiagnostico)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addGap(105, 105, 105))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel34)
                .addGap(18, 18, 18)
                .addComponent(jTFIdDiagnosticoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jBEliminarDiagnostico)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar/Eliminar Diagnóstico", jPanel11);

        jLabel2.setText("Información del paciente:");

        jLabel3.setText("Nombres:");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("Tipo de documento:");

        jLabel6.setText("No. de documento:");

        jLabel7.setText("Información de contacto:");

        jLabel8.setText("Tel/Cel:");

        jLabel9.setText("Dirección:");

        jLabel10.setText("Correo electrónico:");

        jLabel11.setText("Condición del paciente:");

        jLabel12.setText("Diagnóstico:");

        jLabel13.setText("Fecha de diagnóstico:");

        jLabel14.setText("Estado:");

        jTObservaciones.setEditable(false);
        jTObservaciones.setColumns(20);
        jTObservaciones.setRows(5);
        jScrollPane1.setViewportView(jTObservaciones);

        jLabel16.setText("Observaciones:");

        jTMotivosConsulta.setColumns(20);
        jTMotivosConsulta.setRows(5);
        jScrollPane3.setViewportView(jTMotivosConsulta);

        jLabel17.setText("Motivo de consulta:");

        jLabel18.setText("Medicamentos:");

        jTMedicamentos.setColumns(20);
        jTMedicamentos.setRows(5);
        jScrollPane4.setViewportView(jTMedicamentos);

        jLabel20.setText("Fecha de nacimiento:");

        jLabel21.setText("Genero:");

        jLabel22.setText("Peso:");

        jBConsultarHistoria.setText("Consultar Historia");
        jBConsultarHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarHistoriaActionPerformed(evt);
            }
        });

        jBEditarHistoria.setText("Editar Historia");
        jBEditarHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarHistoriaActionPerformed(evt);
            }
        });

        jBBorrarHistoria.setText("Borrar Historia");
        jBBorrarHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarHistoriaActionPerformed(evt);
            }
        });

        jLabel15.setText("Tratamiento del paciente:");

        jTTratamiento.setEditable(false);
        jTTratamiento.setColumns(20);
        jTTratamiento.setRows(5);
        jScrollPane2.setViewportView(jTTratamiento);

        jLabel19.setText("Evolución del paciente:");

        jBGuardarCambios.setText("Guardar Cambios");
        jBGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFechaDeDiagnostico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(jTDiagnostico, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTEstado))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jBGuardarCambios)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11)))
                                .addGap(136, 136, 136))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jBConsultarHistoria)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7))
                                    .addComponent(jSeparator1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jBEditarHistoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jBBorrarHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel19)
                                                    .addComponent(jTEvolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTTelCel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTNombre)
                                    .addComponent(jTTipoDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTNumDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(33, 33, 33)))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFechaNacimiento))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(92, 92, 92))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(81, 81, 81))))))
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(jTFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jTNumDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(jTGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(jTPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jBConsultarHistoria)
                            .addComponent(jLabel15))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTTelCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jTCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTEvolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBEditarHistoria)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBBorrarHistoria)
                                    .addComponent(jLabel19))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jBGuardarCambios))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14)))
                                    .addComponent(jTFechaDeDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab(".", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1074, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void vaciarCampos() {
        jTNombre.setText("");
        jTApellido.setText("");
        jTTipoDocumento.setText("");
        jTNumDocumento.setText("");
        jTTelCel.setText("");
        jTCorreoElectronico.setText("");
        jTDireccion.setText("");
        jTFechaNacimiento.setText("");
        jTGenero.setText("");
        jTPeso.setText("");
        jTMotivosConsulta.setText("");

        //.setText("");//Se borró
        jTFechaDeDiagnostico.setText("");
        jTEstado.setText("");
        jTObservaciones.setText("");

        jTMedicamentos.setText("");
        jTTratamiento.setText("");
        jTEvolucion.setText("");
    }

    private void jBGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarCambiosActionPerformed
        //Botón guardar cambios
        String idPaciente = jTNumDocumento.getText();
        Date fecha = new Date();
        i++;
        Paciente paciente2 = new Paciente();

        Tratamiento tratamiento = new Tratamiento(i, jTTratamiento.getText(), evoluciones);
        Diagnostico dg = new Diagnostico(String.valueOf(i), fecha, jTObservaciones.getText(), jTEstado.getText(),
                jTDiagnostico.getText(), tratamiento, medico);

        paciente2.setDiagnosticoYTratamiento(dg);

        try {
            hc.modificarHistoria(paciente2);
            System.out.println(hc.consultarPaciente(idPaciente).getDiagnosticoYTratamiento());

            JOptionPane.showMessageDialog(null, "La historia ha sido editada con éxito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el numero de documento en el campo correspondiente");
        }
    }//GEN-LAST:event_jBGuardarCambiosActionPerformed

    private void jBConsultarHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarHistoriaActionPerformed
        String idPaciente = JOptionPane.showInputDialog("Introduzca el número de identificación del paciente:");

        try {
            Paciente paciente = hc.consultarPaciente(idPaciente);

            jTNombre.setText(paciente.getNombrePaciente());
            jTApellido.setText(paciente.getApellidoPaciente());
            jTTipoDocumento.setText(paciente.getTipoDocumento());
            jTNumDocumento.setText(String.valueOf(paciente.getNumeroDocumento()));
            jTTelCel.setText(paciente.getNumeroTelefonicoPaciente());
            jTCorreoElectronico.setText(paciente.getCorreoPaciente());
            jTDireccion.setText(paciente.getDireccionDeDomicilio());
            jTFechaNacimiento.setText(paciente.getFechaDeNacimiento());
            jTGenero.setText(paciente.getGenero());
            jTPeso.setText(String.valueOf(paciente.getPeso()));
            jTMotivosConsulta.setText(paciente.getMotivoConsulta());

            jTDiagnostico.setText(paciente.getDiagnosticoYTratamiento().getDiagnostico());
            jTFechaDeDiagnostico.setText(String.valueOf(paciente.getDiagnosticoYTratamiento().getFechaDiagnostico()));
            jTEstado.setText(paciente.getDiagnosticoYTratamiento().getEstadoPaciente());
            jTObservaciones.setText(paciente.getDiagnosticoYTratamiento().getObservacion());
            jTTratamiento.setText(paciente.getDiagnosticoYTratamiento().getTratamiento());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El paciente no ha sido encontrado");
        }
    }//GEN-LAST:event_jBConsultarHistoriaActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        JOptionPane.showMessageDialog(null, "Gracias por usar MedVirtualDCS. Vuelva pronto.");
        //Regresa a Inicio de Sesión
        this.setVisible(false);
        dispose();
        InicioSesion inicioSesion = new InicioSesion();
        inicioSesion.setVisible(true);
        //Desactiva la alerta porque ya la vio
        alertaMedico=false;
        jLAlerta.setForeground(Color.black);
        
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBEditarHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarHistoriaActionPerformed

        jTDiagnostico.setEditable(true);
        jTEstado.setEditable(true);
        jTObservaciones.setEditable(true);
        jTMedicamentos.setEditable(true);
        jTTratamiento.setEditable(true);

    }//GEN-LAST:event_jBEditarHistoriaActionPerformed

    private void jBBorrarHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarHistoriaActionPerformed
        String idPaciente = JOptionPane.showInputDialog("Ingrese el número de identificación del paciente:");
        JOptionPane.showConfirmDialog(rootPane, "¿Seguro que quiere eliminar la historia clínica?");
        hc.eliminarHistoria(idPaciente);

        JOptionPane.showMessageDialog(null, "La historia clínica ha sido eliminada");
        vaciarCampos();
    }//GEN-LAST:event_jBBorrarHistoriaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Consultar ID del paciente
        //Procedimiento para buscar si el id ingresado corresponde al de un paciente registrado
        if(listaPacientes.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay pacientes registrados");
        }else{
            long cedula = Long.parseLong(jTFIdPacienteConsultar.getText());
            int cont = 0;
            boolean pacienteEncontrado = false;
            String nombre="";
            String apellido="";
            long documento=0;
            do {
                Paciente paciente = listaPacientes.get(cont);
                if (cedula == paciente.getNumeroDocumento()) {
                    pacienteEncontrado = true;
                    //JOptionPane.showMessageDialog(null, paciente.toString());
                    indexPaciente = cont;
                    jTNombre1.setText(paciente.getNombrePaciente());//Imprimir en el label el nombre del paciente
                    jTApellido1.setText(paciente.getApellidoPaciente());
                    jTTipoDocumento1.setText(paciente.getTipoDocumento());
                    String doc=Long.toString(paciente.getNumeroDocumento());
                    jTNumDocumento1.setText(doc);
                    jTFechaNacimiento1.setText(paciente.getFechaDeNacimiento());
                    jTGenero1.setText(paciente.getGenero());
                    jTPeso1.setText(String.valueOf(paciente.getPeso()));
                    jTTelCel1.setText(paciente.getNumeroTelefonicoPaciente());
                    jTDireccion1.setText(paciente.getDireccionDeDomicilio());
                    jTCorreoElectronico1.setText(paciente.getCorreoPaciente());
                    llenarTablaEvolucion();
                }
                cont++;
            } while (!pacienteEncontrado && cont < listaPacientes.size());
            if(pacienteEncontrado){
                jBGuardarDiagnostico.setEnabled(true);//Habilita el botón que guarda el diagnóstico
            }
            if (!pacienteEncontrado) {
                JOptionPane.showMessageDialog(null, "Paciente NO registrado");
            }
        }
        jTFIdPacienteConsultar.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTFIdPacienteConsultarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFIdPacienteConsultarKeyReleased
        ingresarSoloNumeros(jTFIdPacienteConsultar);
    }//GEN-LAST:event_jTFIdPacienteConsultarKeyReleased

    private void jCBMedicamentosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBMedicamentosItemStateChanged
        // Habilita el textFiel para agregar un medicamento que no esté en el comboBox
        if(!jCBMedicamentos.getSelectedItem().toString().equals("Otro")){
            jTFMedicamento.enable(false);
        }else{
            jTFMedicamento.enable(true);
        }
    }//GEN-LAST:event_jCBMedicamentosItemStateChanged

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
        jTMedicamentos2.setModel(new javax.swing.table.DefaultTableModel(null,new String[]{"ID","Medicamento","Dosis"}));//Limpiar tabla de medicamentos

        Paciente paciente = listaPacientes.get(indexPaciente);//Guarda en paciente la información de la cédula consultada
        paciente.setMotivoConsulta(jTMotivosConsulta2.getText());
        paciente.setDiagnosticos(diagnostico);//Guarda el diagnostico creado en el ArrayList diagnosticos del Paciente consultado
        jTMotivosConsulta2.setText(null);
        JOptionPane.showMessageDialog(null, "Diagnostico Registrado");
    }//GEN-LAST:event_jBGuardarDiagnosticoActionPerformed

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
        jTMedicamentos2.setModel(new javax.swing.table.DefaultTableModel(matriz,new String[]{"ID","Medicamento","Dosis"}));
    }//GEN-LAST:event_jBAgregarMedicamentoActionPerformed

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

    private void jBConsultarDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarDiagnosticoActionPerformed
        // Botón Consultar Diagnósticos
        ArrayList<Diagnostico> diagnosticos = new ArrayList<>();//Crea un ArrayList de objetos de "Diagnostico"
        Paciente paciente = listaPacientes.get(indexPaciente);
        diagnosticos = paciente.getDiagnosticos();
        String imprimir = "";
        Diagnostico diagnostico=new Diagnostico();
        imprimir=diagnostico.imprimirDiagnostico(diagnosticos,paciente.getMotivoConsulta());
        jTAMostrarDiagnosticos.setText(imprimir);
    }//GEN-LAST:event_jBConsultarDiagnosticoActionPerformed

    private void jTFIdDiagnosticoEliminarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFIdDiagnosticoEliminarFocusLost
        // Condición para que sólo ingrese números
        ingresarSoloNumeros(jTFIdDiagnosticoEliminar);

    }//GEN-LAST:event_jTFIdDiagnosticoEliminarFocusLost

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
    public void ingresarSoloNumeros(JTextField datoIngresado){
        //Procedimiento para verificar que el dato ingresado sea un número 
        if(!datoIngresado.getText().matches("[0-9]*$")){
            JOptionPane.showMessageDialog(null,"ingresar solo valores numéricos ");
            datoIngresado.setText(null);
            datoIngresado.requestFocus();
        } 
    }
    public void llenarTablaEvolucion(){
        Paciente paciente = listaPacientes.get(indexPaciente);
        ArrayList<Evolucion> evoluciones = paciente.getEvoluciones();
        String mostrarEventos = "";

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
        jTable1.setModel(new javax.swing.table.DefaultTableModel(matriz,new String[]{"ID",
                    "Fecha y Hora","Nivel Glucosa","Estado","Descripción"}));
    }
    public void buscarPacientesAlerta(){
        for (int j = 0; j < listaPacientes.size(); j++) {
            Paciente paciente=listaPacientes.get(j);
            ArrayList<Evolucion> evoluciones=paciente.getEvoluciones();
            for (int k = 0; k < evoluciones.size(); k++) {
                Evolucion eventoGuardado = evoluciones.get(k);
                if(eventoGuardado.isAlerta()){
                    pacientesAlerta.add(paciente);
                    eventoGuardado.setAlerta(false);
                }
            }
        }
    }
    public void llenarTablaAlertas(){
        String hora="";
        String nivel="";
        String matriz[][]=new String[pacientesAlerta.size()][4];
        for (int i = 0; i < pacientesAlerta.size(); i++) {
            Paciente paciente = pacientesAlerta.get(i);
            ArrayList<Evolucion> evoluciones=paciente.getEvoluciones();
            for (int j = 0; j < evoluciones.size(); j++) {
                Evolucion eventoGuardado = evoluciones.get(j);
                hora=String.valueOf(eventoGuardado.getFechaEvento());
                nivel=String.valueOf(eventoGuardado.getNivelGlucosa());
            }
            String idPaciente=String.valueOf(paciente.getNumeroDocumento());
            String nombre=paciente.getNombrePaciente()+" "+paciente.getApellidoPaciente();
            String fechaEv=String.valueOf(0);
            String nivelG=String.valueOf(0);
            matriz[i][0]=idPaciente;
            matriz[i][1]=nombre;
            matriz[i][2]=hora;
            matriz[i][3]=nivel;
        }
        jTAlertas.setModel(new javax.swing.table.DefaultTableModel(matriz,new String[]{"No. Documento",
                    "Nombre Paciente","Hora y fecha del evento","Nivel de glucosa"}));
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
            java.util.logging.Logger.getLogger(FormularioHistorialVistaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioHistorialVistaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioHistorialVistaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioHistorialVistaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioHistorialVistaMedico().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregarCirugía;
    private javax.swing.JButton jBAgregarDieta;
    private javax.swing.JButton jBAgregarMedicamento;
    private javax.swing.JButton jBBorrarHistoria;
    private javax.swing.JButton jBConsultarDiagnostico;
    private javax.swing.JButton jBConsultarHistoria;
    private javax.swing.JButton jBEditarHistoria;
    private javax.swing.JButton jBEliminarDiagnostico;
    private javax.swing.JButton jBGuardarCambios;
    private javax.swing.JButton jBGuardarDiagnostico;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBDiagnostico;
    private javax.swing.JComboBox<String> jCBMedicamentos;
    private javax.swing.JLabel jLAlerta;
    private javax.swing.JLabel jLDiagnostico;
    private javax.swing.JLabel jLRecomendaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextArea jTADieta;
    private javax.swing.JTextArea jTAMostrarDiagnosticos;
    private javax.swing.JTextArea jTARecomendaciones;
    private javax.swing.JTable jTAlertas;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTApellido1;
    private javax.swing.JTextField jTCorreoElectronico;
    private javax.swing.JTextField jTCorreoElectronico1;
    private javax.swing.JTextField jTDiagnostico;
    private javax.swing.JTextField jTDireccion;
    private javax.swing.JTextField jTDireccion1;
    private javax.swing.JTextField jTEstado;
    private javax.swing.JTextField jTEvolucion;
    private javax.swing.JTextField jTFCirugia;
    private javax.swing.JTextField jTFDosis;
    private javax.swing.JTextField jTFIdDiagnosticoEliminar;
    private javax.swing.JTextField jTFIdPacienteConsultar;
    private javax.swing.JTextField jTFMedicamento;
    private javax.swing.JTextField jTFechaDeDiagnostico;
    private javax.swing.JTextField jTFechaNacimiento;
    private javax.swing.JTextField jTFechaNacimiento1;
    private javax.swing.JTextField jTGenero;
    private javax.swing.JTextField jTGenero1;
    private javax.swing.JTextArea jTMedicamentos;
    private javax.swing.JTable jTMedicamentos2;
    private javax.swing.JTextArea jTMotivosConsulta;
    private javax.swing.JTextArea jTMotivosConsulta2;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTNombre1;
    private javax.swing.JTextField jTNumDocumento;
    private javax.swing.JTextField jTNumDocumento1;
    private javax.swing.JTextArea jTObservaciones;
    private javax.swing.JTextField jTPeso;
    private javax.swing.JTextField jTPeso1;
    private javax.swing.JTextField jTTelCel;
    private javax.swing.JTextField jTTelCel1;
    private javax.swing.JTextField jTTipoDocumento;
    private javax.swing.JTextField jTTipoDocumento1;
    private javax.swing.JTextArea jTTratamiento;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
