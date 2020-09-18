package com.company.templategenerico;

import com.company.templategenerico.operador.Adicao;
import com.company.templategenerico.operador.Divisao;
import com.company.templategenerico.operador.Multiplicacao;
import com.company.templategenerico.operador.Subtracao;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Double valorA = 2.0;
        Double valorB = 3.0;

        List<OperadorAritmetico> operadores = Arrays.asList(
                new Adicao(valorA.intValue(), valorB.intValue()),
                new Subtracao(valorA.intValue(), valorB.intValue()),
                new Multiplicacao(valorA.intValue(), valorB.intValue()),
                new Divisao(valorA, valorB)
        );

        operadores.stream().map(OperadorAritmetico::realizaOperacao).forEach(System.out::println);





    }

}
