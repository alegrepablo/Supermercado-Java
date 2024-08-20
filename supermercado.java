import clases.Caja;
import clases.Cliente;
import clases.Empleado;
import clases.Producto;

// Clase principal para ejecutar la simulación

class Supermercado {
    public static void main(String[] args) {
        // Crear empleados
        Empleado empleado1 = new Empleado("Emiliano", 30000);

        // Crear productos
        Producto producto1 = new Producto("Pan", 50, 100);
        Producto producto2 = new Producto("Leche", 100, 50);
        Producto producto3 = new Producto("Huevos", 200, 30);
        Producto producto4 = new Producto("Arroz", 300, 80);

        // Crear un cliente
        Cliente cliente1 = new Cliente("Juan Jose", true);

        // Crear una caja
        Caja caja1 = new Caja(empleado1);

        // Simular una compra
        Producto[] productosComprados = { producto1, producto2, producto3, producto4 };
        int[] cantidadesCompradas = { 2, 1, 1, 1 };

        caja1.procesarCompra(cliente1, productosComprados, cantidadesCompradas);
    }
}