package org.parcial_03_11_22;

public class EnvioDomicilio implements Envio {

    private int distancia;
    private int precioBase;

    public EnvioDomicilio(int distancia, int precioBase) {
        this.distancia = distancia;
        this.precioBase = precioBase;
    }

    public double calcularCostoEnvio() {
        return precioBase * distancia;
    }
}
