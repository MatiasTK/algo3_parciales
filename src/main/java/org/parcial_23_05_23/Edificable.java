package org.parcial_23_05_23;

import java.util.ArrayList;

public interface Edificable {
    void construir(ArrayList<Material> materiales) throws MaterialNoEncontradoError;
}
