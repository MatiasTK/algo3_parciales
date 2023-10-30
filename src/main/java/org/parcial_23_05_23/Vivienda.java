package org.parcial_23_05_23;

public class Vivienda implements Edificable {
    private int ambientes;
    private int cantidadCementoBase;
    private int cantidadCementoAmbiente;
    private int cantidadCanioAmbiente;
    private int cantidadPinturaAmbiente;

    public Vivienda(int cantidadAmbientes) {
        ambientes = cantidadAmbientes;
        cantidadCementoBase = 50;
        cantidadCementoAmbiente = 10;
        cantidadCanioAmbiente = 100;
        cantidadPinturaAmbiente = 500;

    }

    private void construirBase(Cemento cemento) {
        cemento.usar(cantidadCementoBase);
    }

    private void construirAmbiente(Cemento cemento, Canio canio, Pintura pintura) {
        cemento.usar(cantidadCementoAmbiente);
        canio.usar(cantidadCanioAmbiente);
        pintura.usar(cantidadPinturaAmbiente);
    }

    public void construir(Cemento cemento, Canio canio, Pintura pintura) {
        construirBase(cemento);
        for (int i = 0; i < ambientes; i++) {
            construirAmbiente(cemento, canio, pintura);
        }
    }
}
