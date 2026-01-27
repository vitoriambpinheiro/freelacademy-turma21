
package br.com.freelacademy.view;


public class TelaLogin extends javax.swing.JFrame {

    
    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCadastrarLogin = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        senha = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        login = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passSenha = new javax.swing.JPasswordField();
        btnEsqueciSenha = new javax.swing.JButton();
        checkSalvarSenha = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(1, 45, 95));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("add logo");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 39, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 110, 90));

        btnCadastrarLogin.setText("CADASTRAR");
        btnCadastrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnCadastrarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 200, 380));

        btnEntrar.setText("ENTRAR");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        senha.setText("Senha");
        jPanel1.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        jPanel1.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 270, -1));

        login.setText("Login");
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel2.setText("LOGIN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        passSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(passSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 270, -1));

        btnEsqueciSenha.setText("Esqueci minha senha");
        btnEsqueciSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsqueciSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEsqueciSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, -1));

        checkSalvarSenha.setText("Salvar senha");
        jPanel1.add(checkSalvarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void passSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passSenhaActionPerformed

    private void btnEsqueciSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsqueciSenhaActionPerformed
       java.awt.EventQueue.invokeLater(() -> new TelaResetSenha() .setVisible(true));
    }//GEN-LAST:event_btnEsqueciSenhaActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCadastrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarLoginActionPerformed
       TelaCadastro telaCadastro = new TelaCadastro();
       
       
       telaCadastro.setVisible(true);
        
        
        
        
        
    }//GEN-LAST:event_btnCadastrarLoginActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarLogin;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnEsqueciSenha;
    private javax.swing.JCheckBox checkSalvarSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel login;
    private javax.swing.JPasswordField passSenha;
    private javax.swing.JLabel senha;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
