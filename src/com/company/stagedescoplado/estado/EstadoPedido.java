package com.company.stagedescoplado.estado;

import com.company.stagedescoplado.PedidoComEstado;

public interface EstadoPedido {
    void aplicaDesconto(PedidoComEstado pedido);
    void digita(PedidoComEstado pedido);
    void processa(PedidoComEstado pedido);
    void finaliza(PedidoComEstado pedido);
}
