package com.company.bridge;

import com.company.bridge.pontes.Sistema01;
import com.company.bridge.pontes.Sistema02;

public class Main {

    public static void main(String[] args) {

        /**
         *       Motivação: caminho para um outro sistema (Impl concreta)
         *       Solução: Brigde
         *
         */

        SistemaLegado s1 = new Sistema01();
        SistemaLegado s2 = new Sistema02();

        System.out.println("S1: " + s1.buscaCliente());
        System.out.println("S2: " + s2.buscaCliente());

    }

}
