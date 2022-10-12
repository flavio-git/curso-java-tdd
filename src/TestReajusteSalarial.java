import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TestReajusteSalarial {

    @Test
    public void reajusteDesempenhoADesejar(){
        ReajusteSalarial reajuste = new ReajusteSalarial();
        BigDecimal novoSalario = reajuste.reajusteSalarial(
                new Funcionario("Funcionario Teste", LocalDate.now(), new BigDecimal("1000")),
                "A desejar");

        Assertions.assertEquals(new BigDecimal("1030.00"), novoSalario);
    }

    @Test
    public void reajusteDesempenhoBom(){
        ReajusteSalarial reajuste = new ReajusteSalarial();
        BigDecimal novoSalario = reajuste.reajusteSalarial(
                new Funcionario("Funcionario Teste", LocalDate.now(), new BigDecimal("1000")),
                "Bom");

        Assertions.assertEquals(new BigDecimal("1150.00"), novoSalario);
    }

    @Test
    public void reajusteDesempenhoOtimo(){
        ReajusteSalarial reajuste = new ReajusteSalarial();
        BigDecimal novoSalario = reajuste.reajusteSalarial(
                new Funcionario("Funcionario Teste", LocalDate.now(), new BigDecimal("1000")),
                "Ótimo");

        Assertions.assertEquals(new BigDecimal("1200.00"), novoSalario);
    }


}
