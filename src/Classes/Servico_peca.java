package Classes;

public class Servico_peca {
    private int idservico_peca;
    private int idservico;
    private int idpeca;
    private String qt_usada;

    public int getIdservico_peca() {
        return idservico_peca;
    }

    public void setIdservico_peca(int idservico_peca) {
        this.idservico_peca = idservico_peca;
    }

    public int getIdservico() {
        return idservico;
    }

    public void setIdservico(int idservico) {
        this.idservico = idservico;
    }

    public int getIdpeca() {
        return idpeca;
    }

    public void setIdpeca(int idpeca) {
        this.idpeca = idpeca;
    }

    public String getQt_usada() {
        return qt_usada;
    }

    public void setQt_usada(String qt_usada) {
        this.qt_usada = qt_usada;
    }
}
