public class RegistroNota {
    private String matricula;
    private String nomeAluno;
    private double[] notas;
    private int quantidadePresenca;

    public RegistroNota() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public int getQuantidadePresenca() {
        return quantidadePresenca;
    }

    public void setQuantidadePresenca(int quantidadePresenca) {
        this.quantidadePresenca = quantidadePresenca;
    }
}

