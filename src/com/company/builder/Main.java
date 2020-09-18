package com.company.builder;

public class Main {

    public static void main(String[] args) {

        // Interfaces fluentes (encadear metodos que retornam a propria instancia)
        Qualquer qualquer = new Qualquer.Builder()
                .valorA(20)
                .valorB(30)
                .build();

        Qualquer qualquer1 = new Qualquer.Builder().build();

        System.out.println(qualquer);
        System.out.println(qualquer1);

    }

}
