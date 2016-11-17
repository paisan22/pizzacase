package pizzaDelivery.Service;
import lombok.NoArgsConstructor;
import pizzaDelivery.JPA.Pizza;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by paisanrietbroek on 05/11/2016.
 */

@NoArgsConstructor
@Stateful
@Remote(PizzaServiceInterface.class)
public class PizzaServiceBean implements PizzaServiceInterface {

    @PersistenceContext(unitName = "PizzaService")
    private EntityManager em;

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Pizza add(Pizza p) {
        em.persist(p);
        return p;
    }

    @Override
    public List<Pizza> getAll() {
        return em.createNamedQuery("findAll").getResultList();
    }
}
