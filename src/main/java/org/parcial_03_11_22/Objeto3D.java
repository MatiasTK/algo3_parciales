package org.parcial_03_11_22;

public class Objeto3D {

    double precioBase;
    int numeroPoligonos;

    public Objeto3D(int numeroPoligonos) {
        this.precioBase = 0.1;
        this.numeroPoligonos = numeroPoligonos;
    }

    // No implemento la suma de metros cubicos porque no se especifican medidas.
    public double calcularCostoImpresion(Envio envio){
        return precioBase * numeroPoligonos + envio.calcularCostoEnvio();
    }
}

