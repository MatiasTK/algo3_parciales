package org.parcial_X_05_23;

import java.util.ArrayList;

public class Entrada {
    private final int precio;
    private boolean pagada;
    private final ArrayList<MetodoPago> pagosSoportados;

    public Entrada(int precio, ArrayList<MetodoPago> pagosSoportados) {
        this.precio = precio;
        this.pagada = false;
        this.pagosSoportados = pagosSoportados;
    }

    private boolean soporta(MetodoPago metodoPago) {
        return this.pagosSoportados.contains(metodoPago);
    }

    public void comprar(MetodoPago metodoPago) {
        if (this.soporta(metodoPago)) {
            metodoPago.pagar(this.precio, this);
        }
    }

    public void pagar() {
        this.pagada = true;
    }

    public boolean estaPagada() {
        return this.pagada;
    }
}
