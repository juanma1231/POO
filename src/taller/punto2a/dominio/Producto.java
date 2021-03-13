package taller.punto2a.dominio;

public class Producto {
    private String nombre;
    private long precio;
    private String codigo;
    private int cantidadActual;
    private int cantidadMaxima = 8;

    public Producto(String nombre, long precio, String codigo, int cantidadActual) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.cantidadActual = cantidadActual;
    }

    public String getNombre() {
        return nombre;
    }

    public long getPrecio() {
        return precio;
    }

    public String getCodigo() {
        return codigo;
    }


    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
