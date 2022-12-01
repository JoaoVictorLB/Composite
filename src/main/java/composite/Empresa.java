package main.java.composite;

public class Empresa {
    private Funcionario gestor;

    public void setChefe(Funcionario funcionario){ this.gestor = funcionario; }

    public String getHierarquia(){
        if(this.gestor == null){
            throw new NullPointerException("Empresa sem gestor");
        }
        return this.gestor.getInfo();
    }
}
