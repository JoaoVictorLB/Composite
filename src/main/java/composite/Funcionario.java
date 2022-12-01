package main.java.composite;

public abstract class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCargo(String nome) {
        this.nome = nome;
    }

    public abstract String getInfo();
}
