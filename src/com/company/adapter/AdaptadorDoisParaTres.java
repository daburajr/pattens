package com.company.adapter;

public class AdaptadorDoisParaTres {

    private TresPinos adaptacao;

    public AdaptadorDoisParaTres(TresPinos tresPinos) {
        this.adaptacao = tresPinos;
    }

    public void conectaTomada() {
        adaptacao.conectaTomada();
        System.out.println("Adaptacao concluida...");
    }


}
