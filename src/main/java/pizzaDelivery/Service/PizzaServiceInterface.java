package pizzaDelivery.Service;

import pizzaDelivery.JPA.Pizza;

import javax.ejb.Local;
import javax.ejb.Remote;
import java.util.List;

/**
 * Created by paisanrietbroek on 05/11/2016.
 */

@Remote
public interface PizzaServiceInterface {
    Pizza add(Pizza p);
    List getAll ();
}
