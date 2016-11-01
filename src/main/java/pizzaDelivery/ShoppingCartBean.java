package pizzaDelivery;

import lombok.Getter;
import lombok.Setter;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by paisanrietbroek on 30/10/2016.
 */

@Getter
@Setter
@SessionScoped
@Named
public class ShoppingCartBean implements Serializable {
    private PizzaService pizzaService;
    private List<PizzaBean> pizzaBeanList;

    public ShoppingCartBean() {
        this.pizzaService = new PizzaService();
        this.pizzaBeanList = this.pizzaService.getPizzas();
    }

    public void deletePizza(final PizzaBean pizzaBean) {
        this.pizzaBeanList.removeIf(e -> e.equals(pizzaBean));
    }

    public void addPizza(final PizzaBean pizzaBean) {
        this.pizzaService.createPizza(pizzaBean.getName(), pizzaBean.getPrice());
    }
}
