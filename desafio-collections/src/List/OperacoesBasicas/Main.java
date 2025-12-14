package List.OperacoesBasicas;

public class Main {
    public static void main(String[] args) {

//        Tarefa tarefa1 = new Tarefa(1, "Descricao da terefa 1");
//        Tarefa tarefa2 = new Tarefa(2, "Descricao da terefa 2");
//        Tarefa tarefa3 = new Tarefa(3, "Descricao da terefa 3");
//
//        ListaTarefas listaTarefas = new ListaTarefas();
//        listaTarefas.adicionarTarefa(tarefa1);
//        listaTarefas.adicionarTarefa(tarefa2);
//        listaTarefas.adicionarTarefa(tarefa3);
//
//        listaTarefas.removerTarefa(tarefa1.getId());
//
//        listaTarefas.getTarefas();
//        System.out.println(listaTarefas.numeroTotalDeTarefas());

        Item item1 = new Item(1, "pc", 5, 6000.00);
        Item item2 = new Item(2, "notebook", 2, 4000.00);
        Item item3 = new Item(3, "mouse", 35, 200.00);

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem(item1);
        carrinhoDeCompras.adicionarItem(item2);
        carrinhoDeCompras.adicionarItem(item3);

        carrinhoDeCompras.getItens();

        System.out.println("Preço total de itens: " + carrinhoDeCompras.valorTotal());


    }
}