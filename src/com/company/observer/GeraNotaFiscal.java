package com.company.observer;

import com.company.observer.acoes.AcoesPosGeraNota;

import java.util.Collection;
import java.util.Collections;

public class GeraNotaFiscal {

    // informaçoes nota ....

    private Collection<AcoesPosGeraNota> acoes;

    public GeraNotaFiscal(Collection<AcoesPosGeraNota> acoes) {
        this.acoes = acoes;
    }

    public Collection<AcoesPosGeraNota> getAcoes() {
        return Collections.unmodifiableCollection(this.acoes);
    }

    public void geraNota() {
        System.out.printf("====== Gerando Nota Fiscal ======\n");
        System.out.printf("Processando...\n");
        acoes.forEach(AcoesPosGeraNota::envia);
    }


}
