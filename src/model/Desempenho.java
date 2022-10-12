package model;

import java.math.BigDecimal;

public enum Desempenho {
    A_DESEJAR("0.03"),
    BOM("0.15"),
    OTIMO("0.20");

    public final BigDecimal percentual;

     Desempenho(String percentual){
        this.percentual = new BigDecimal(percentual);
    }
}
