package clases;
// Clase para representar a un cliente que puede ser mayorista o no

public class Cliente extends Humano {
    boolean esMayorista;

    public Cliente(String nombre, boolean esMayorista) {
        super(nombre);
        this.esMayorista = esMayorista;
    }
}