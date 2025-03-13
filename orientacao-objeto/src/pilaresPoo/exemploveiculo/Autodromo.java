package pilaresPoo.exemploveiculo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.ligar();
        jeep.setChassi("12345");

        Moto z400 = new Moto();
        z400.setChassi("54321");
    }
}
