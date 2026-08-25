
package app;

import model.*;

public class Main {
    public static void main(String[] args) {

        PedidoComida p1 = new PedidoComida("001", "Pasaje 1 154", 4);
        PedidoEncomienda p2 = new PedidoEncomienda("002", "Los Pinos 32", 6);
        PedidoExpress p3 = new PedidoExpress("003", "Porvenir 302", 7);

        p1.asignarRepartidor("Claudio Baeza");
        p2.asignarRepartidor("Carmen Sanhueza");
        p3.asignarRepartidor("Roberto Guzmán");
    }
}