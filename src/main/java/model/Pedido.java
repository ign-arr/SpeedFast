
package model;

public abstract class Pedido {
    String idPedido;
    String direccionEntrega;
    int distanciaKm;

    public Pedido(String idPedido, String direccionEntrega, int distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    public abstract int calcularTiempoEntrega();

    public void asignarRepartidor() {
        System.out.println("Asignando repartidor...");
    }

    public void mostrarResumen() {
        System.out.println("-> Dirección: " + direccionEntrega);
        System.out.println("-> Distancia: " + distanciaKm + " km");
        System.out.println("-> Tiempo estimado de entrega: " + calcularTiempoEntrega() + " minutos");
    }

    public String getIdPedido() { return idPedido; }
    public void setIdPedido(String id) { this.idPedido = id; }
    public String getDireccionEntrega() { return direccionEntrega; }
    public void setDireccionEntrega(String dir) { this.direccionEntrega = dir; }
    public int getDistanciaKm() { return distanciaKm; }
    public void setDistanciaKm(int dist) { this.distanciaKm = dist; }
}