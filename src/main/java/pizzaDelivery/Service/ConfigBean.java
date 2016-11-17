package pizzaDelivery.Service;

import pizzaDelivery.JPA.Pizza;

import javax.annotation.PostConstruct;
import javax.ejb.*;
import java.io.Serializable;

/**
 * Created by paisanrietbroek on 16/11/2016.
 */

@Singleton
@Startup
public class ConfigBean implements Serializable {

    @EJB
    private PizzaServiceInterface pizzaServiceBean;

    @PostConstruct
    public void createData() throws EJBException{
        try {
            pizzaServiceBean.add(new Pizza(1, "Pizza 1", 5.5));
            pizzaServiceBean.add(new Pizza(2, "Pizza 2", 7.2));
            pizzaServiceBean.add(new Pizza(3, "Pizza 3", 4.9));
        } catch (EJBException ex) {
            System.out.println(ex.getStackTrace().toString());
        }
    }
}
