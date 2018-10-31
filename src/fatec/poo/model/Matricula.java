package fatec.poo.model;

/**
 *
 * @author Guilherme Sernajoto
 */
public class Matricula {
    
    private String data;
    private int qtdeFaltas;
    private double nota;
    private Aluno aluno;
    private Turma turma;
    private AVista aVista;
    private APrazo aPrazo;

    public Matricula(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public int getQtdeFaltas() {
        return qtdeFaltas;
    }

    public void setQtdeFaltas(int qtdeFaltas) {
        this.qtdeFaltas = qtdeFaltas;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
        aluno.setMatricula(this);
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    public void emitirCarne(){
        
    }

    public AVista getaVista() {
        return aVista;
    }

    public void setaVista(AVista aVista) {
        this.aVista = aVista;
    }

    public APrazo getaPrazo() {
        return aPrazo;
    }

    public void setaPrazo(APrazo aPrazo) {
        this.aPrazo = aPrazo;
    }

}
