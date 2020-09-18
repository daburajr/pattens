package com.company.bridge.pontes;

import com.company.bridge.SistemaLegado;

public class Sistema02 implements SistemaLegado {

    private String token = "hjjkahaghghaghahjgha";

    @Override
    public String buscaCliente() {
        validaToken();
        return "José Fulano";
    }

    public void validaToken() {
        System.out.printf("Validando token (" + token + ") com Sistema02\n");
    }
}
