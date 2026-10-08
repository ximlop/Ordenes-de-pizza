package model;

public class Cocina {
    private Orden[] ordenesPendientes;
    private int cantidadOrdenes;

    public Cocina(int capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que cero.");
        }

        ordenesPendientes = new Orden[capacidad];
        cantidadOrdenes = 0;
    }

    public boolean agregarOrden(Orden orden) {
        if (orden == null) {
            throw new IllegalArgumentException("La orden no puede estar vacia");
        }

        if (estaLlena()) {
            return false;
        }

        ordenesPendientes[cantidadOrdenes] = orden;
        cantidadOrdenes++;
        return true;
    }

    public boolean estaLlena() {
        return cantidadOrdenes >= ordenesPendientes.length;
    }

    public int getCantidadOrdenes() {
        return cantidadOrdenes;
    }

    public int getEspaciosDisponibles() {
        return ordenesPendientes.length - cantidadOrdenes;
    }
}
