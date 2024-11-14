public class Professor {
    private String nome;
    private int salario;
    private String disciplina;

    public Professor(String nome, int salario, String disciplina) {
        this.nome = nome;
        this.salario = salario;
        this.disciplina = disciplina;
    }
    public void darAula(){
        System.out.println("dando aula");
    }
    public void corrigirProva(){
        System.out.println("corrigindo prova");
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}
