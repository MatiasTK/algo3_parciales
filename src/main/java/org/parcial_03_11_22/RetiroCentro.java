package org.parcial_03_11_22;

public class RetiroCentro implements Envio {

    private int cantidad;
    private int precioBase;

    public RetiroCentro(int cantidadHojas) {
        this.cantidad = cantidadHojas;
        this.precioBase = 5;
    }

    @Override
    public double calcularCostoEnvio() {
        int costo = Math.round(cantidad / 100);

        return costo * precioBase;
    }
}
