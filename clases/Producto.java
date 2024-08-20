package clases;
// Clase para representar un producto
public class Producto {
    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularTotal(int cantidadComprada) {
        return precio * cantidadComprada;
    }
}