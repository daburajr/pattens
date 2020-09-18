package com.company.state.estado;

import com.company.state.Pedido;

public interface EstadoPedido {
    void aplicaDesconto(Pedido pedido);
    void digita(Pedido pedido);
    void processa(Pedido pedido);
    void finaliza(Pedido pedido);
}
