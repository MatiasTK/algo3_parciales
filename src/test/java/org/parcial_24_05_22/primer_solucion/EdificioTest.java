package org.parcial_24_05_22.primer_solucion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EdificioTest {

    @Test
    public void test01PropietarioUsaPiscina6veces() throws LimiteDeUsosSuperadoError {
        Habilitacion habilitacion = new HabilitacionResidencialPropietario();
        Residente propietario = new Propietario(habilitacion);

        for (int i = 0; i < 5; i++) {
            assertTrue(propietario.usarPiscina());
        }

        assertTrue(propietario.usarPiscina());
    }

    @Test
    public void test02InquilinoUsaSUM2Veces() throws LimiteDeUsosSuperadoError {
        Habilitacion habilitacion = new HabilitacionResidencialInquilino();
        Residente inquilino = new Inquilino(habilitacion);

        assertTrue(inquilino.usarSUM());
        assertThrows(LimiteDeUsosSuperadoError.class, inquilino::usarSUM);
    }

    @Test
    public void test03InquilinoConHabilitacionComercialUsaSalaDeReuniones9Veces() throws LimiteDeUsosSuperadoError {
        Habilitacion habilitacionComercial = new HabilitacionComercial();
        Residente inquilino = new Inquilino(habilitacionComercial);

        for (int i = 0; i < 8; i++) {
            assertTrue(inquilino.usarReuniones());
        }

        assertTrue(inquilino.usarReuniones());
    }
}
