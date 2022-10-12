package test;

import model.Desempenho;
import model.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.ReajusteSalarial;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TestReajusteSalarial {

    private Funcionario funcionario;
    private ReajusteSalarial reajusteSalarial;

    @BeforeEach
    public void inicializar(){
        this.funcionario = new Funcionario("model.Funcionario Teste", LocalDate.now(), new BigDecimal("1000"));
        this.reajusteSalarial = new ReajusteSalarial();
    }

    @Test
    public void reajusteDesempenhoADesejar() {
        reajusteSalarial.calculaReajusteSalarial(funcionario, Desempenho.A_DESEJAR);
        Assertions.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDesempenhoBom() {
        reajusteSalarial.calculaReajusteSalarial(funcionario, Desempenho.BOM);
        Assertions.assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDesempenhoOtimo() {
        reajusteSalarial.calculaReajusteSalarial(funcionario, Desempenho.OTIMO);
        Assertions.assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }


}
