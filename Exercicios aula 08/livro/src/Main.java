public class Main {
    public static void main(String[] args) {

        Pagina pagina1 = new Pagina(1, "eu amo bosta");
        Livro livro1 = new Livro("as 100 camadas de merda!", "izas",pagina1);

        Pagina pagina2 = new Pagina(2,"mentira, eu gosto é de Merda!");

        livro1.addPagina(pagina1);
        livro1.addPagina(pagina2);

        System.out.println(livro1);
    }
}
