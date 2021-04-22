package Dao;

import Classes.Peca;
import Conexao.Conecta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



public class DaoPeca {
    private Connection con;
    private ResultSet rs;
    
    public DaoPeca(){
        this.con = new Conecta().getConnection();   
    }
        public void cadastrar(Peca pc){
            try{
                PreparedStatement p = con.prepareStatement
                    ("insert into peca"
                            + "(nome, preco_unitario, qt_estoque)"
                             + "values(?,?,?)");
                    
                    p.setString(1, pc.getNome());
                    p.setDouble(2, pc.getPreco_unitario());
                    p.setString(3, pc.getQt_estoque());
                    p.executeUpdate();
                    p.close();
                    
        }catch(SQLException erro){
                    throw new RuntimeException(erro);
        }
    }
            public void alterar(Peca pc){
                try{
                    PreparedStatement p = con.prepareStatement
                            ("update peca set nome = ?, preco_unitario = ?, qt_estoque = ? where"
                                    + "idpeca = '"+pc.getIdpeca()+"' ");
                    
                    p.setString(1, pc.getNome());
                    p.setDouble(2, pc.getPreco_unitario());
                    p.setString(3, pc.getQt_estoque());
                    p.executeUpdate();
                    p.close();
        }catch(SQLException erro){
                    throw new RuntimeException(erro);
        }
    }

            
            
            public void buscacod(Peca pc) {
                try{
                    PreparedStatement p = con.prepareStatement
                        ("select * from peca where idpeca = '"+pc.getIdpeca()+"'");
                    rs = p.executeQuery();

                    if(rs.first()) {
                        pc.setIdpeca(rs.getInt("idpeca"));
                        pc.setNome(rs.getString("nome"));
                        pc.setPreco_unitario(rs.getDouble("preco_unitario"));
                        pc.setQt_estoque(rs.getString("qt_estoque"));
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Esta peça não foi encontrado!");
                    }        
                 p.close();
                }
                catch(SQLException erro){
                    throw new RuntimeException (erro);
                }    
            }
            public void buscanome(Peca pc) {
                try{
                    PreparedStatement p = con.prepareStatement
                        ("select * from peca where nome = '"+pc.getIdpeca()+"'");
                    rs = p.executeQuery();

                    if(rs.first()) {
                        pc.setIdpeca(rs.getInt("idpeca"));
                        pc.setNome(rs.getString("nome"));
                        pc.setPreco_unitario(rs.getDouble("preco_unitario"));
                        pc.setQt_estoque(rs.getString("qt_estoque"));
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Esta peça não foi encontrado!");
                    }        
                 p.close();
                }
                catch(SQLException erro){
                    throw new RuntimeException (erro);
                }    
            }
            
            public List<Peca> PreenchePecas(){
        try{
            List<Peca> pecas;
            pecas = new ArrayList<Peca>();
             PreparedStatement p = con.prepareStatement
                     ("select * from peca");
             rs = p.executeQuery();
             
             while(rs.next()) {
                 Peca pc = new Peca();
                    pc.setIdpeca(rs.getInt("idpeca"));
                    pc.setNome(rs.getString("nome"));
                    pc.setPreco_unitario(rs.getDouble("preco_unitario"));
                    pc.setQt_estoque(rs.getString("qt_estoque"));
                 pecas.add(pc);
             }
             return pecas;
        }
        catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
}