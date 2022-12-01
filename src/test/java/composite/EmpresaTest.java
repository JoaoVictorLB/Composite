package test.java.composite;

import main.java.composite.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmpresaTest {
    @Test
    void deveRetornarInfosDaEmpresa(){
        Gerente gerente1 = new Gerente("João");
        Gerente gerente2 = new Gerente("Júllia");
        Gerente gerente3 = new Gerente("Juliana");
        Gerente gerenteGeral = new Gerente("Amanda");

        Desenvolvedor dev21 = new Desenvolvedor("Jorge", "Sênior");
        Desenvolvedor dev31 = new Desenvolvedor("Alice", "Júnior");
        Desenvolvedor dev32 = new Desenvolvedor("Elias", "Pleno");

        gerente2.addSubordinado(dev21);
        gerente3.addSubordinado(dev31);
        gerente3.addSubordinado(dev32);

        gerenteGeral.addSubordinado(gerente1);
        gerenteGeral.addSubordinado(gerente2);
        gerenteGeral.addSubordinado(gerente3);

        Empresa empresa = new Empresa();
        empresa.setChefe(gerenteGeral);

        assertEquals("Gerente: Amanda\n" +
                "Gerente: João\n" +
                "Gerente: Júllia\n" +
                "Desenvolvedor: Jorge - Nível: Sênior\n" +
                "Gerente: Juliana\n" +
                "Desenvolvedor: Alice - Nível: Júnior\n" +
                "Desenvolvedor: Elias - Nível: Pleno\n", empresa.getHierarquia());
    }

    @Test
    void deveRetornarExcecaoEmpresaSemGestor(){
        try{
            Empresa empresa = new Empresa();
            empresa.getHierarquia();
            fail();
        } catch(NullPointerException e){
            assertEquals("Empresa sem gestor", e.getMessage());
        }
    }
}
