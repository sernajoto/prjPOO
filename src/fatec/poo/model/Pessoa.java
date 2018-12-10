package fatec.poo.model;

/**
 *
 * @author Guilherme Sernajoto
 */
public class Pessoa {

    private String nome;
    private String dataNasc;
    private String endereco;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    private String celular;
    private String sexo;
    private String estadoCivil;
    private String rg;
    private String cpf;
    private String email;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static boolean validarCPF(String cpf) {
        int i, d1, d2, mpl;
        boolean flag = false;

        if (cpf.length() != 11) {
            return false;
        } else {
            for (i = 0; i < 10; i++) {
                if (cpf.charAt(i) != cpf.charAt(i + 1)) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                return false;
            }

            for (i = d1 = 0, mpl = 10; i < 9; i++, mpl--) {
                d1 += Integer.parseInt(String.valueOf(cpf.charAt(i))) * mpl;
            }

            for (i = d2 = 0, mpl = 11; i < 10; i++, mpl--) {
                d2 += Integer.parseInt(String.valueOf(cpf.charAt(i))) * mpl;
            }

            d1 = (d1 * 10) % 11;
            d2 = (d2 * 10) % 11;

            if (d1 == 10) {
                d1 = 0;
            }
            if (d2 == 10) {
                d2 = 0;
            }

            if (d1 == Integer.parseInt(String.valueOf(cpf.charAt(9))) && d2 == Integer.parseInt(String.valueOf(cpf.charAt(10)))) {
                return true;
            } else {
                return false;
            }
        }
    }
}
