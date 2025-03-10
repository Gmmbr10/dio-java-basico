package exemploOrientacao;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa giovanne = new Pessoa("11111111","Giovanne");

        giovanne.setEndereco("Cambuci");

        System.out.println(giovanne.getNome() + " - " + giovanne.getCpf());
    }
}
