package org.parcial_23_05_23;

public class Cemento implements Material {
    int cantidad;

    public Cemento(int cantidad) {
        this.cantidad = cantidad;
    }

    public void usar(int cantidadAUsar) {
        this.cantidad -= cantidadAUsar;
    }

    public int getCantidad() {
        return cantidad;
    }

}
