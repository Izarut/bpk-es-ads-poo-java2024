public class Aluno {
    private String nome;
    private int matricula;
    private String curso;

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    public void media(int a, int b, int c){
        System.out.printf("a media das 3 notas eh: %d\n",(a+b+c)/3);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}';
    }
}
