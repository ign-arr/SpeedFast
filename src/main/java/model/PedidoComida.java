
package model;

public class PedidoComida extends Pedido {

    public PedidoComida(String idPedido, String direccionEntrega, int distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        return 15 + (2 * distanciaKm);
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Comida #" + idPedido + "]");
        super.asignarRepartidor();
        System.out.println("-> Verificando mochila térmica... OK");
    }

    public void asignarRepartidor(String nombreRepartidor) {
        this.asignarRepartidor();
        System.out.println("-> Pedido asignado a " + nombreRepartidor);
        this.mostrarResumen();
    }
}