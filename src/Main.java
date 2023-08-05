public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto(1, "Playera", 40, 3);
        Servicio servicio1 = new Servicio(1, "Electricista", "Mantenimiento y reparación del sistema eléctrico", 1);

        CarritodeCompras carritodeCompras = new CarritodeCompras();

        carritodeCompras.agregarProducto(producto1);
        carritodeCompras.agregarServicio(servicio1);

        carritodeCompras.imprimirFactura();
    }
}
