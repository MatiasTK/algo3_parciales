package org.parcial_24_05_22.mejor_solucion;

import java.util.Date;

public class Ingreso {
    Date fecha;
    Habitante habitante;

    public Ingreso(Habitante habitante, Date fecha) {
        this.habitante = habitante;
        this.fecha = fecha;
    }

    public int devuelveUnoSiElHabitanteVinoElMismoMes(Habitante habitante, Date fecha) {
        if (fecha.getMonth() == this.fecha.getMonth()) {
            return 1;
        }
        return 0;
    }
}
