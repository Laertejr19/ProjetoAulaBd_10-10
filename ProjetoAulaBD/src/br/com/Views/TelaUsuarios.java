/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Views;

import br.com.DAO.ConexaoDAO;
import br.com.DAO.UsuarioDAO;
import br.com.DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.saolucas
 */
public class TelaUsuarios extends javax.swing.JFrame {

  Connection conexao = null;
  PreparedStatement pst = null;
  ResultSet rs = null;
  
    public TelaUsuarios() {
        initComponents();
        conexao = ConexaoDAO.conector();
        
    }
public void pesquisa(){
    String sql = "select * from tbusuarios where id_usuario = ?";
    try{
        pst = conexao.prepareStatement(sql);
     //   pst.setString(1, txtIDUsuario.getText());
        pst.setInt(1, objUsuarioDTO.getId_usuario());
        rs = pst.executeQuery();
        
        if(rs.next()){
            txtNomeUsuario.setText(rs.getString(2));
            txtLoginUsuario.setText(rs.getString(3));
           txtSenhaUsuario.setText(rs.getString(4));
            
        }else{
            JOptionPane.showMessageDialog(null, "Usuario não cadastrado!");
            txtNomeUsuario.setText(null);
            txtLoginUsuario.setText(null);
            
            dispose();
        }
      
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, "Método Pesquisar" + e);
    }
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIDUsuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtNomeUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLoginUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSenhaUsuario = new javax.swing.JPasswordField();
        btnLimpar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Usuários");
        setResizable(false);

        jLabel1.setText("ID");

        txtIDUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDUsuarioActionPerformed(evt);
            }
        });

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jLabel3.setText("Login");

        txtLoginUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginUsuarioActionPerformed(evt);
            }
        });

        jLabel4.setText("Senha");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jButton2.setText("Deletar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(2, 2, 2)))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtLoginUsuario, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInserir, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addGap(21, 21, 21)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addGap(65, 65, 65))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(jButton1)
                    .addComponent(btnLimpar)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //Chamada do Método Pesquisa
        pesquisa();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUsuarioActionPerformed

    private void txtLoginUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginUsuarioActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
       String id_usuario = txtIdUsuario.getText();
       
       UsuarioDTO objUsuarioDTO = new UsuarioDTO();
       objUsuarioDTO.setId_usuario(Integer.parseInt(id_usuario));
       objUsuarioDTO.apagar(objUsuarioDTO);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        //Captura de dados na tela Usuario
        int id_usuario = Integer.parseInt(txtIDUsuario.getText());
        String nome_usuario = txtNomeUsuario.getText();
        String login_usuario = txtLoginUsuario.getText();
        String senha_usuario = txtSenhaUsuario.getText();
        
            //Transferencia de dados para UsuarioDTO
            
            UsuarioDTO objUsuarioDTO = new UsuarioDTO();
            objUsuarioDTO.setId_usuario(id_usuario);
            objUsuarioDTO.setNomeUsuario(nome_usuario);
            objUsuarioDTO.setLoginUsuario(login_usuario);
            objUsuarioDTO.setSenhaUsuario(senha_usuario);
            //Criação do objeto da classe UsuarioDAO para inserir o usuario
            UsuarioDAO objUsuarioDAO = new UsuarioDAO();
            objUsuarioDAO.inserirUsuario(objUsuarioDTO);
            apagar();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         int id_usuario = Integer.parseInt(txtIDUsuario.getText());
        String nome_usuario = txtNomeUsuario.getText();
        String login_usuario = txtLoginUsuario.getText();
        String senha_usuario = txtSenhaUsuario.getText();
           
            //Transferencia de dados para UsuarioDTO
            UsuarioDTO objUsuarioDTO = new UsuarioDTO();
            objUsuarioDTO.setId_usuario((id_usuario));
            objUsuarioDTO.setNomeUsuario(nome_usuario);
            objUsuarioDTO.setLoginUsuario(login_usuario);
            objUsuarioDTO.setSenhaUsuario(senha_usuario);
            //Criação do objeto da classe UsuarioDAO para inserir o usuario
            UsuarioDAO objUsuarioDAO = new UsuarioDAO();
            objUsuarioDAO.editar(objUsuarioDTO);
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JTextField txtIDUsuario;
    private javax.swing.JTextField txtLoginUsuario;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JPasswordField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables
}
