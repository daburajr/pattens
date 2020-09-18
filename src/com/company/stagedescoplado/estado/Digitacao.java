package com.company.stagedescoplado.estado;

import com.company.stagedescoplado.Pedido;
import com.company.stagedescoplado.PedidoComEstado;

import java.math.BigDecimal;

public class Digitacao implements EstadoPedido {

    @Override
    public void aplicaDesconto(PedidoComEstado pedido) {
        BigDecimal valorComDesconto = pedido.getValor().multiply(BigDecimal.valueOf(0.98));
        pedido.setValor(valorComDesconto);
    }

    @Override
    public void digita(PedidoComEstado pedido) {
        throw new RuntimeException("Pedido ja esta em estado de digitacao.");
    }

    @Override
    public void processa(PedidoComEstado pedido) {
        pedido.setEstadoPedido(new Processando());
    }

    @Override
    public void finaliza(PedidoComEstado pedido) {
        throw new RuntimeException("Pedido estado inválido para atual estado.");
    }

}
