package com.company.decorator;

import com.company.decorator.operador.Adicao;
import com.company.decorator.operador.Multiplicacao;

public class Main {
    public static void main(String[] args) {

        Multiplicacao m = new Multiplicacao(2, 3);
        OperadorAritmetico operadorAritmetico = new Adicao(m,2, 3);


        //System.out.println(a.realizaOperacao());

        System.out.println(operadorAritmetico.realizaOperacao());
    }
}
