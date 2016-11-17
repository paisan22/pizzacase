package pizzaDelivery.web;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pizzaDelivery.Service.PizzaServiceInterface;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by paisanrietbroek on 15/11/2016.
 */


@NoArgsConstructor
@Named
@RequestScoped
@Data
public class ShoppingCart implements Serializable {

    @EJB
    private PizzaServiceInterface pizzaServiceBean;
}
