public class Cachorro {
    private String nome;
    private int idade;
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }
    public void latir(){
        System.out.println("au au!");
    }
    public void correr(){
        System.out.println("Correndo!");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", raca='" + raca + '\'' +
                '}';
    }
}
