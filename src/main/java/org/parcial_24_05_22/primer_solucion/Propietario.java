package org.parcial_24_05_22.primer_solucion;

public class Propietario implements Residente {

    private int usosSUM;
    private final int maximoUsosSUM;

    Habilitacion habilitacion;

    public Propietario(Habilitacion tipoHabilitacion) {
        this.usosSUM = 0;
        this.maximoUsosSUM = 2;
        this.habilitacion = tipoHabilitacion;
    }

    public boolean usarSUM() throws LimiteDeUsosSuperadoError {
        if (usosSUM >= maximoUsosSUM) {
            throw new LimiteDeUsosSuperadoError("Se alcanzo el limite de usos de la SUM");
        }

        this.usosSUM++;
        return true;
    }

    public boolean usarPiscina() {
        return true;
    }

    public boolean usarReuniones() throws LimiteDeUsosSuperadoError {
        return habilitacion.usarSalaReuniones();
    }
}


