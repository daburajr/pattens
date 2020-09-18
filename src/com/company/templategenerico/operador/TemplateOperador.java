package com.company.templategenerico.operador;

import com.company.templategenerico.OperadorAritmetico;

public abstract class TemplateOperador<T extends Number> implements OperadorAritmetico {

    private T valorA;
    private T valorB;

    public TemplateOperador(T valorA, T valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public T realizaOperacao() {
        return operacao(valorA, valorB);
    }

    protected abstract T operacao(T valorA, T valorB);

}
