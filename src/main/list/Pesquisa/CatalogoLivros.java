package main.list.Pesquisa;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo

    private final List<Livro> livroList;

    public CatalogoLivros() {this.livroList = new ArrayList<>();}
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    //METODO QUE PESQUISA POR AUTOR

    public List<Livro> pesquisaPublicacao(String autor) {
        List<Livro> livroPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }



    //METODO QUE PESQUISA POR LIVRO;
    public  List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livroPorIntervalosAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() >= anoFinal) {
                    livroPorIntervalosAnos.add(l);
                }
            }
        }
        return livroPorIntervalosAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
}
