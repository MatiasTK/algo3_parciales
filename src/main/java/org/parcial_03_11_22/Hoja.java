package org.parcial_03_11_22;

public class Hoja {

    private double precioFijo;
    private int cantidad;

    public Hoja(int numeroCopias) {
        this.precioFijo = 0.1;
        this.cantidad = numeroCopias;
    }

    public int getCantidadPaginas(){
        return cantidad;
    }

    public double calcularCostoImpresion(Envio tipoEnvio) {
        double precioProducto = precioFijo * cantidad;
        return precioProducto + tipoEnvio.calcularCostoEnvio();
    }
}
