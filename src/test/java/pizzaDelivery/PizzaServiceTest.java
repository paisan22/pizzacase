package pizzaDelivery;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 * Created by paisanrietbroek on 31/10/2016.
 */
public class PizzaServiceTest {

    private static PizzaService pizzaService;

    @BeforeClass
    public static void createService() {

        pizzaService = new PizzaService();
    }

    @Test
    public void createPizza() throws Exception {
        pizzaService.createPizza("pizza1", 10);
    }

    @AfterClass
    public static void end() {
        pizzaService.closeFactory();
    }
}