package src.InterfazHistorial;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import src.Medico;
import src.Paciente;
import src.Usuario;

public class RegistrarUsuario extends javax.swing.JFrame {
    
    public static ArrayList<Paciente> listaPacientes = new ArrayList<>();
    public static ArrayList<Medico> listaMedicos = new ArrayList<>();
    public RegistrarUsuario() {
        initComponents();
        setTitle("MedVirtualDCS - Registro Usuario");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jTFIdPaciente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTNombreUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCBTipoDocumento = new javax.swing.JComboBox<>();
        jBRegistroUsuario = new javax.swing.JButton();
        jTPassword1 = new javax.swing.JPasswordField();
        jTPassword2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jTApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCBTipoUsuario = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTFIdUsuario = new javax.swing.JTextField();

        jTFIdPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFIdPacienteKeyReleased(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Registro de Usuario");

        jLabel2.setText("Nombre de Usuario:");

        jLabel3.setText("Password:");

        jLabel4.setText("Confirmar password:");

        jLabel5.setText("Tipo Usuario:");

        jCBTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "", "Tarjeta de Identidad", "Cédula de Extranjería", "Registro Civil", "Carné Diplomatico", "Pasaporte", "Permiso especial de Permanencia", "NIT", "Pasaporte de la ONU", "Certificado Nacido Vivo" }));

        jBRegistroUsuario.setText("Registrarme");
        jBRegistroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistroUsuarioActionPerformed(evt);
            }
        });

        jLabel6.setText("Apellido:");

        jLabel7.setText("Nombre:");

        jLabel8.setText("Tipo de documento:");

        jCBTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Paciente", "Médico" }));

        jLabel9.setText("Número de documento:");

        jTFIdUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFIdUsuarioKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTNombreUsuario)
                                    .addComponent(jCBTipoDocumento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTPassword1)
                                    .addComponent(jTPassword2)
                                    .addComponent(jTApellido)
                                    .addComponent(jTNombre)
                                    .addComponent(jTFIdUsuario)
                                    .addComponent(jCBTipoUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jBRegistroUsuario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jCBTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTFIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCBTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBRegistroUsuario)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRegistroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistroUsuarioActionPerformed
        //Botón Registro de Usuario
        String nombre=jTNombre.getText();
        String apellido=jTApellido.getText();
        String documento=jTFIdUsuario.getText();
        String usuario=jTNombreUsuario.getText();
        String pass1=jTPassword1.getText();
        String pass2=jTPassword2.getText();

        if(nombre.isEmpty() || apellido.isEmpty() || documento.isEmpty() || jCBTipoDocumento.getSelectedItem().toString().equals("Seleccione") ||
                usuario.isEmpty() || pass1.isEmpty() || pass2.isEmpty() || jCBTipoUsuario.getSelectedItem().toString().equals("Seleccione")){
            JOptionPane.showMessageDialog(null,"Debe diligenciar todos los campos");
        }else{ 
            if(pass1.equals(pass2)){
                boolean response = Usuario.verificaUsuarioRepetido(usuario, pass1);
                if(!response){
                    long numDocumento= Long.parseLong(jTFIdUsuario.getText());
                    if(jCBTipoUsuario.getSelectedItem().toString().equals("Paciente")){
                        Paciente paciente=new Paciente(usuario,pass1,"paciente",nombre,apellido,jCBTipoDocumento.getSelectedItem().toString(),numDocumento);
                        listaPacientes.add(paciente);
                        JOptionPane.showMessageDialog(null,"Registro de paciente exitoso"+"\nPuede iniciar sesión");
                    }else if(jCBTipoUsuario.getSelectedItem().toString().equals("Médico")){
                        Medico medico=new Medico(usuario,pass1,"medico",nombre,apellido,jCBTipoDocumento.getSelectedItem().toString(),numDocumento);
                        listaMedicos.add(medico);
                        JOptionPane.showMessageDialog(null,"Registro de médico exitoso"+"\nPuede iniciar sesión");
                    }
                    this.setVisible(false);
                    dispose();
                    InicioSesion inicioSesion = new InicioSesion();
                    inicioSesion.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"El nombre de usuario ya existe");
                }    
            }else{
                JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden");
            }
            
        }
    }//GEN-LAST:event_jBRegistroUsuarioActionPerformed

    private void jTFIdPacienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFIdPacienteKeyReleased
        // Condición para que sólo ingrese números al consultar la identificación del paciente
        ingresarSoloNumeros(jTFIdPaciente);
    }//GEN-LAST:event_jTFIdPacienteKeyReleased
    
    private void jTFIdUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFIdUsuarioKeyReleased
        // Condición para que sólo ingrese números al consultar la identificación del paciente
        ingresarSoloNumeros(jTFIdUsuario);
    }//GEN-LAST:event_jTFIdUsuarioKeyReleased
    public void ingresarSoloNumeros(JTextField datoIngresado){
        //Procedimiento para verificar que el dato ingresado sea un número 
        if(!datoIngresado.getText().matches("[0-9]*$")){
            JOptionPane.showMessageDialog(null,"ingresar solo valores numéricos ");
            datoIngresado.setText(null);
            datoIngresado.requestFocus();
        } 
    }
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
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuario().setVisible(true);
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
    private javax.swing.JButton jBRegistroUsuario;
    private javax.swing.JComboBox<String> jCBTipoDocumento;
    private javax.swing.JComboBox<String> jCBTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTFIdPaciente;
    private javax.swing.JTextField jTFIdUsuario;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTNombreUsuario;
    private javax.swing.JPasswordField jTPassword1;
    private javax.swing.JPasswordField jTPassword2;
    // End of variables declaration//GEN-END:variables
}
