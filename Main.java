import enums.Base;
import enums.Salsa;
import enums.Toppings;
import model.Cocina;
import model.Orden;
import model.Pizza;
import view.Vista;

public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Cocina cocina = new Cocina(5);

        Base base = vista.ElegirBase();
        Salsa salsa = vista.ElegirSalsa();
        Toppings[] toppings = vista.ElegirToppings();

        Pizza pizza = new Pizza(base, toppings, salsa);

        Orden orden = new Orden(pizza, 0);
        boolean aceptada = cocina.agregarOrden(orden);
        vista.mostrarResultadoOrden(aceptada);
    }
}