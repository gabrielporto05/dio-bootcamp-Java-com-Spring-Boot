package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    List<Pessoa> listPessoa;

    public OrdenacaoPessoa() {
        this.listPessoa = new ArrayList<>();
    }

    public void addPessoa(Pessoa pessoa) {
        this.listPessoa.add(pessoa);
    }

    public List<Pessoa> ordenarPorIdade() {

        List<Pessoa> listOrdenadaIdade = new ArrayList<>(listPessoa);
        Collections.sort(listOrdenadaIdade);

        return listOrdenadaIdade;

    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> listOrdenadaAltura = new ArrayList<>(listPessoa);
        Collections.sort(listOrdenadaAltura, new ComparatorPorAltura());

        return listOrdenadaAltura;
    }


}
