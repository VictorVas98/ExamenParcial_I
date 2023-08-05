

import java.util.ArrayList;
import java.util.List;

public class CarritodeCompras implements ElementoVenta {
    private List<Producto> productos;
    private List<Servicio> servicios;

    public CarritodeCompras() {
        productos = new ArrayList<>();
        servicios = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    public void agregarServicio(Servicio servicio) {
        servicios.add(servicio);
    }
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularPrecio();
        }
        return total;
    }

    public void imprimirFactura() {
        System.out.println("Detalles:");
        for (Producto producto : productos) {
            producto.imprimirInformacion();
            System.out.println("Precio total: " + producto.calcularPrecio());
        }
        System.out.println("Total de la orden: " + calcularTotal());
        for (Servicio servicio : servicios) {
            servicio.imprimirInformacion();
            System.out.println("Precio total: " + Servicio.calcularPrecio());
        }
        System.out.println("Total de la orden: " + calcularTotal());
    }
}

