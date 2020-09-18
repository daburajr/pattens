package com.company.state;

import com.company.state.estado.Digitacao;
import com.company.state.estado.EstadoPedido;

import java.math.BigDecimal;

public class Pedido {

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
