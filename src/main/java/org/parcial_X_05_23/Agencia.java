package org.parcial_X_05_23;

import java.util.ArrayList;

public class Agencia {
    public void comprarEntradas(ArrayList<Entrada> entradas, MetodoPago metodo) {
        for (Entrada entrada : entradas) {
            entrada.comprar(metodo);
        }
    }
}
