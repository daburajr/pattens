package com.company.template.operador;

public class Multiplicacao extends TemplateOperador {

    public Multiplicacao(int valorA, int valorB) {
        super(valorA, valorB);
    }

    @Override
    protected int operacao(int valorA, int valorB) {
        return valorA * valorB;
    }

}
