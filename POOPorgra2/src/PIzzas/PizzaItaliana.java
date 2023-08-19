package PIzzas;
import PIzzas.Pizza;

import java.util.List;



public class PizzaItaliana extends Pizza {
    private String salsa;

    public PizzaItaliana(String nombre, double precio, List<String> ingredientes, String salsa) {
        super(nombre, precio, ingredientes);
        this.salsa = salsa;
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Añadiendo salsa " + salsa + " a la pizza.");
    }

    @Override
    public String toString() {
        return super.toString() + ", salsa: " + salsa;
    }
}


