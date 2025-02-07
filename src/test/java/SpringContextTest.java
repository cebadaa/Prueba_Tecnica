import org.cva.config.AppConfig;
import org.cva.service.AnimalService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContextTest {

    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AnimalService service = context.getBean(AnimalService.class);
        Assertions.assertNotNull(service, "El bean existe en el contexto ");
    }


}
