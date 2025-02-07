package org.cva.model;

public class Pez extends Animal {

    public Pez(String nom, String ono) {
        super(nom, ono);
    }


    @Override
    public TipoAnimal getTipo() {
        return TipoAnimal.ACUATICO;
    }
}
