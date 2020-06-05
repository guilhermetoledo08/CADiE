/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.DAO;

import Connection.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Model.bean.Exemplo;
import java.sql.Connection;
import java.sql.SQLException;

public class ExemploDAO {
    Connection con = null;
    public Boolean inserir(Exemplo exemplo) throws SQLException, ClassNotFoundException
    {
        Boolean retorno = false;
        con = new Conexao().getConnection();
        String sql = "INSERT INTO usuarios (foto) values (?)";
        
        PreparedStatement pst = con.prepareStatement(sql);
        try
        {
            pst.setBytes(1, exemplo.getImagem());
            pst.executeUpdate();
            retorno = true;
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        return retorno;
    
    }
    
    public Exemplo buscar(Integer id) throws SQLException
    {
        Exemplo retorno = null;
        String sql = "SELECT id,foto from exemplo where id=?";
        PreparedStatement pst = con.prepareStatement(sql);
        
        try {
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if(rs.next())
            {
                retorno = new Exemplo();
                retorno.setId(rs.getInt("id"));
                retorno.setImagem(rs.getBytes("foto"));
            
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            retorno = null;
        }
        
        return retorno;
    
    }
    
}
