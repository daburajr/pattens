package com.company.templategenerico.operador;

public class Divisao extends TemplateOperador<Double> {

    public Divisao(Double valorA, Double valorB) {
        super(valorA, valorB);
    }

    @Override
    protected Double operacao(Double valorA, Double valorB) {
        return valorA / valorB;
    }

}
