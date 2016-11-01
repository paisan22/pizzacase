package pizzaDelivery;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by paisanrietbroek on 01/11/2016.
 */

public class ShoppingCartBeanTest {

    private static ShoppingCartBean shoppingCartBean;

    @BeforeClass
    public static void start() {
        shoppingCartBean = new ShoppingCartBean();
    }

    @Test
    public void createPizza() {
        shoppingCartBean.addPizza(new PizzaBean("test", 12));
    }


}