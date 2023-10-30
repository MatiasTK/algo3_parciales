package org.parcial_03_11_22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImprentaTest {

    @Test
    public void test01PuedoCalcularElCostoDeImpresionDe45HojasCorrectamente(){
        Hoja hoja = new Hoja(45);
        Envio entrega = new EnvioDomicilio(15, 5);

        double resultadoEsperado = (0.1 * 45) + (15 * 5);

        assertEquals(resultadoEsperado, hoja.calcularCostoImpresion(entrega));
    }

    @Test
    public void test02PuedoCalcularElCostoImpresionDeUnLibroCorrectamente(){
        Hoja hoja = new Hoja(155);
        Libro libro = new Libro(hoja);
        Envio entrega = new RetiroCentro(155);

        double resultadoEsperado = ((155 * 0.1) + 50) * 0.9 + 5;

        assertEquals(resultadoEsperado, libro.calcularCostoImpresion(entrega));
    }

    @Test
    public void test03PuedoCalcularElCostoImpresionDeUnObjeto3DCorrectamente(){
        Objeto3D objeto = new Objeto3D(8000);
        Envio entrega = new EnvioDomicilio(90, 7);

        double resultadoEsperado = (8000 * 0.1) + (90 * 7);

        assertEquals(resultadoEsperado, objeto.calcularCostoImpresion(entrega));
    }
}
