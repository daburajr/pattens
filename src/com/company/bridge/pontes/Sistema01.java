package com.company.bridge.pontes;

import com.company.bridge.SistemaLegado;

public class Sistema01 implements SistemaLegado {
    @Override
    public String buscaCliente() {
        return "José Fulano";
    }
}
