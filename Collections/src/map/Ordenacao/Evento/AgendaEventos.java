package map.Ordenacao.Evento;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate,Evento> agendaEventos;

    public AgendaEventos() {
        this.agendaEventos = new HashMap<>();
    }

    public void adicionarEvento ( LocalDate data, String nome, String atracao ) {
        this.agendaEventos.put(data,new Evento(nome, atracao));
    }

    public void exibirAgenda () {
        Map<LocalDate,Evento> eventoPorData = new TreeMap<>(this.agendaEventos);
        System.out.println(eventoPorData);
    }

    public void obterProximoEvento () {
        LocalDate dataAtual = LocalDate.now();
        Evento proximoEvento = null;
        if ( !this.agendaEventos.isEmpty() ) {
            Map<LocalDate,Evento> eventoPorData = new TreeMap<>(this.agendaEventos);

            for ( Map.Entry<LocalDate,Evento> entry : eventoPorData.entrySet() ) {
                if ( entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual) ) {
                    proximoEvento = entry.getValue();
                    break;
                }
            }

            if ( proximoEvento == null ) System.out.println("Não há eventos");
            else System.out.println("Próximo evento: " + proximoEvento.getNome());

            return;
        }
        System.out.println("Agenda vazia");
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        // Adiciona eventos à agenda
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

        // Exibe a agenda completa de eventos
        agendaEventos.exibirAgenda();

        // Obtém e exibe o próximo evento na agenda
        agendaEventos.obterProximoEvento();
    }
}
