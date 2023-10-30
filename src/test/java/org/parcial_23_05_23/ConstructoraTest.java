package org.parcial_23_05_23;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructoraTest {

    @Test
    public void test01CuantoSobraDeConstruirUnaViviendaDe5Ambientes() throws MaterialNoEncontradoError {
        Cemento cemento = new Cemento(100);
        Canio canio = new Canio(500);
        Pintura pintura = new Pintura(2500);

        Constructora constructora = new Constructora(cemento);
        constructora.agregarMaterial(canio);
        constructora.agregarMaterial(pintura);
        Vivienda vivienda = new Vivienda(5);

        constructora.construir(vivienda);

        assertEquals(0, cemento.getCantidad());
        assertEquals(0, canio.getCantidad());
        assertEquals(0, pintura.getCantidad());
    }

    @Test
    public void test02CuantoSobraDeConstruirUnEdificio5Pisos() throws MaterialNoEncontradoError {
        Cemento cemento = new Cemento(100 /* casa */ + 100 /* base */ + (1 * 100) + (2 * 100) + (3 * 100) + (4 * 100) + (5 * 100));
        Canio canio = new Canio(500 /* casa */ + 100 /* base */ + (5 * 100));
        Pintura pintura = new Pintura(2500 /* casa */ + 100 /* base */ + (5 * 100));

        Constructora constructora = new Constructora(cemento);
        constructora.agregarMaterial(canio);
        constructora.agregarMaterial(pintura);
        Edificio edificio = new Edificio(5);

        constructora.construir(edificio);

        assertEquals(0, cemento.getCantidad());
        assertEquals(0, canio.getCantidad());
        assertEquals(0, pintura.getCantidad());
    }

    @Test
    public void test03CuantoSobraDeConstruirUnComplejo() throws MaterialNoEncontradoError {
        Cemento cemento = new Cemento(100 * 2 /*Base edificios*/ + 1500 * 2 /*Plantas edificios*/ + 100 * 2 /*Planta baja edificios*/ + 100 /*Casa*/);
        Canio canio = new Canio(500 * 2 /*Planta baja edificios*/ + 100 * 2 /*Base edificios*/ + (5 * 100) * 2 /*Plantas edificios*/ + 100 * 5 /*Casa*/);
        Pintura pintura = new Pintura(2500 * 2 /*Planta baja edificios*/ + 100 * 2 /*Base edificios*/ + (5 * 100) * 2 /*Plantas edificios*/ + 500 * 5 /*Casa*/);

        Constructora constructora = new Constructora(cemento);
        constructora.agregarMaterial(canio);
        constructora.agregarMaterial(pintura);

        ArrayList<Edificable> conjuntoComplejo = new ArrayList<>();
        conjuntoComplejo.add(new Edificio(5));
        conjuntoComplejo.add(new Edificio(5));
        conjuntoComplejo.add(new Vivienda(5));
        Edificable complejo = new Complejo(conjuntoComplejo);

        constructora.construir(complejo);

        assertEquals(0, cemento.getCantidad());
        assertEquals(0, canio.getCantidad());
        assertEquals(0, pintura.getCantidad());
    }
}
