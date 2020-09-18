package com.company.stagedescoplado.estado;

import com.company.stagedescoplado.Pedido;
import com.company.stagedescoplado.PedidoComEstado;

import java.math.BigDecimal;

public class Finalizado implements EstadoPedido {

    @Override
    public void aplicaDesconto(PedidoComEstado pedido) {
        BigDecimal valorComDesconto = pedido.getValor().multiply(BigDecimal.valueOf(0.9));
        pedido.setValor(valorComDesconto);
    }

    @Override
    public void digita(PedidoComEstado pedido) {
        throw new RuntimeException("Pedido ja esta finalizado.");
    }

    @Override
    public void processa(PedidoComEstado pedido) {
        throw new RuntimeException("Pedido ja esta finalizado.");
    }

    @Override
    public void finaliza(PedidoComEstado pedido) {
        throw new RuntimeException("Pedido ja esta finalizado.");
    }
}
