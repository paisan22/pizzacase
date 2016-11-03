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

        pizzaService.createPizza("pizza1", 8);
        pizzaService.createPizza("pizza2", 7);
        pizzaService.createPizza("pizza3", 11);

    }

    @Test
    public void delete() {
        pizzaService.delete(1);
    }

    @Test
    public void update() {
        PizzaBean pizzaBean = new PizzaBean("mango", 400);
        pizzaBean.setId(6);
        pizzaService.update(pizzaBean);
    }

    @AfterClass
    public static void end() {
        pizzaService.closeFactory();
    }
}