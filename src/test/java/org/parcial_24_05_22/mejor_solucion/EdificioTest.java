package org.parcial_24_05_22.mejor_solucion;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EdificioTest {

    @Test
    public void test01PropietarioUsaPiscina6Veces() {
        Habilitacion generica = new Habilitacion(0);
        Habitante propietario = new Propietario(generica);
        Piscina piscina = new Piscina();
        Date fecha = new Date("2021/05/05");

        for (int i = 0; i < 5; i++) {
            propietario.reservar(piscina, new Date("2021/05/02"));
        }

        assertTrue(propietario.puedeReservar(piscina, fecha));
    }

    @Test
    public void test02InquilinoUsaSum2Veces() {
        Habilitacion generica = new Habilitacion(0);
        Habitante inqulino = new Inquilino(generica);
        SUM sum = new SUM();
        Date fecha = new Date("2021/05/05");

        inqulino.reservar(sum, new Date("2021/05/02"));

        assertFalse(inqulino.puedeReservar(sum, fecha));
    }

    @Test
    public void test03InquilinoUsaReuniones9VecesConHabilitacionComercial() {
        Habilitacion comercial = new Habilitacion(10);
        Habitante inquilino = new Inquilino(comercial);
        Reuniones reuniones = new Reuniones();
        Date fecha = new Date("2021/05/05");

        for (int i = 0; i < 8; i++) {
            inquilino.reservar(reuniones, new Date("2021/05/02"));
        }

        assertTrue(inquilino.puedeReservar(reuniones, fecha));
    }
}
