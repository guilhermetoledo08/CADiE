
package Model.DAO;

import Connection.Conexao;
import Model.bean.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import static java.lang.System.exit;


public class UsuarioDAO {
   Connection con = null;  
    public boolean excluir (Usuario u1) throws SQLException{
        boolean excluir = false;
        try{
            con = new Conexao().getConnection();
            String sql = "DELETE FROM usuarios WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, u1.getCodigo());
            stmt.execute();
            stmt.close();
            excluir=true;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro","Erro", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            con.close();
        }
        return excluir;
    }
    
   public boolean cadastra(Usuario u1) throws SQLException{
       boolean cadastra = false;
       try {
           con = new Conexao().getConnection();
           String sql = "INSERT INTO usuarios (NOME, EMAIL, SENHA, DESCRICAO, USUARIO) values (?, ?, ?, ?, ?)";
          PreparedStatement stmt = con.prepareStatement(sql);
          stmt.setString(1, u1.getNome());
          stmt.setString(2, u1.getEmail());
          stmt.setString(3, u1.getSenha());
          stmt.setString(4, u1.getDescricao());
          stmt.setString(5, u1.getUsuario());
          stmt.execute();
          stmt.close();
          cadastra = true;
         
       } catch (Exception e){
          e.printStackTrace();
       }finally
       {
           con.close();
       }
       return cadastra;
             
   }
    
}
