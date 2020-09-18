package com.company.observer.acoes;

public class Sms implements AcoesPosGeraNota {

    @Override
    public void envia() {
        System.out.println("Envia sms...");
    }
}
