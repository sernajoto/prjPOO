package fatec.poo.model;

/**
 *
 * @author Guilherme Sernajoto
 */
public class APrazo {

    private double valor;
    private String dtVencimento;
    private double taxaJuros;
    private int qtdeMensalidade;
    private int codAprazo;

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public String getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(String dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public int getQtdeMensalidade() {
        return qtdeMensalidade;
    }

    public void setQtdeMensalidade(int qtdeMensalidade) {
        this.qtdeMensalidade = qtdeMensalidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodAprazo() {
        return codAprazo;
    }

    public void setCodAprazo(int codAprazo) {
        this.codAprazo = codAprazo;
    }

}
