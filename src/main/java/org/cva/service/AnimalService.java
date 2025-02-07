package org.cva.service;


import org.cva.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AnimalService {

    public List<Animal> datoEntrada(String[] entradas) {
        List<Animal> animals = new ArrayList<Animal>();

        for (String entrada : entradas) {
            String[] datos = entrada.split("\\|");
            if (datos.length != 3) {
                System.err.println("Datos invalidos " + entrada);
                continue;
            }
            String nom = datos[0].trim();
            String tipo = datos[1].trim();
            String ono = datos[2].trim();

            Animal animal;
            switch (tipo) {
                case "perro":
                    animal = new Perro(nom, ono);
                    break;
                case "loro":
                    animal = new Loro(nom, ono);
                    break;
                case "pez":
                    animal = new Pez(nom, ono);
                    break;
                default:
                    System.err.println("Tipo de animal no reconocido " + tipo);
                    continue;
            }
            animals.add(animal);
        }
        return animals;
    }

    public void imprimirAnimales(List<Animal> animals) {
        Map<TipoAnimal, List<Animal>> agrupados = animals.stream()
                .collect(Collectors.groupingBy(Animal::getTipo));

        agrupados.forEach((tipo, lista) -> {
            System.out.println("Animales " + tipo + ":");
            lista.forEach(animal ->
                    System.out.println("  - " + animal.getNom() + " hace: " + animal.getOno()));
        });
    }

}
