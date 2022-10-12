package service;

import model.Desempenho;
import model.Funcionario;

import java.math.BigDecimal;

public class ReajusteSalarial {

//    public void reajusteSalarial(Funcionario funcionario, Desempenho desempenho) {
//        switch (desempenho){
//            case A_DESEJAR -> funcionario.setSalario(funcionario.getSalario().add(funcionario.getSalario().multiply(Desempenho.A_DESEJAR.percentual)));
//            case BOM -> funcionario.setSalario(funcionario.getSalario().add(funcionario.getSalario().multiply(Desempenho.BOM.percentual)));
//            case OTIMO -> funcionario.setSalario(funcionario.getSalario().add(funcionario.getSalario().multiply(Desempenho.OTIMO.percentual)));
//        }
//
//    }

    public void calculaReajusteSalarial(Funcionario funcionario, Desempenho desempenho){
        BigDecimal novoSalario = funcionario.getSalario().add(funcionario.getSalario().multiply(desempenho.percentual));
        funcionario.setSalario(novoSalario);
    }

}
