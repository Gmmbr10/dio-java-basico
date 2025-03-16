package list.OperacoesBasicas.ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        this.listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for ( Tarefa tarefa : listaTarefas ) {
            if ( tarefa.getDescricao().equalsIgnoreCase(descricao) ) {
                tarefasParaRemover.add(tarefa);
            }
        }
        this.listaTarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return this.listaTarefas.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(listaTarefas);
    }

    // testando o código
    public static void main(String[] args) {
        ListaTarefas minhasTarefas = new ListaTarefas();
        // adicionando tarefas
        minhasTarefas.adicionarTarefa("Fazer bootcamp");
        minhasTarefas.adicionarTarefa("Fazer bootcamp");
        minhasTarefas.adicionarTarefa("Ler livro");
        // ver número total de tarefas e as tarefas
        System.out.println(minhasTarefas.obterNumeroTotalTarefas());
        minhasTarefas.obterDescricoesTarefas();
        // removendo tarefa
        minhasTarefas.removerTarefa("Fazer bootcamp");
        minhasTarefas.obterDescricoesTarefas();
    }

}
