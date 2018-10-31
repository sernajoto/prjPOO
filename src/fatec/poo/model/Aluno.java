package fatec.poo.model;

/**
 *
 * @author Guilherme Sernajoto
 */
public class Aluno extends Pessoa {

    private String escolaridade;
    private Matricula matricula;

    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

}
