package Topping;

import PIzzas.Pizza;
import PIzzas.PizzaItaliana;

public class Topping {
    private String nombre;

    public Topping(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Pizza pizza) {
        pizza.ingredientes.add(nombre);
        this.nombre = nombre;
    }
}










