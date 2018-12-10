package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Guilherme Sernajoto
 */
public class Turma {

    private String siglaTurma;
    private String descricao;
    private String dataInicio;
    private String dataTermino;
    private String periodo;
    private int qtdeVagas;
    private Instrutor instrutor;
    private Curso curso;
    private ArrayList<Matricula> matriculas;

    public Turma(String siglaTurma, String descricao) {
        this.siglaTurma = siglaTurma;
        this.descricao = descricao;
        matriculas = new ArrayList<>();
    }

    public String getSiglaTurma() {
        return siglaTurma;
    }

    public void setSiglaTurma(String siglaTurma) {
        this.siglaTurma = siglaTurma;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getQtdeVagas() {
        return qtdeVagas;
    }

    public void setQtdeVagas(int qtdeVagas) {
        this.qtdeVagas = qtdeVagas;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void addMatricula(Matricula matricula) {
        matriculas.add(matricula);
        matricula.setTurma(this);
    }

    public void remMatricula(Matricula matricula) {
        matriculas.remove(matricula);
        matricula.setTurma(null);
    }
    
    public void emitirListaFrquencia() {

    }

}
