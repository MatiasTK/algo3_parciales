package org.parcial_23_05_23;

import java.util.ArrayList;

public class Vivienda implements Edificable {
    private ArrayList<Material> materialesBase;
    private ArrayList<Material> materialesAmbiente;
    private final int ambientes;

    private void inicializarMaterialesBase() {
        materialesBase = new ArrayList<>();
        materialesBase.add(new Cemento(50));
    }

    private void inicializarMaterialesAmbiente() {
        materialesAmbiente = new ArrayList<>();
        materialesAmbiente.add(new Cemento(10));
        materialesAmbiente.add(new Canio(100));
        materialesAmbiente.add(new Pintura(500));
    }

    public Vivienda(int cantidadAmbientes) {
        ambientes = cantidadAmbientes;
        inicializarMaterialesBase();
        inicializarMaterialesAmbiente();
    }

    private Material encontrarMaterial(ArrayList<Material> materialesEnExistencia, Material materialABuscar) throws MaterialNoEncontradoError {
        for (Material materialNecesario : materialesEnExistencia) {
            if (materialNecesario.getClass().equals(materialABuscar.getClass())) {
                return materialNecesario;
            }
        }
        throw new MaterialNoEncontradoError();
    }

    private void construirBase(ArrayList<Material> materiales) throws MaterialNoEncontradoError {
        for (Material materialNecesario : materialesBase) {
            Material material = encontrarMaterial(materiales, materialNecesario);
            material.usar(materialNecesario);
        }
    }

    private void construirAmbiente(ArrayList<Material> materiales) throws MaterialNoEncontradoError {
        for (Material materialNecesario : materialesAmbiente) {
            Material material = encontrarMaterial(materiales, materialNecesario);
            material.usar(materialNecesario);
        }
    }

    public void construir(ArrayList<Material> materiales) throws MaterialNoEncontradoError {
        construirBase(materiales);
        for (int i = 0; i < ambientes; i++) {
            construirAmbiente(materiales);
        }
    }
}
