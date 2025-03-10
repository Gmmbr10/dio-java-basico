package enums;

public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadosBrasileiros estado : EstadosBrasileiros.values()) {
            System.out.println(estado.getSigla() + " - " + estado.getNome());
        }

        EstadosBrasileiros estadoBrasileiro = EstadosBrasileiros.SAO_PAULO;

        System.out.println(estadoBrasileiro.getNome());
    }
}
