package main.java.composite;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario{
    private List<Funcionario> subordinados;

    public Gerente(String nome){
        super(nome);
        this.subordinados = new ArrayList<Funcionario>();
    }

    public void addSubordinado(Funcionario funcionario){ this.subordinados.add(funcionario); }

    public String getInfo(){
        String saida = "";
        saida = "Gerente: " + this.getNome() + "\n";
        for(Funcionario funcionario : subordinados) {
            saida += funcionario.getInfo();
        }
        return saida;
    }
}
