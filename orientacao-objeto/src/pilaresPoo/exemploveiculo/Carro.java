package pilaresPoo.exemploveiculo;

public class Carro extends Veiculo {

    @Override
    public void ligar() {
        this.conferirCambio();
        this.conferirCombustivel();
        System.out.println("Carro ligando");
    }

    private void conferirCambio() {
        System.out.println("Conferindo câmbio");
    }

    private void conferirCombustivel() {
        System.out.println("Conferindo combustível");
    }
}
