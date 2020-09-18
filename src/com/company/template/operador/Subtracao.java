package com.company.template.operador;

public class Subtracao extends TemplateOperador {

    public Subtracao(int valorA, int valorB) {
        super(valorA, valorB);
    }

    @Override
    protected int operacao(int valorA, int valorB) {
        return valorA > valorB ? valorA - valorB : valorB - valorA;
    }

}
