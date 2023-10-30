package org.parcial_24_05_22.mejor_solucion;

import java.util.ArrayList;
import java.util.Date;

public class EspacioComun implements Habitaciones {

    ArrayList<Ingreso> ingresos;

    public EspacioComun() {
        ingresos = new ArrayList<>();
    }

    public void agregarIngreso(Habitante habitante, Date fecha) {
        Ingreso nuevoIngreso = new Ingreso(habitante, fecha);
        ingresos.add(nuevoIngreso);
    }

    public boolean superaMaximo(Habitante habitante, double maximo, Date fecha) {
        int vecesVisitado = 0;
        for (Ingreso ingreso : ingresos) {
            vecesVisitado += ingreso.devuelveUnoSiElHabitanteVinoElMismoMes(habitante, fecha);
        }

        return vecesVisitado >= maximo;
    }

    public boolean puedeUsar(Habitante habitante, double maximo, Date fecha) {
        return !superaMaximo(habitante, maximo, fecha);
    }
}
