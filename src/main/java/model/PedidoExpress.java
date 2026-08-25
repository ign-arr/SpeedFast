
package model;

public class PedidoExpress extends Pedido {

    public PedidoExpress(String idPedido, String direccionEntrega, int distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        int tiempo = 10;
        if (distanciaKm > 5) {
            tiempo = tiempo + 5;
        }
        return tiempo;
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Express #" + idPedido + "]");
        super.asignarRepartidor();
        System.out.println("-> Repartidor más cercano con disponibilidad inmediata encontrado.");
    }

    public void asignarRepartidor(String nombreRepartidor) {
        this.asignarRepartidor();
        System.out.println("-> Pedido asignado a " + nombreRepartidor);
        this.mostrarResumen();
    }
}