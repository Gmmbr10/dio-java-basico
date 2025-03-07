public class ExemploPilha {
    public static void main(String[] args) {
        System.out.println("Iniciou o programa");
        a();
        System.out.println("Finalizou o programa");
    }

    private static void a() {
        System.out.println("Entrou no método a");
        b();
        System.out.println("Finalizou o método a");
    }

    private static void b() {
        System.out.println("Entrou no método b");
        for (int i = 0 ; i <= 4 ; i++)
            System.out.println(i);
        System.out.println("Finalizou o método b");
    }

}
