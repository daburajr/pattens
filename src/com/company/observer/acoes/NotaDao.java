package com.company.observer.acoes;

public class NotaDao implements AcoesPosGeraNota {

    @Override
    public void envia() {
        System.out.println("Nota sendo salva no banco de dados...");
    }
}
