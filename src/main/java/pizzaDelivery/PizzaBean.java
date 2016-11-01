package pizzaDelivery;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.persistence.*;

/**
 * Created by paisanrietbroek on 30/10/2016.
 */

@Getter
@Setter
@NoArgsConstructor
@Named
@RequestScoped
@Entity
public class PizzaBean {

    @TableGenerator(name = "pizza_seq", initialValue = 1, allocationSize = 1)
    @Id @GeneratedValue( generator = "pizza_seq")
    private int id;
    private String name;
    private double price;

    public PizzaBean(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
