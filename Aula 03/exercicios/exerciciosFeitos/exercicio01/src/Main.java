public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("o ome das calsa erguida","matue",333);
        System.out.println(livro);
        livro.lerPagina();
        livro.abrirFecharLivro();
        livro.lerPagina();
        System.out.println(livro);
    }
}