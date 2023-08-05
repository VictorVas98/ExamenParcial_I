public interface ElementoVenta {

    public default double calcularPrecioTotal() {
        double total = 0;
        for (Producto producto : productos) total += producto.calcularPrecio();
        return total;
    }
    public default double calcularPrecioTotal() {
        double total = 0;
        for (Servicio servicio : servicios) {
            total += servicio.calcularPrecio();
        }
        return total;
    }
}
