
package model;

// Clase base
public class Pedido {

    private int idPedido;
    private String direccionEntrega;
    private String tipoPedido;

    public Pedido(int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    // Metodo sobrescribible
    public void asignarRepartidor() {
        System.out.println("Asignando repartidor para el pedido.");
    }

    // Metodo sobrecargado
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println(
                "Repartidor asignado: " + nombreRepartidor
        );
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", direccionEntrega='" + direccionEntrega + '\'' +
                ", tipoPedido='" + tipoPedido + '\'' +
                '}';
    }
}