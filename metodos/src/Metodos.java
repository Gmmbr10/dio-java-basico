public class Metodos {

    public double somar(int n1,int n2) {
        // quando definimos um tipo de dado específico, devemos sempre retornar
        // PRECISA DO return
        return n1 + n2;
    }

    public void exibirTexto(String texto) {
        // quando não temos retorno, não é necessário utilizar return
        // ou usamos apenas return;
        System.out.println(texto);
        return;
    }

    // throws Exception: indica que o metodo pode retornar uma exceção
    public double dividir(int dividendo, int divisor) throws Exception {}

    // metodo não pode ser visto por outras classes
    private void metodoPrivado() {}

}
