package src.InterfazHistorial;

import java.util.ArrayList;
import src.Usuario;
import src.Medico;
import src.Paciente;
import javax.swing.JOptionPane;
import static src.InterfazHistorial.RegistrarUsuario.listaMedicos;//Temporal para hacer pruebas BORRAR AL TERMINAR (para usar el médico de prueba)

public class InicioSesion extends javax.swing.JFrame {

    ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public InicioSesion() {
        initComponents();
        setTitle("MedVirtual DCS - Inicio de sesión");
        Medico medico = new Medico(1, "medico", "1234", "medico");//Temporal para hacer pruebas BORRAR AL TERMINAR
        listaMedicos.add(medico);//Temporal para hacer pruebas BORRAR AL TERMINAR
        Paciente paciente = new Paciente(2, "pperez", "1234", "paciente");//Temporal para hacer pruebas BORRAR AL TERMINAR
        usuarios.add(paciente);//Temporal para hacer pruebas BORRAR AL TERMINAR
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBIniciarSesion = new javax.swing.JButton();
        jBRegistrarse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTNombreUsuario = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MedVirtualDCS");
        setSize(new java.awt.Dimension(800, 600));

        jBIniciarSesion.setText("Iniciar Sesión");
        jBIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIniciarSesionActionPerformed(evt);
            }
        });

        jBRegistrarse.setText("Registrarse");
        jBRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarseActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre de Usuario:");

        jLabel2.setText("Contraseña:");

        jLabel3.setFont(new java.awt.Font("Javanese Text", 0, 24)); // NOI18N
        jLabel3.setText("MedVirtualDCS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(84, 84, 84)
                                    .addComponent(jLabel1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel2)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3)
                            .addGap(33, 33, 33)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBIniciarSesion)
                        .addGap(18, 18, 18)
                        .addComponent(jBRegistrarse)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRegistrarse)
                    .addComponent(jBIniciarSesion))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIniciarSesionActionPerformed
        String name = jTNombreUsuario.getText();
        String password = jPassword.getText();
        
        //String response = Usuario.verificarLogin(usuarios, name, password);
        String response = Usuario.verificaLogin(name, password);
        try{
            switch (response) {
                case "medico":
                    this.setVisible(false);
                    dispose();
                    FormularioHistorialVistaMedico fhvm = new FormularioHistorialVistaMedico();
                    fhvm.setVisible(true);
                    break;
                case "paciente":
                    this.setVisible(false);
                    dispose();
                    FormularioHistorialVistaPaciente fhvp = new FormularioHistorialVistaPaciente();
                    fhvp.setVisible(true);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos. Vuelva a intentar.");
                    jTNombreUsuario.setText("");
                    jPassword.setText("");
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos. Vuelva a intentar.");
        }
    }//GEN-LAST:event_jBIniciarSesionActionPerformed

    private void jBRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarseActionPerformed
        // Botón registro de usuario
        this.setVisible(false);
        dispose();
        RegistrarUsuario registroUsuario = new RegistrarUsuario();
        registroUsuario.setVisible(true);
    }//GEN-LAST:event_jBRegistrarseActionPerformed


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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new InicioSesion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBIniciarSesion;
    private javax.swing.JButton jBRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
