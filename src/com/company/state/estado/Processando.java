package com.company.state.estado;

import com.company.state.Pedido;

import java.math.BigDecimal;

public class Processando implements EstadoPedido {

    @Override
    public void aplicaDesconto(Pedido pedido) {
        BigDecimal valorComDesconto = pedido.getValor().multiply(BigDecimal.valueOf(0.95));
        pedido.setValor(valorComDesconto);
    }

    @Override
    public void digita(Pedido pedido) {
        pedido.setEstadoPedido(new Digitacao());
    }

    @Override
    public void processa(Pedido pedido) {
        throw new RuntimeException("Pedido ja esta em estado de processando.");
    }

    @Override
    public void finaliza(Pedido pedido) {
        pedido.setEstadoPedido(new Finalizado());
    }
}
