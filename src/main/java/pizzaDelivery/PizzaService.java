package pizzaDelivery;

import lombok.Getter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by paisanrietbroek on 31/10/2016.
 */

@Getter
public class PizzaService {

    protected static EntityManagerFactory emf;
    protected static EntityManager em;

    public PizzaService() {
        emf = Persistence.createEntityManagerFactory("PizzaService");
        em = emf.createEntityManager();
    }

    public PizzaBean createPizza(String name, double price) {
        PizzaBean pizzaBean = new PizzaBean(name, price);

        em.getTransaction().begin();
        em.persist(pizzaBean);
        em.getTransaction().commit();
        em.close();
        return pizzaBean;
    }

    public List<PizzaBean> getPizzas() {
        TypedQuery<PizzaBean> query = em.createQuery("SELECT e FROM PizzaBean e", PizzaBean.class);
        return query.getResultList();
    }

    public void closeFactory() {
        emf.close();
    }
}
