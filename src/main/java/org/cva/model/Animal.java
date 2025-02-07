package org.cva.model;

public abstract class Animal {

    protected String nom;
    protected String ono;

    public Animal(String nom, String ono) {
        this.nom = nom;
        this.ono = ono;
    }

    public String getNom() {
        return nom;
    }

    public String getOno() {
        return ono;
    }


    public abstract TipoAnimal getTipo();
}
