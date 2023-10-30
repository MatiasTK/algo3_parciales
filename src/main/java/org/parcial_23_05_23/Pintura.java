package org.parcial_23_05_23;

public class Pintura implements Material {
    int cantidad;

    public Pintura(int cantidad) {
        this.cantidad = cantidad;
    }

    public void usar(int cantidadAUsar) {
        this.cantidad -= cantidadAUsar;
    }

    public int getCantidad() {
        return cantidad;
    }
}
