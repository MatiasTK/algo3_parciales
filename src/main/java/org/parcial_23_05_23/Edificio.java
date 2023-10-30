package org.parcial_23_05_23;

public class Edificio implements Edificable {
    private int pisos;
    private int cantidadCementoBase;
    private int cantidadCanioBase;
    private int cantidadPinturaBase;

    public Edificio(int pisos) {
        this.pisos = pisos;

        cantidadCementoBase = 100;
        cantidadCanioBase = 100;
        cantidadPinturaBase = 100;
    }

    private void construirBase(Cemento cemento, Canio canio, Pintura pintura) {
        cemento.usar(cantidadCementoBase);
        canio.usar(cantidadCanioBase);
        pintura.usar(cantidadPinturaBase);
    }

    private void construirPlantaBaja(Cemento cemento, Canio canio, Pintura pintura) {
        Vivienda vivienda = new Vivienda(5);
        vivienda.construir(cemento, canio, pintura);
    }

    private void construirPlanta(Cemento cemento, Canio canio, Pintura pintura, int numeroPlanta) {
        cemento.usar(cantidadCementoBase * numeroPlanta);
        canio.usar(cantidadCanioBase);
        pintura.usar(cantidadPinturaBase);
    }

    @Override
    public void construir(Cemento cemento, Canio canio, Pintura pintura) {
        construirBase(cemento, canio, pintura);
        construirPlantaBaja(cemento, canio, pintura);
        for (int i = 0; i < pisos; i++) {
            construirPlanta(cemento, canio, pintura, i + 1);
        }
    }
}
