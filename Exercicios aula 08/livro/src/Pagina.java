public class Pagina {

    private int numero;
    private String conteudo;

    public Pagina(int numero, String conteudo) {
        this.numero = numero;
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Pagina{" +
                "numero=" + numero +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }
}
