package org.parcial_23_05_23;

public class Constructora {
    Cemento cemento;
    Canio canio;
    Pintura pintura;

    public Constructora(Cemento cemento, Canio canio, Pintura pintura) {
        this.cemento = cemento;
        this.canio = canio;
        this.pintura = pintura;
    }

    public void construir(Edificable edificable) {
        edificable.construir(cemento, canio, pintura);
    }
}
