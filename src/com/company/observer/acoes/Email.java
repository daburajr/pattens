package com.company.observer.acoes;

public class Email implements AcoesPosGeraNota {

    // atributos
    // getters e settes

    @Override
    public void envia() {
        System.out.println("Enviando email....");
    }
}
