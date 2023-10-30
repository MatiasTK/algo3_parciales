package org.parcial_24_05_22.primer_solucion;

public class Inquilino implements Residente {

    private int usosSUM;
    private final int maximoUsosSUM;
    private int usosPiscina;
    private final int maximoUsosPiscina;

    Habilitacion habilitacion;

    public Inquilino(Habilitacion tipoHabilitacion) {
        this.usosSUM = 0;
        this.usosPiscina = 0;
        this.maximoUsosSUM = 1;
        this.maximoUsosPiscina = 10;
        this.habilitacion = tipoHabilitacion;
    }

    @Override
    public boolean usarSUM() throws LimiteDeUsosSuperadoError {
        if (usosSUM >= maximoUsosSUM) {
            throw new LimiteDeUsosSuperadoError("Se alcanzo el limite de usos de la SUM");
        }

        usosSUM++;
        return true;
    }

    @Override
    public boolean usarPiscina() throws LimiteDeUsosSuperadoError {
        if (usosPiscina >= maximoUsosPiscina) {
            throw new LimiteDeUsosSuperadoError("Se alcanzo el limite de usos de la Piscina");
        }

        usosPiscina++;
        return true;
    }

    @Override
    public boolean usarReuniones() throws LimiteDeUsosSuperadoError {
        return habilitacion.usarSalaReuniones();
    }
}
