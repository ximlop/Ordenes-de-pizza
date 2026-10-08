package model;

public class Orden {

    private Pizza pizza;
    private int numeroOrden;

    public Orden(Pizza pizza, int numeroOrden) {
        this.pizza = pizza;
        this.numeroOrden = numeroOrden;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }
}
