package br.com.DAO;

import br.com.DTO.UsuarioDTO;
import br.com.Views.TelaPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void inserirUsuario(UsuarioDTO objUsuarioDTO) {
        String sql = "insert into tbusuarios(id_usuario, usuario, login, senha)" + "values(?, ?, ?, ?)";
        conexao = new ConexaoDAO().conector();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objUsuarioDTO.getId());
            pst.setString(2, objUsuarioDTO.getNomeUsuario());
            pst.setString(3, objUsuarioDTO.getLoginUsuario());
            pst.setString(4, objUsuarioDTO.getSenhaUsuario());

            pst.execute();
            pst.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Usuário Editado com" + e);
        }
    }

    public void apagar(UsuarioDTO objUsuarioDTO) {
        String sql = "delete from tbusuario where id_usuarip = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(4, objUsuarioDTO.getSenhaUsuario());
            int add = pst.executeUpdate();
            if (add > 0) {
                conexao.close();
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método apagar" + e);
        }
    }

    public void logar(UsuarioDTO objUsuarioDTO) {
        String sql = "select * from tbusuarios where login = ? and senha = ?";
        try {
            pst = conexao.prepareStatement(sql);
//pst.setString(1, txtUsuario.getText());
//pst.setString(2, txtSenha.getText());
            pst.setString(1, objUsuarioDTO.getLoginUsuario());
            pst.setString(2, objUsuarioDTO.getSenhaUsuario());

            rs = pst.executeQuery();

            if (rs.next()) {
                TelaPrincipal principal = new TelaPrincipal();
                principal.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha invalidos");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método Logar " + e);
        }
    }

    public void limparCampos() {
        TelaUsuario.txtIdUsu.setText(null);

    }

    public void editar(UsuarioDTO objUsuarioDTO) {
        String sql = "update tb_usuarios set usuario = ?, login = ?," + "senha - ? where id_usuario - ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(4, objUsuarioDTO.getId_usuario());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método editar" + e);
        }
public void apagar(){
      
            txtNomeUsuario.setText(null);
            txtLoginUsuario.setText(null);
           txtSenhaUsuario.setText(null);
          
}
    }
