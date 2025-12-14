package List.Ordenacao;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Chines", 19, 168);
        Pessoa pessoa2 = new Pessoa("Gabriel", 25, 178);
        Pessoa pessoa3 = new Pessoa("Julia", 20, 160);

        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.addPessoa(pessoa1);
        ordenacaoPessoa.addPessoa(pessoa2);
        ordenacaoPessoa.addPessoa(pessoa3);

        for (Pessoa pessoa : ordenacaoPessoa.listPessoa){
            System.out.println(pessoa);
        }

        System.out.println("------------");

        System.out.println("Ordenacao por idade");
        List<Pessoa> ordenacaoPessoaPorIdade = ordenacaoPessoa.ordenarPorIdade();

        for (Pessoa pessoa : ordenacaoPessoaPorIdade){
            System.out.println(pessoa);
        }

        System.out.println("------------");

        System.out.println("Ordenacao por Altura");
        List<Pessoa> ordenacaoPessoaPorAltura = ordenacaoPessoa.ordenarPorAltura();

        for (Pessoa pessoa : ordenacaoPessoaPorAltura){
            System.out.println(pessoa);
        }

    }
}
