package com.company.templategenerico.operador;

public class Multiplicacao extends TemplateOperador<Integer> {

    public Multiplicacao(Integer valorA, Integer valorB) {
        super(valorA, valorB);
    }

    @Override
    protected Integer operacao(Integer valorA, Integer valorB) {
        return valorA * valorB;
    }

}
