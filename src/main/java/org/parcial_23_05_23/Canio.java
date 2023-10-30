package org.parcial_23_05_23;

public class Canio implements Material {
    int cantidad;

    public Canio(int cantidad) {
        this.cantidad = cantidad;
    }

    public void usar(int cantidadAUsar) {
        this.cantidad -= cantidadAUsar;
    }

    public int getCantidad() {
        return cantidad;
    }
}
