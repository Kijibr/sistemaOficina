package Dao;


import Classes.Peca;
import Conexao.Conecta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoPeca {
    private Connection con;
    
    public DaoPeca(){
        this.con = new Conecta().getConnection();   
        }
            public void cadastrar(Peca cli){
                try{
                    PreparedStatement p = con.prepareStatement
                            ("insert into peca"
                                    + "nome, preco_unitario, qt_estoque"
                                        + "values(?,?,?)");
                    
                    p.setString(1, cli.getNome());
                    p.setDouble(2, cli.getPreco_unitario());
                    p.setString(3, cli.getQt_estoque());
        }catch(SQLException erro){
                    throw new RuntimeException(erro);
        }
    }

    public void buscacod(Peca pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}