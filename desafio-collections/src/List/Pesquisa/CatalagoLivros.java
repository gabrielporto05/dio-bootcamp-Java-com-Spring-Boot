package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {

    List<Livro> listLivros;

    public CatalagoLivros() {
        this.listLivros = new ArrayList<>();
    }

    public void addLivro(Livro livro) {
        this.listLivros.add(livro);
    }

    public List<Livro> pesquisaPorTitulo(String titulo) {

        if (listLivros.isEmpty() || titulo.isEmpty()) {
            return List.of();
        }

        List<Livro> listLivrosPorTitulo = new ArrayList<>();
        for (Livro livro : listLivros) {
            if (livro.getTitulo().contains(titulo)) {
                listLivrosPorTitulo.add(livro);
            }
        }

        return listLivrosPorTitulo;

    }

    public List<Livro> pesquisaPorIntervaloAno(int anoInicio, int anoFim) {

        if (listLivros.isEmpty() || anoInicio > anoFim) {
            return List.of();
        }

        List<Livro> listLivrosPorIntervaloAno = new ArrayList<>();
        for (Livro livro : listLivros) {
            if (anoInicio <= livro.getAnoPublicacao()  && anoFim >= livro.getAnoPublicacao()) {
                listLivrosPorIntervaloAno.add(livro);
            }
        }

        return listLivrosPorIntervaloAno;

    }

}
