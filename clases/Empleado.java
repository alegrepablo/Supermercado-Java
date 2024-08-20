package clases;
// Clase para representar a un empleado que trabaja en una caja

public class Empleado extends Humano {
    double sueldo;

    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.sueldo = sueldo;
    }
}
