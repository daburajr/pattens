package com.company.adapter;

public class Main {

    public static void main(String[] args) {

        /***
         *
         *  Motivação: Adaptar uma estrura em outra.
         *  Reaproveitar uma estrutura de uma classe para outra
         *  Tipo: Estrutural
         */

        DoisPinos doisPinos = new DoisPinos();
        TresPinos tresPinos = new TresPinos();

        AptadorTresParaDois adaptador = new AptadorTresParaDois(doisPinos);
        adaptador.conectaTomada();

        System.out.println("---- ------------ ------------");

        AdaptadorDoisParaTres adaptador02 = new AdaptadorDoisParaTres(tresPinos);
        adaptador02.conectaTomada();


    }

}
