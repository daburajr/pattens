package com.company.template.operador;

public class Adicao extends TemplateOperador {

    public Adicao(int valorA, int valorB) {
        super(valorA, valorB);
    }

    @Override
    protected int operacao(int valorA, int valorB) {
        return valorA + valorB;
    }

}
