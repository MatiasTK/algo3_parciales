package org.parcial_23_05_23;

public class Pintura implements Material {
    int cantidad;

    public Pintura(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public void usar(Material materialAUsar) {
        cantidad -= materialAUsar.getCantidad();
    }
}
