package List.Pesquisa;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Livro 1", "chines", 2005);
        Livro livro2 = new Livro("Livro 2", "gabriel", 2007);
        Livro livro3 = new Livro("Livro 3", "julia", 2010);
        Livro livro4 = new Livro("Livro 4", "chines", 2020);

        CatalagoLivros catalagoLivros = new CatalagoLivros();

        catalagoLivros.addLivro(livro1);
        catalagoLivros.addLivro(livro2);
        catalagoLivros.addLivro(livro3);
        catalagoLivros.addLivro(livro4);

        System.out.println(catalagoLivros.pesquisaPorTitulo("Livro 1"));

        System.out.printf("\n-----------------------\n\n");

        System.out.println(catalagoLivros.pesquisaPorIntervaloAno(2000, 2010));

    }
}
