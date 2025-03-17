package set.Pesquisa.ListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefaSet.add(new Tarefa(descricao));
    }

    public Tarefa removerTarefa(String descricao) {
        Tarefa tarefaRemovida = null;

        if ( !this.tarefaSet.isEmpty() ) {

            for ( Tarefa tarefa : this.tarefaSet ) {
                if ( tarefa.getDescricao().equalsIgnoreCase(descricao) ) {
                    tarefaRemovida = tarefa;
                    break;
                }
            }

            this.tarefaSet.remove(tarefaRemovida);

        }

        return tarefaRemovida;
    }

    public void exibirTarefas() {
        System.out.println(this.tarefaSet);
    }

    public int contarTarefas() {
        return this.tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidasSet = new HashSet<>();

        if ( !this.tarefaSet.isEmpty() ) {
            for ( Tarefa tarefa : this.tarefaSet ) {
                if ( tarefa.isConcluido() ) { tarefasConcluidasSet.add(tarefa); }
            }
        }

        return tarefasConcluidasSet;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentesSet = new HashSet<>();

        if ( !this.tarefaSet.isEmpty() ) {
            for ( Tarefa tarefa : this.tarefaSet ) {
                if ( !tarefa.isConcluido() ) { tarefasPendentesSet.add(tarefa); }
            }
        }

        return tarefasPendentesSet;
    }

    public Tarefa marcarTarefaConcluida(String descricao) {
        Tarefa tarefaConcluida = null;
        if ( !this.tarefaSet.isEmpty() ) {
            for ( Tarefa tarefa : this.tarefaSet ) {
                if ( tarefa.getDescricao().equalsIgnoreCase(descricao) ) {
                    tarefa.setConcluido(true);
                    tarefaConcluida = tarefa;
                    break;
                }
            }
        }
        return tarefaConcluida;
    }

    public Tarefa marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente = null;
        if ( !this.tarefaSet.isEmpty() ) {
            for ( Tarefa tarefa : this.tarefaSet ) {
                if ( tarefa.getDescricao().equalsIgnoreCase(descricao) ) {
                    tarefa.setConcluido(false);
                    tarefaPendente = tarefa;
                    break;
                }
            }
        }
        return tarefaPendente;
    }

    public void limparListaTarefas() {
        this.tarefaSet.clear();
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }

}
