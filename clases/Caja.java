package clases;
// Clase para representar una caja

public class Caja {
    Empleado empleado;

    public Caja(Empleado empleado) {
        this.empleado = empleado;
    }

    public void procesarCompra(Cliente cliente, Producto[] productos, int[] cantidades) {
        double total = 0;
        System.out.println("Cliente: " + cliente.nombre);
        System.out.println("Atendido por: " + empleado.nombre);
        System.out.println("Productos comprados:");

        for (int i = 0; i < productos.length; i++) {
            Producto producto = productos[i];
            int cantidadComprada = cantidades[i];
            double subtotal = producto.calcularTotal(cantidadComprada);

            // Aplicar descuento si es mayorista
            if (cliente.esMayorista) {
                subtotal *= 0.9; // 10% de descuento
            }

            total += subtotal;
            System.out.println("- " + producto.nombre + " x" + cantidadComprada + " = $" + subtotal);
        }

        System.out.println("Total a pagar: $" + total);
    }
}
