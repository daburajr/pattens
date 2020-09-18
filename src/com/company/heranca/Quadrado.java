package com.company.heranca;

public class Quadrado extends Retangulo {

    public Quadrado(int base, int altura) {
        super(base, altura);
    }

    public Quadrado() {}

    public void setBase(int base) {
        super.setAltura(base);
        super.setBase(base);
    }

    public void setAltura(int altura) {
        super.setBase(altura);
        super.setAltura(altura);
    }




}
