import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private List<Pagina> pagina;


    public Livro(String titulo, String autor, Pagina pagina) {
        this.titulo = titulo;
        this.autor = autor;
        this.pagina = new ArrayList<Pagina>();
    }

    public void addPagina(Pagina pagina) {
        this.pagina.add(pagina);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", pagina=" + pagina +
                '}';
    }
}