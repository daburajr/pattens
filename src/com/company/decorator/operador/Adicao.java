package com.company.decorator.operador;

import com.company.decorator.OperadorComposto;

public class Adicao extends OperadorComposto {

    public Adicao(OperadorComposto operadorAritmetico, int valorA, int valorB) {
        super(operadorAritmetico, valorA, valorB);
    }

    public Adicao(int valorA, int valorB) {
        super(valorA, valorB);
    }

    @Override
    public int realizaOperacao() {
        return (valorA + valorB) + realizaOutraOperacao();
    }

}
