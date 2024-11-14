public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean abrido = false; //nao eh aberto, eh abrido!

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void abrirFecharLivro(){
        if(abrido){
            System.out.println("fechando livro");
            abrido = false;
        }else{
            System.out.println("abrindo livro");
            abrido = true;
        }
    }
    public void lerPagina(){
        if (numeroPaginas > 0){
            if(abrido){
                System.out.println("*lendo livro*");
            }else{
                System.out.println("livro ta fechado patrao");
            }
        }else{
            System.out.println("n tem pagina pra ler");
        }
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", abrido=" + abrido +
                '}';
    }
}
