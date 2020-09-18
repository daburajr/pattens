package com.company.heranca;

public class Main {
    public static void main(String[] args) {

        // Viola o principio, pois nao consigo substituir a base pela filha
        Quadrado quadrado = new Quadrado();

        quadrado.setAltura(10);
        quadrado.setBase(5);

        // Esperava 50
        // O resultado é 25, ou seja, nao consigo substituir a extensão no lugar da base
        System.out.println(quadrado.calculaArea());

    }
}
