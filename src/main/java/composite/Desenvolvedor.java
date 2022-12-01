package main.java.composite;

public class Desenvolvedor extends Funcionario {
    private String nivel;

    public Desenvolvedor(String nome, String nivel){
        super(nome);
        this.nivel = nivel;
    }

    public String getNivel(){ return nivel; }

    public void setNivel(String nivel){ this.nivel = nivel; }

    public String getInfo(){ return "Desenvolvedor: " + this.getNome() + " - Nível: " + nivel + "\n"; }
}
