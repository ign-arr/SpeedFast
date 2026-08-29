
package controller;

import interfaces.Rastreable;
import model.Pedido;

import java.util.ArrayList;

public class ControladorDeEnvios implements Rastreable {

    private ArrayList<String> historial;

    public ControladorDeEnvios() {
        historial = new ArrayList<>();
    }

    public void reservarPedido(Pedido pedido) {
        System.out.println(
                "Pedido #" + pedido.getIdPedido() + " reservado correctamente."
        );
    }

    public void despacharPedido(Pedido pedido) {

        pedido.despachar();

        historial.add(
                pedido.getClass().getSimpleName()
                        + " #" + pedido.getIdPedido()
                        + " - entregado por "
                        + pedido.getNombreRepartidor()
        );
    }

    @Override
    public void verHistorial() {

        System.out.println("Historial:");

        for (String entrega : historial) {
            System.out.println("- " + entrega);
        }
    }
}