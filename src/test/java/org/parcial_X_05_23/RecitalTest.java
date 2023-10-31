package org.parcial_X_05_23;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RecitalTest {

    @Test
    public void test01SeCompran2EntradasTipoBPagandoConPertenenciaH() {
        Agencia agencia = new Agencia();

        ArrayList<Entrada> entradasAComprar = new ArrayList<>();
        TipoB primerEntrada = new TipoB();
        TipoB segundaEntrada = new TipoB();
        entradasAComprar.add(primerEntrada);
        entradasAComprar.add(segundaEntrada);

        MetodoPago metodo = new PertenenciaH();

        agencia.comprar(entradasAComprar, metodo);

        assertTrue(primerEntrada.estaPagada());
        assertTrue(segundaEntrada.estaPagada());
    }

    @Test
    public void test02SeCompran2EntradasTipoAPagandoConGoldSoloSePagaUna() {
        Agencia agencia = new Agencia();

        ArrayList<Entrada> entradasAComprar = new ArrayList<>();
        TipoA primerEntrada = new TipoA();
        TipoA segundaEntrada = new TipoA();
        entradasAComprar.add(primerEntrada);
        entradasAComprar.add(segundaEntrada);

        MetodoPago metodo = new Gold();

        agencia.comprar(entradasAComprar, metodo);

        assertTrue(primerEntrada.estaPagada());
        assertFalse(segundaEntrada.estaPagada());
    }

    @Test
    public void test03SeCompran4EntradasConLaTarjetaPertenenciaH() {
        Agencia agencia = new Agencia();

        ArrayList<Entrada> entradasAComprar = new ArrayList<>();
        TipoA primerEntrada = new TipoA();
        TipoA segundaEntrada = new TipoA();
        TipoB tercerEntrada = new TipoB();
        TipoB cuartaEntrada = new TipoB();
        entradasAComprar.add(primerEntrada);
        entradasAComprar.add(segundaEntrada);
        entradasAComprar.add(tercerEntrada);
        entradasAComprar.add(cuartaEntrada);

        MetodoPago metodo = new PertenenciaH();

        agencia.comprar(entradasAComprar, metodo);

        assertTrue(primerEntrada.estaPagada());
        assertTrue(segundaEntrada.estaPagada());
        assertTrue(tercerEntrada.estaPagada());
        assertTrue(cuartaEntrada.estaPagada());
    }
}
