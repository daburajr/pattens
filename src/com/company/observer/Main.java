package com.company.observer;

import com.company.observer.acoes.AcoesPosGeraNota;
import com.company.observer.acoes.Email;
import com.company.observer.acoes.NotaDao;
import com.company.observer.acoes.Sms;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<AcoesPosGeraNota> acoesPosGeraNota = Arrays.asList(new Email(), new NotaDao(), new Sms());
        GeraNotaFiscal geraNotaFiscal = new GeraNotaFiscal(acoesPosGeraNota);
        geraNotaFiscal.geraNota();
    }

}
