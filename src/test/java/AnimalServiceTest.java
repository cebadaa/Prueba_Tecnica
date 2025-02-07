import org.cva.model.Animal;
import org.cva.model.TipoAnimal;
import org.cva.service.AnimalService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AnimalServiceTest {

    @Test
    public void testDatoEntrada_CreaAnimal() {
        AnimalService animalService = new AnimalService();
        String [] entradas = {
                "Firulais|perro|woof",
                "Polly|loro|carretear",
                "Rex|perro|woof",
                "Golden|pez|glup-glup"
        };

        List<Animal> animales = animalService.datoEntrada(entradas);
        Assertions.assertEquals(4, animales.size(), "Debe haber 3 animales creados");


        long countPerros = animales.stream()
                .filter(animal -> animal.getTipo() == TipoAnimal.TERRESTRE).count();
        long countLoros = animales.stream()
                .filter(animal -> animal.getTipo() == TipoAnimal.VOLADOR).count();
        long countPez = animales.stream()
                        .filter(animal -> animal.getTipo() == TipoAnimal.ACUATICO).count();

        Assertions.assertEquals(2, countPerros, "Debe haber 2 perros creados");
        Assertions.assertEquals(1, countLoros, "Debe haber 1 loros");
        Assertions.assertEquals(1, countLoros, "Debe haber 1 pez");

    }

    @Test
    public void testDatoEntrada_EntradaErr(){
        AnimalService animalService = new AnimalService();
        String [] entradas = {
                "Entradainvalida"
        };

        List<Animal> animales = animalService.datoEntrada(entradas);
        Assertions.assertEquals(0, animales.size(), "No debe crear ningun animal");

    }


}
