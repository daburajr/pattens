package com.company.state.estado;

import com.company.state.Pedido;

import java.math.BigDecimal;

public class Finalizado implements EstadoPedido {

    @Override
    public void aplicaDesconto(Pedido pedido) {
        BigDecimal valorComDesconto = pedido.getValor().multiply(BigDecimal.valueOf(0.9));
        pedido.setValor(valorComDesconto);
    }

    @Override
    public void digita(Pedido pedido) {
        throw new RuntimeException("Pedido ja esta finalizado.");
    }

    @Override
    public void processa(Pedido pedido) {
        throw new RuntimeException("Pedido ja esta finalizado.");
    }

    @Override
    public void finaliza(Pedido pedido) {
        throw new RuntimeException("Pedido ja esta finalizado.");
    }
}
