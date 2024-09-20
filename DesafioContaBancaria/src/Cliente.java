public class Cliente {
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return nome + " - " + cpf;
    }

}
