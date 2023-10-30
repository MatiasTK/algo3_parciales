package org.parcial_23_05_23;

import java.util.ArrayList;

public class Constructora {

    private final ArrayList<Material> materiales;

    public Constructora(Material material) {
        materiales = new ArrayList<>();
        materiales.add(material);
    }

    public void agregarMaterial(Material material) {
        materiales.add(material);
    }

    public void construir(Edificable edificable) throws MaterialNoEncontradoError {
        edificable.construir(materiales);
    }
}
