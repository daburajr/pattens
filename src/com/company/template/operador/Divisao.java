package com.company.template.operador;

public class Divisao extends TemplateOperador {

    public Divisao(int valorA, int valorB) {
        super(valorA, valorB);
    }

    @Override
    protected int operacao(int valorA, int valorB) {
        return valorA / valorB;
    }

}
