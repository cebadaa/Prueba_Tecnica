package org.cva.model;

public class Loro extends Animal{

    public Loro(String nom, String ono) {
        super(nom, ono);
    }

    @Override
    public TipoAnimal getTipo() {

        return TipoAnimal.VOLADOR;
    }
}
