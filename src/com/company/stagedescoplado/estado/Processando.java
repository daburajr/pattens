package com.company.stagedescoplado.estado;

import com.company.stagedescoplado.PedidoComEstado;

import java.math.BigDecimal;

public class Processando implements EstadoPedido {

    @Override
    public void aplicaDesconto(PedidoComEstado pedido) {
        BigDecimal valorComDesconto = pedido.getValor().multiply(BigDecimal.valueOf(0.95));
        pedido.setValor(valorComDesconto);
    }

    @Override
    public void digita(PedidoComEstado pedido) {
        pedido.setEstadoPedido(new Digitacao());
    }

    @Override
    public void processa(PedidoComEstado pedido) {
        throw new RuntimeException("Pedido ja esta em estado de processando.");
    }

    @Override
    public void finaliza(PedidoComEstado pedido) {
        pedido.setEstadoPedido(new Finalizado());
    }
}
