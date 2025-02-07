package org.cva.app;
import org.cva.config.AppConfig;
import org.cva.service.AnimalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AnimalService service = context.getBean(AnimalService.class);


        String[] entradas;
        if (args != null && args.length > 0) {
            entradas = args;
        } else {
            System.out.println("No se han proporcionado argumentos, usando datos por defecto.");
            entradas = new String[]{
                    "Firulais|perro|woof",
                    "Polly|loro|carretear",
                    "Rex|perro|woof",
                    "Golden|pez|glup-glup"

            };
        }

        var animales = service.datoEntrada(entradas);

        service.imprimirAnimales(animales);
    }

}