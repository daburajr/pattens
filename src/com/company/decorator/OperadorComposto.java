package com.company.decorator;

import java.util.Objects;

public abstract class OperadorComposto implements OperadorAritmetico {

    protected int valorA;
    protected int valorB;
    protected OperadorComposto operadorAritmetico;

    public OperadorComposto(int valorA, int valorB) {
        this.valorA = valorA;
        this.valorB = valorB;

    }

    public OperadorComposto(OperadorComposto outroOperador, int valorA, int valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
        this.operadorAritmetico = outroOperador;
    }

    protected int realizaOutraOperacao() {
        return Objects.isNull(operadorAritmetico) ? 0 : operadorAritmetico.realizaOperacao();
    }

    public abstract int realizaOperacao();
}
