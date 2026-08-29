
package app;

import controller.ControladorDeEnvios;
import model.PedidoComida;
import model.PedidoEncomienda;
import model.PedidoExpress;

public class Main {

    public static void main(String[] args) {

        PedidoComida comida = new PedidoComida(
                "101",
                "Pasaje 1 154",
                4
        );

        PedidoEncomienda encomienda = new PedidoEncomienda(
                "102",
                "Los Pinos 32",
                7
        );

        PedidoExpress express = new PedidoExpress(
                "103",
                "Coquimbo 322",
                7
        );

        ControladorDeEnvios controlador = new ControladorDeEnvios();

        System.out.println("=== PEDIDO COMIDA ===");

        controlador.reservarPedido(comida);

        comida.asignarRepartidor();
        comida.mostrarResumen();

        System.out.println(
                "Tiempo estimado: "
                        + comida.calcularTiempoEntrega()
                        + " minutos"
        );

        controlador.despacharPedido(comida);

        System.out.println();

        System.out.println("=== PEDIDO ENCOMIENDA ===");

        controlador.reservarPedido(encomienda);

        encomienda.asignarRepartidor("Daniela Tapia");
        encomienda.mostrarResumen();

        System.out.println(
                "Tiempo estimado: "
                        + encomienda.calcularTiempoEntrega()
                        + " minutos"
        );

        controlador.despacharPedido(encomienda);

        System.out.println();

        System.out.println("=== PEDIDO EXPRESS ===");

        express.asignarRepartidor();

        System.out.println(
                "Cancelando Pedido Express #"
                        + express.getIdPedido()
                        + "..."
        );

        express.cancelar();

        System.out.println();

        controlador.verHistorial();
    }
}