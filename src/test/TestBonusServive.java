package test;

import model.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.BonusService;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TestBonusServive {

    @Test
    public void bonusMaiorQueMil(){
        Funcionario funcionarioTeste = new Funcionario("model.Funcionario Teste", LocalDate.now(), new BigDecimal("25000"));
        BonusService bonusService = new BonusService();
        //BigDecimal bonus = bonusService.calcularBonus(funcionarioTeste);

        Assertions.assertThrows(IllegalArgumentException.class, () -> bonusService.calcularBonus(funcionarioTeste));
    }

    @Test
    public void bonusDeMil(){
        Funcionario funcionarioTeste = new Funcionario("model.Funcionario Teste", LocalDate.now(), new BigDecimal("10000"));
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(funcionarioTeste);

        Assertions.assertEquals(new BigDecimal("1000.0"), bonus);
    }

    @Test
    public void bonusMenorQueMil(){
        Funcionario funcionarioTeste = new Funcionario("model.Funcionario Teste", LocalDate.now(), new BigDecimal("2500"));
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(funcionarioTeste);

        Assertions.assertEquals(new BigDecimal("250.0"), bonus);
    }

}
