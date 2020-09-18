package com.company.stagedescoplado;

import com.company.stagedescoplado.estado.EstadoPedido;

import java.math.BigDecimal;

public interface PedidoComEstado {
    BigDecimal getValor();
    void setValor(BigDecimal valor);
    void setEstadoPedido(EstadoPedido estadoPedido);
}
