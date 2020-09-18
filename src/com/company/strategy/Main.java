package com.company.strategy;

import com.company.strategy.operador.Adicao;
import com.company.strategy.operador.Divisao;
import com.company.strategy.operador.Multiplicacao;
import com.company.strategy.operador.Subtracao;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /***
         *
         *
         *          MOTIVACAO: Permitir que um objeto mude de comportamento de acordo com seu estado interno.
         *          Solucão: Strategy
         *          Tipo: Comportamental
         *
         *          // ---- Descricao ----
         *
         *          -> Cadas forma de calcular é uma nova regra
         *          -> Todos tem um COMPORTAMENTO parecido
         *          -> Temos muitas formas de calcular
         *          -> O projeto irá receber novas formas de calcular
         *
         */

        int valorA = 2;
        int valorB = 3;

        List<OperadorAritmetico> operadores = Arrays.asList(
                new Adicao(valorA, valorB),
                new Subtracao(valorA, valorB),
                new Multiplicacao(valorA, valorB),
                new Divisao(valorA, valorB)
        );

        operadores.stream().map(OperadorAritmetico::realizaOperacao).forEach(System.out::println);





    }

}
