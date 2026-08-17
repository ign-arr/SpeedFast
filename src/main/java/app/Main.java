
package app;

import model.PedidoComida;
import model.PedidoEncomienda;
import model.PedidoExpress;

public class Main {

    public static void main(String[] args) {

        PedidoComida comida = new PedidoComida(
                1,
                "Pasaje 1 154",
                "Comida"
        );

        PedidoEncomienda encomienda = new PedidoEncomienda(
                2,
                "Los Pinos 32",
                "Encomienda"
        );

        PedidoExpress express = new PedidoExpress(
                3,
                "Porvenir 302",
                "Compra Express"
        );

        System.out.println("[Pedido Comida]");
        comida.asignarRepartidor();
        comida.asignarRepartidor("Claudio Baeza");

        System.out.println();

        System.out.println("[Pedido Encomienda]");
        encomienda.asignarRepartidor();
        encomienda.asignarRepartidor("Carmen Sanhueza");

        System.out.println();

        System.out.println("[Pedido Express]");
        express.asignarRepartidor();
        express.asignarRepartidor("Roberto Guzmán");
    }
}