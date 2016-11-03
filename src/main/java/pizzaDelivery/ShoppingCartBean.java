package pizzaDelivery;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by paisanrietbroek on 30/10/2016.
 */

@Getter
@Setter
@RequestScoped
@Named
public class ShoppingCartBean implements Serializable {
    private PizzaService pizzaService;
    private List<PizzaBean> pizzaBeanList;

    public ShoppingCartBean() {
        this.pizzaService = new PizzaService();
        updateList();
    }

    public void deletePizza(final PizzaBean pizzaBean) {
        pizzaService.delete(pizzaBean.getId());
    }

    public void addPizza(final PizzaBean pizzaBean) {
        this.pizzaService.createPizza(pizzaBean.getName(), pizzaBean.getPrice());
    }

    public void updatePizza(PizzaBean pizzaBean) {
        this.pizzaService.update(pizzaBean);
    }

    public void updateList() {
        this.pizzaBeanList = this.pizzaService.getPizzas();
    }
}
