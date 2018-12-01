package fatec.poo.model;

/**
 *
 * @author Guilherme Sernajoto
 */
public class AVista {

    private double valor;
    private int agencia;
    private int nCheque;
    private String preData;
    private int codAvista;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getPreData() {
        return preData;
    }

    public void setPreData(String preData) {
        this.preData = preData;
    }

    public int getnCheque() {
        return nCheque;
    }

    public void setnCheque(int nCheque) {
        this.nCheque = nCheque;
    }

    public int getCodAvista() {
        return codAvista;
    }

    public void setCodAvista(int codAvista) {
        this.codAvista = codAvista;
    }

}
