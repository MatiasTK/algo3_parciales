package org.parcial_24_05_22.primer_solucion;

public class HabilitacionResidencialInquilino implements Habilitacion {
    private final int maximoUsosReuniones;
    private int usosReuniones;

    public HabilitacionResidencialInquilino() {
        maximoUsosReuniones = 2;
        usosReuniones = 0;
    }

    public boolean usarSalaReuniones() throws LimiteDeUsosSuperadoError {
        if (usosReuniones > maximoUsosReuniones) {
            throw new LimiteDeUsosSuperadoError("Se alcanzo el limite de usos de la sala de reuniones");
        }

        usosReuniones++;
        return true;
    }
}
