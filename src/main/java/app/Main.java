
package app;

import model.PedidoComida;
import model.PedidoEncomienda;
import model.PedidoExpress;

public class Main {

    public static void main(String[] args) {

        PedidoComida comida = new PedidoComida(
                "001",
                "Pasaje 1 154",
                4
        );

        PedidoEncomienda encomienda = new PedidoEncomienda(
                "002",
                "Los Pinos 32",
                6
        );

        PedidoExpress express = new PedidoExpress(
                "003",
                "Porvenir 302",
                7
        );

        System.out.println("=== ASIGNACIÓN DE REPARTIDORES ===");
        System.out.println();

        System.out.println("[Pedido Comida]");
        comida.asignarRepartidor();
        comida.asignarRepartidor("Juan Pérez");

        System.out.println();

        System.out.println("[Pedido Encomienda]");
        encomienda.asignarRepartidor();
        encomienda.asignarRepartidor("Camila Soto");

        System.out.println();

        System.out.println("[Pedido Express]");
        express.asignarRepartidor();
        express.asignarRepartidor("Luis Díaz");

        System.out.println();
        System.out.println("=== TIEMPOS DE ENTREGA ===");
        System.out.println();

        System.out.println("PedidoComida #" + comida.getIdPedido());
        comida.mostrarResumen();
        System.out.println(
                "Tiempo estimado de entrega: "
                        + comida.calcularTiempoEntrega()
                        + " minutos"
        );

        System.out.println();

        System.out.println("PedidoEncomienda #" + encomienda.getIdPedido());
        encomienda.mostrarResumen();
        System.out.println(
                "Tiempo estimado de entrega: "
                        + encomienda.calcularTiempoEntrega()
                        + " minutos"
        );

        System.out.println();

        System.out.println("PedidoExpress #" + express.getIdPedido());
        express.mostrarResumen();
        System.out.println(
                "Tiempo estimado de entrega: "
                        + express.calcularTiempoEntrega()
                        + " minutos"
        );
    }
}