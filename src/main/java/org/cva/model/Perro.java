package org.cva.model;

public class Perro extends Animal {

    public Perro(String nom, String ono) {
        super(nom, ono);
    }

    @Override
    public TipoAnimal getTipo() {

        return TipoAnimal.TERRESTRE;
    }
}
