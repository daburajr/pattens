package com.company.template.operador;

import com.company.template.OperadorAritmetico;

public abstract class TemplateOperador implements OperadorAritmetico {

    private int valorA;
    private int valorB;

    public TemplateOperador(int valorA, int valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public int realizaOperacao() {
        return operacao(valorA, valorB);
    }

    protected abstract int operacao(int valorA, int valorB);

}
