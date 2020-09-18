package com.company.stagedescoplado;

import com.company.stagedescoplado.estado.Digitacao;
import com.company.stagedescoplado.estado.EstadoPedido;

import java.math.BigDecimal;

public class Pedido implements PedidoComEstado {

    private BigDecimal valor;
    private EstadoPedido estadoPedido;

    public Pedido(BigDecimal valor) {
        this.valor = valor;
        this.estadoPedido = new Digitacao();
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public void aplicaDesconto() {
        estadoPedido.aplicaDesconto(this);
    }

    public void digita() {
        this.estadoPedido.digita(this);
    }

    public void processa() {
        this.estadoPedido.processa(this);
    }

    public void finaliza() {
        this.estadoPedido.finaliza(this);
    }
}
