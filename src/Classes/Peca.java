package Classes;

public class Peca {

    public int getIdpeca() {
        return idpeca;
    }

    public void setIdpeca(int idpeca) {
        this.idpeca = idpeca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public String getQt_estoque() {
        return qt_estoque;
    }

    public void setQt_estoque(String qt_estoque) {
        this.qt_estoque = qt_estoque;
    }
    private int idpeca;
    private String nome;
    private double preco_unitario;
    private String qt_estoque;
}
