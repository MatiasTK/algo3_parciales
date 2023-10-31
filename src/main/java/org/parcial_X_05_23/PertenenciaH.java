package org.parcial_X_05_23;

//! RARO NO HACE NADA.
public class PertenenciaH implements MetodoPago {
    @Override
    public void pagar(int precio, Entrada entrada) {
        entrada.pagar();
    }

    @Override
    public boolean equals(Object obj) {
        return this.getClass().equals(obj.getClass());
    }
}
