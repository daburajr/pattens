package com.company.template;

import com.company.template.operador.Adicao;
import com.company.template.operador.Divisao;
import com.company.template.operador.Multiplicacao;
import com.company.template.operador.Subtracao;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /**
         *          MOTIVACAO: Define o esqueleto de um algoritmo, para evitar duplicaçao de codigo
         *          Solução: TemplateMethod
         *          Tipo: Comportamental
         *
         *          // ---- Descricao ----
         *
         *          Problema: Cadas nova operaçao possui os mesmos conjuntos de instruçoes
         *          Solução: Criar uma forma para um molde base para cada operação
         *
         *
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
