package org.parcial_24_05_22.mejor_solucion;

import java.util.Date;

public interface Habitaciones {
    void agregarIngreso(Habitante habitante, Date fecha);

    boolean superaMaximo(Habitante habitante, double maximo, Date fecha);

    boolean puedeUsar(Habitante habitante, double maximo, Date fecha);
}
