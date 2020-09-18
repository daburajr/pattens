package com.company.state.estado;

import com.company.state.Pedido;
import com.company.strategy.operador.Divisao;

import java.math.BigDecimal;

public class Digitacao implements EstadoPedido {


    @Override
    public void aplicaDesconto(Pedido pedido) {
        BigDecimal valorComDesconto = pedido.getValor().multiply(BigDecimal.valueOf(0.98));
        pedido.setValor(valorComDesconto);
    }

    @Override
    public void digita(Pedido pedido) {
        throw new RuntimeException("Pedido ja esta em estado de digitacao.");
    }

    @Override
    public void processa(Pedido pedido) {
        pedido.setEstadoPedido(new Processando());
    }

    @Override
    public void finaliza(Pedido pedido) {
        throw new RuntimeException("Pedido estado inválido para atual estado.");
    }

}
