import java.math.BigDecimal;

public class ReajusteSalarial {

    public BigDecimal reajusteSalarial(Funcionario funcionario, String desempenho) {
        BigDecimal novoSalario = new BigDecimal(0);
        if (desempenho.equalsIgnoreCase("A desejar")) {
            novoSalario = funcionario.getSalario().multiply(new BigDecimal("0.03")).add(funcionario.getSalario());
            funcionario.setSalario(novoSalario);
            return novoSalario;
        } else if (desempenho.equalsIgnoreCase("Bom")) {
            novoSalario = funcionario.getSalario().multiply(new BigDecimal("0.15")).add(funcionario.getSalario());
            funcionario.setSalario(novoSalario);
            return novoSalario;
        } else {
            novoSalario = funcionario.getSalario().multiply(new BigDecimal("0.20")).add(funcionario.getSalario());
            funcionario.setSalario(novoSalario);
            return novoSalario;
        }
    }

}
