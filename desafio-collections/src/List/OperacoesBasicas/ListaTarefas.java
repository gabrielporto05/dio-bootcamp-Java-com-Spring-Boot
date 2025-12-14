package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    List<Tarefa> tarefas;

    public ListaTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefas.add(new Tarefa(tarefa.getId(), tarefa.getDescricao()));
    }

    public void removerTarefa(int tarefa_id) {
        this.tarefas.remove(tarefa_id - 1);
    }

    public int numeroTotalDeTarefas() {
        return this.tarefas.size();
    }

    public void getTarefas() {
        System.out.println("Lista Tarefas");
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa.getDescricao());
        }
    }


}
