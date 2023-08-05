public class Servicio {
    private int id;
    private String nombre;
    private String descripción;
    private static double precio;

    public Servicio(int id, String nombre, String descripción, double precio) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.precio = precio;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static double calcularPrecio() {
        return precio;
    }
    public void imprimirInformacion() {
    }
}

