package com.company.decorator.operador;

import com.company.decorator.OperadorComposto;

public class Multiplicacao extends OperadorComposto {

    public Multiplicacao(int valorA, int valorB) {
        super(valorA, valorB);
    }

    public Multiplicacao(OperadorComposto operadorComposto, int valorA, int valorB) {
        super(operadorComposto, valorA, valorB);
    }

    @Override
    public int realizaOperacao() {
        return (valorA * valorB) + realizaOutraOperacao();
    }
}
