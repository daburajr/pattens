package com.company.state;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {


        /**
         *          MOTIVACAO: Permitir que um objeto mude de comportamento de acordo com seu estado interno.
         *          Solução: state
         *          Tipo: Comportamental
         *
         *          // ---- Descricao ----
         *
         *          Nova regra de negócio: aplicar desconto no Pedido
         *          Restrição: o valor do desconto varia com o estado
         *
         *          Detalhe: {digitacao = 2% do valor, processando = 5% do valor, finalizado = 10% valor}
         *
         *          Maquina de estados: digitacao -> processando  (V) | digitacao -> finalizado (X)
         *                              processando -> finalizado (V) | finalizado -> processado (X)
         *                              processando -> digitacao  (V) | finalizado -> digitacao  (X)
         *
         *
         */

        Pedido pedido = new Pedido(BigDecimal.valueOf(100));
        pedido.processa();
//        pedido.finaliza();
        System.out.println(pedido.getValor());
        pedido.aplicaDesconto();
        System.out.println(pedido.getValor());





    }

}
