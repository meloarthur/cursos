package cursos;

public class Curso {

    private String nome;
    private String turno;
    private double qtdHoras;
    private int qtdAlunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(double qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

}
