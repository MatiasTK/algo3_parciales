package org.parcial_24_05_22.mejor_solucion;

import java.util.Date;

public class Reuniones implements Habitaciones {
    EspacioComun espacioComun;

    public Reuniones() {
        espacioComun = new EspacioComun();
    }

    public void agregarIngreso(Habitante habitante, Date fecha) {
        espacioComun.agregarIngreso(habitante, fecha);
    }

    public boolean superaMaximo(Habitante habitante, double maximo, Date fecha) {
        return espacioComun.superaMaximo(habitante, maximo, fecha);
    }

    public boolean puedeUsar(Habitante habitante, double maximo, Date fecha) {
        return espacioComun.puedeUsar(habitante, maximo, fecha);
    }
}
