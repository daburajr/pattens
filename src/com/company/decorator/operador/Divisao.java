package com.company.decorator.operador;

import com.company.decorator.OperadorComposto;

public class Divisao extends OperadorComposto {

    public Divisao(int valorA, int valorB) {
        super(valorA, valorB);
    }

    public Divisao(OperadorComposto operadorComposto, int valorA, int valorB) {
        super(operadorComposto, valorA, valorB);
    }

    @Override
    public int realizaOperacao() {
        return (valorA / valorB) + realizaOutraOperacao();
    }
}
