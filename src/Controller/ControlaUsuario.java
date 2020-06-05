package Controller;

import Model.DAO.UsuarioDAO;
import Model.bean.Usuario;
import java.sql.SQLException;

public class ControlaUsuario {
    
    public boolean excluiUsuario (int codigo) throws SQLException{
        Usuario  u1 = new Usuario(codigo);
        UsuarioDAO uDAO = new UsuarioDAO();
        boolean excluir = uDAO.excluir(u1);
        return excluir;
    }
     public boolean cadastraUsuario (String nome, String email, String senha, String descricao, String usuario) throws SQLException{
        Usuario u1 = new Usuario(nome, email, senha, descricao, usuario);
        UsuarioDAO uDAO = new UsuarioDAO();
        boolean cadastra  = uDAO.cadastra(u1);
        return cadastra;
        }
   
}