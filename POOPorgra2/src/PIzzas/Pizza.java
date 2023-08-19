package PIzzas;

import java.util.List;

public class Pizza {
    private String nombre;
    private double precio;
    public List<String> ingredientes;

    public Pizza(String nombre, double precio, List<String> ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;

    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
        ingredientes.add("Queso");
        ingredientes.add("Tomate");
        ingredientes.add("Jamon");
        ingredientes.add("Champiñones");
        ingredientes.add("Aceitunas");
        ingredientes.add("Pollo");
        ingredientes.add("Carne");
        ingredientes.add("Piña");
        ingredientes.add("Cebolla");
        ingredientes.add("Pimenton");
        ingredientes.add("Salami");
    }

    public void preparar() {
        System.out.println("La pizza " + nombre + " está lista para ser servida.");
    }

    @Override
    public String toString() {
        return "nombre de la pizza: " + nombre + ", y su precio es: " + precio;
    }
}




