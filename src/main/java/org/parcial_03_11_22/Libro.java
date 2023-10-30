package org.parcial_03_11_22;

public class Libro {
    private final int costoEncuadernacion;
    Hoja paginas;

    Libro(Hoja paginas){
        this.paginas = paginas;
        this.costoEncuadernacion = 50;
    }

    // Rompe Tell Dont ask y no es polimorfica.
    private double calcularDescuento(){
        if (paginas.getCantidadPaginas() > 200){
            return 0.85;
        } else if (paginas.getCantidadPaginas() > 100) {
            return 0.9;
        }
        return 1;
    }

    public double calcularCostoImpresion(Envio envio){
        Envio envioGratuito = new EnvioGratuito();
        double costoFinal = paginas.calcularCostoImpresion(envioGratuito);
        costoFinal += costoEncuadernacion;
        costoFinal *= calcularDescuento();
        return costoFinal + envio.calcularCostoEnvio();
    }

}
