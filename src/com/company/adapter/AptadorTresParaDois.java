package com.company.adapter;

public class AptadorTresParaDois {

    private DoisPinos adaptacao;

    public AptadorTresParaDois(DoisPinos doisPinos) {
        this.adaptacao = doisPinos;
    }

    public void conectaTomada() {
        adaptacao.conectaTomada();
        System.out.println("Adaptacao concluida...");
    }


}
