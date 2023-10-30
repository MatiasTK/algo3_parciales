package org.parcial_24_05_22.primer_solucion;

public interface Residente {
    boolean usarSUM() throws LimiteDeUsosSuperadoError;

    boolean usarPiscina() throws LimiteDeUsosSuperadoError;

    boolean usarReuniones() throws LimiteDeUsosSuperadoError;
}
