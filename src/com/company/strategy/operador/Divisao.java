package com.company.strategy.operador;

import com.company.strategy.OperadorAritmetico;

public class Divisao implements OperadorAritmetico {

    private int valorA;
    private int valorB;

    public Divisao(int valorA, int valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    @Override
    public int realizaOperacao() {
        return valorA / valorB;
    }
}
