package org.parcial_23_05_23;

import java.util.ArrayList;

public class Complejo implements Edificable {
    ArrayList<Edificable> conjunto;

    public Complejo(ArrayList<Edificable> conjuntoEdificables) {
        conjunto = new ArrayList<>();
        conjunto.addAll(conjuntoEdificables);
    }

    @Override
    public void construir(ArrayList<Material> materialesEnExistencia) throws MaterialNoEncontradoError {
        for (Edificable edificable : conjunto) {
            edificable.construir(materialesEnExistencia);
        }
    }
}
