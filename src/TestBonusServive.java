import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TestBonusServive {

    @Test
    public void bonusMaiorQueMil(){
        Funcionario funcionarioTeste = new Funcionario("Funcionario Teste", LocalDate.now(), new BigDecimal("25000"));
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(funcionarioTeste);

        Assertions.assertEquals(BigDecimal.ZERO, bonus);
    }

    @Test
    public void bonusDeMil(){
        Funcionario funcionarioTeste = new Funcionario("Funcionario Teste", LocalDate.now(), new BigDecimal("10000"));
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(funcionarioTeste);

        Assertions.assertEquals(new BigDecimal("1000.0"), bonus);
    }

    @Test
    public void bonusMerQueMil(){
        Funcionario funcionarioTeste = new Funcionario("Funcionario Teste", LocalDate.now(), new BigDecimal("2500"));
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(funcionarioTeste);

        Assertions.assertEquals(new BigDecimal("250.0"), bonus);
    }

}
