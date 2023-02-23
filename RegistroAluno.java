import javax.swing.*;

public class RegistroAluno {
    public static void main(String[] args) {

        double[] notas = new double[3];
        double mediaNotas = 0;
        double percentualPresenca = 0;
        double totalNotas = 0;

        RegistroNota registroNotaAluno = new RegistroNota();

        registroNotaAluno.setMatricula(JOptionPane.showInputDialog("Qual a Matrícula do Aluno: "));
        registroNotaAluno.setNomeAluno(JOptionPane.showInputDialog("Qual o nome do Aluno: "));

        for(int i = 0; i < 3; ++i) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota nº" + (i+1)));
        }

        registroNotaAluno.setNotas(notas);
        registroNotaAluno.setQuantidadePresenca(Integer.parseInt(JOptionPane.showInputDialog("Informe Quantidade de Presença: ")));

        double notasAluno[] = registroNotaAluno.getNotas();
        for(int i=0; i < 3; i++){
            totalNotas += notasAluno[i];
        }
        mediaNotas = totalNotas / 3;

        percentualPresenca = (registroNotaAluno.getQuantidadePresenca()/60.0)*100;

        System.out.println("Nome do aluno: " + registroNotaAluno.getNomeAluno() + "\nMédia:" + mediaNotas
                            + "\nPercentual de presença: " + percentualPresenca);
    }
}
