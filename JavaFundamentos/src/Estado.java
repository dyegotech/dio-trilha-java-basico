public enum Estado {

    SAO_PAULO("São Paulo", "SP"),
    ACRE("Acre", "AC")
    
    
    ;

    private String nome;
    private String sigla;

    private Estado(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

}
