package cursos;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        Curso cursos[] = new Curso[4];
        
        String numero = JOptionPane.showInputDialog("Informe o número de cursos a serem registrados: ");
        int n = Integer.parseInt(numero);

        for (int i = 0; i < n; i++) {
            Curso curso = new Curso();
            String nome = JOptionPane.showInputDialog("Digite o nome do curso: ");
            String turno = JOptionPane.showInputDialog("Digite o turno do curso: ");
            String qtdHorasCurso = JOptionPane.showInputDialog("Digite a quantidade de horas do curso: ");
            String qtdAlunosCurso = JOptionPane.showInputDialog("Digite a quantidade de alunos do curso: ");
            double qtdHoras = Double.parseDouble(qtdHorasCurso);
            int qtdAlunos = Integer.parseInt(qtdAlunosCurso);

            curso.setNome(nome);
            curso.setTurno(turno);
            curso.setQtdHoras(qtdHoras);
            curso.setQtdAlunos(qtdAlunos);

            cursos[i] = curso;
        }

        for (int i = 0; i < n; i++) {
            JOptionPane.showMessageDialog(null,
                    "***CURSO #" + (i+1) + "***\n\n" + "Nome: " + cursos[i].getNome() + "\nTurno: " + cursos[i].getTurno() + "\nQuantidade de horas: "
                            + cursos[i].getQtdHoras() + "\nQuantidade de alunos: " + cursos[i].getQtdAlunos());
        }

    }

}
