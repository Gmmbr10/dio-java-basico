package repeticao.exception.example;

public class CepFormatter{
    public static void main(String[] args) {
        try {
            String cepFormatado = cepFormat("11111111");
            System.out.println(cepFormatado);
        } catch (CepFormatException e) {
            System.out.println("O cep não está de acordo com as regras de neǵocio");
        }
    }
    private static String cepFormat(String cep) throws CepFormatException {
        if ( cep.length() != 8 )
            throw new CepFormatException();

        return "11.111-111";
    }
}
