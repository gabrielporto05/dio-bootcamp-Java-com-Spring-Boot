package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    public void removerItem(int item_id) {
        this.itens.remove(item_id - 1);
    }

    public double valorTotal() {
        double valorTotal = 0;
        for (Item item : this.itens) {
            valorTotal += item.getPreco();
        }

        return valorTotal;
    }

    public void getItens() {
        for (Item item : this.itens) {
            System.out.println(item);
        }
    }


}
