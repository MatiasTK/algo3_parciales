package org.parcial_23_05_23;

public class Canio implements Material {
    int cantidad;

    public Canio(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public void usar(Material materialAUsar) {
        cantidad -= materialAUsar.getCantidad();
    }

    public int getCantidad() {
        return cantidad;
    }
}
