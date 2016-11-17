package pizzaDelivery.Service;

import org.junit.BeforeClass;
import org.junit.Test;
import pizzaDelivery.JPA.Pizza;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.inject.Inject;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.*;

import static org.junit.Assert.*;

/**
 * Created by paisanrietbroek on 16/11/2016.
 */
public class PizzaServiceBeanTest {

    @EJB
    PizzaServiceBean pizzaServiceBean;

    @Test
    public void add() throws Exception {
        pizzaServiceBean.add(new Pizza(1, "t1", 2));
    }

    @Test
    public void getAll() throws Exception {

    }

}