import org.cva.model.Loro;
import org.cva.model.Perro;
import org.cva.model.Pez;
import org.cva.model.TipoAnimal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    @Test
    public void testPerro(){
        Perro perro = new Perro("Firulais", "woof");
        Assertions.assertEquals("Firulais", perro.getNom());
        Assertions.assertEquals("woof", perro.getOno());
        Assertions.assertEquals(TipoAnimal.TERRESTRE, perro.getTipo());
    }

    @Test
    public void testLoro(){
        Loro loro = new Loro("Polly", "carretear");
        Assertions.assertEquals("Polly", loro.getNom());
        Assertions.assertEquals("carretear", loro.getOno());
        Assertions.assertEquals(TipoAnimal.VOLADOR, loro.getTipo());
    }

    @Test
    public void testPez(){
        Pez pez = new Pez("Golden", "glup-glup");
        Assertions.assertEquals("Golden", pez.getNom());
        Assertions.assertEquals("glup-glup", pez.getOno());
        Assertions.assertEquals(TipoAnimal.ACUATICO, pez.getTipo());
    }

}
