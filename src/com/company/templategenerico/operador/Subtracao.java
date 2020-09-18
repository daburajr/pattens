package com.company.templategenerico.operador;

public class Subtracao extends TemplateOperador<Integer> {

    public Subtracao(Integer valorA, Integer valorB) {
        super(valorA, valorB);
    }

    @Override
    protected Integer operacao(Integer valorA, Integer valorB) {
        return valorA > valorB ? valorA - valorB : valorB - valorA;
    }

}
