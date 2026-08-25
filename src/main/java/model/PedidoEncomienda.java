
package model;

public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(String idPedido, String direccionEntrega, int distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        double temp = 1.5 * distanciaKm;
        return 20 + (int) temp;
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Encomienda #" + idPedido + "]");
        super.asignarRepartidor();
        System.out.println("-> Validando peso y embalaje... OK");
    }

    public void asignarRepartidor(String nombreRepartidor) {
        this.asignarRepartidor();
        System.out.println("-> Pedido asignado a " + nombreRepartidor);
        this.mostrarResumen();
    }
}