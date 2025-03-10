package enums;

public enum EstadosBrasileiros {
    SAO_PAULO("SP","São Paulo"),
    RIO_JANEIRO("RJ","Rio de Janeiro"),
    CEARA("CE","Ceará"),
    ;

    private String nome;
    private String sigla;

    private EstadosBrasileiros(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
