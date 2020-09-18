package com.company.strategy.operador;

import com.company.strategy.OperadorAritmetico;

public class Subtracao implements OperadorAritmetico {

    private int valorA;
    private int valorB;

    public Subtracao(int valorA, int valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    @Override
    public int realizaOperacao() {
        return valorA > valorB ? valorA - valorB : valorB - valorA;
    }
}
