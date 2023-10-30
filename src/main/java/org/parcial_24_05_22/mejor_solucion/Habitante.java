package org.parcial_24_05_22.mejor_solucion;

import java.util.Date;

public class Habitante {

    public int ID;
    private final double maxPileta;
    private final double maxSum;

    private Habilitacion habilitacion;

    public Habitante(double maxUsosPileta, double maxUsosSUM, Habilitacion habilitacion) {
        this.maxPileta = maxUsosPileta;
        this.maxSum = maxUsosSUM;
        this.habilitacion = habilitacion;
    }

    public void reservar(Habitaciones habitacion, Date fecha) {
        habitacion.agregarIngreso(this, fecha);
    }

    public boolean puedeReservar(Piscina habitacion, Date fecha) {
        return habitacion.puedeUsar(this, maxPileta, fecha);
    }

    public boolean puedeReservar(SUM habitacion, Date fecha) {
        return habitacion.puedeUsar(this, maxSum, fecha);
    }

    public boolean puedeReservar(Reuniones habitacion, Date fecha) {
        return habitacion.puedeUsar(this, habilitacion.vecesUsoReuniones(), fecha);
    }

    @Override
    public boolean equals(Object obj) {
        return this.ID == ((Habitante) obj).ID;
    }
}
