package org.parcial_23_05_23;

public class Cemento implements Material {
    int cantidad;

    public Cemento(int cantidad) {
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
