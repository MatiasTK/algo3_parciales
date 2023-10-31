package org.parcial_X_05_23;

public class Gold implements MetodoPago {
    private int limiteCompras;

    public Gold() {
        this.limiteCompras = 1000;
    }

    @Override
    public void pagar(int precio, Entrada entrada) {
        if (precio > limiteCompras) return;
        entrada.pagar();
        limiteCompras -= precio;
    }

    @Override
    public boolean equals(Object obj) {
        return this.getClass().equals(obj.getClass());
    }
}
