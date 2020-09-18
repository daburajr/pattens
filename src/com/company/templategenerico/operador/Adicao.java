package com.company.templategenerico.operador;

public class Adicao extends TemplateOperador<Integer> {

    public Adicao(Integer valorA, Integer valorB) {
        super(valorA, valorB);
    }

    @Override
    protected Integer operacao(Integer valorA, Integer valorB) {
        return valorA + valorB;
    }

}
