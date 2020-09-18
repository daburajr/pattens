package com.company.decorator.operador;

import com.company.decorator.OperadorComposto;

public class Subtracao extends OperadorComposto {

    public Subtracao(int valorA, int valorB) {
        super(valorA, valorB);
    }

    public Subtracao(OperadorComposto operadorComposto, int valorA, int valorB) {
        super(operadorComposto, valorA, valorB);
    }

    @Override
    public int realizaOperacao() {
        return (valorA > valorB ? valorA - valorB : valorB - valorA) + realizaOutraOperacao();
    }
}
