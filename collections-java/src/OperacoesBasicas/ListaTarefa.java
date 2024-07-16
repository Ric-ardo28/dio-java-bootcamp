package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefas> tarefasList;

    public ListaTarefa() {
        this.tarefasList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao) {
        tarefasList.add(new Tarefas(descricao));
    }
    public void removerTarefa(String descricao) {
        List<Tarefas> tarefasParaRemover = new ArrayList<>();
        for (Tarefas t : tarefasList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefasList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefasList.size();
    }
    public void obterDescricaoTarefa() {
        System.out.println(tarefasList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de elementos na lista é : " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista é : " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista é : " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricaoTarefa();





    }
}
