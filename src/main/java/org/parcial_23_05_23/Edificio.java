package org.parcial_23_05_23;

import java.util.ArrayList;

public class Edificio implements Edificable {
    private final int pisos;
    ArrayList<Material> materialesBase;

    private void inicializarMaterialesBase() {
        materialesBase = new ArrayList<>();
        materialesBase.add(new Cemento(100));
        materialesBase.add(new Canio(100));
        materialesBase.add(new Pintura(100));
    }

    public Edificio(int pisos) {
        this.pisos = pisos;

        inicializarMaterialesBase();
    }

    private Material encontrarMaterial(ArrayList<Material> materialesEnExistencia, Material materialABuscar) throws MaterialNoEncontradoError {
        for (Material materialNecesario : materialesEnExistencia) {
            if (materialNecesario.getClass().equals(materialABuscar.getClass())) {
                return materialNecesario;
            }
        }
        throw new MaterialNoEncontradoError();
    }

    private void construirBase(ArrayList<Material> materialesEnExistencia) throws MaterialNoEncontradoError {
        for (Material materialNecesario : materialesBase) {
            Material materialEnExistencia = encontrarMaterial(materialesEnExistencia, materialNecesario);
            materialEnExistencia.usar(materialNecesario);
        }
    }

    private void construirPlantaBaja(ArrayList<Material> materialesEnExistencia) throws MaterialNoEncontradoError {
        Vivienda vivienda = new Vivienda(5);
        vivienda.construir(materialesEnExistencia);
    }

    private void construirPlanta(ArrayList<Material> materialesEnExistencia, ArrayList<Material> materialesPlanta) throws MaterialNoEncontradoError {
        for (Material materialNecesario : materialesPlanta) {
            Material materialEnExistencia = encontrarMaterial(materialesEnExistencia, materialNecesario);
            materialEnExistencia.usar(materialNecesario);
        }
    }

    @Override
    public void construir(ArrayList<Material> materialesEnExistencia) throws MaterialNoEncontradoError {
        construirBase(materialesEnExistencia);
        construirPlantaBaja(materialesEnExistencia);
        for (int i = 0; i < pisos; i++) {
            ArrayList<Material> materialesPlanta = new ArrayList<>();
            materialesPlanta.add(new Cemento(100 * (i + 1)));
            materialesPlanta.add(new Canio(100));
            materialesPlanta.add(new Pintura(100));
            construirPlanta(materialesEnExistencia, materialesPlanta);
        }
    }
}
