public class Pessoa{
    private String nome;
    private int idade;
    private int altura;

    public Pessoa(String nome, int idade, int altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
