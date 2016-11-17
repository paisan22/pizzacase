package pizzaDelivery.JPA;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by paisanrietbroek on 30/10/2016.
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
@NamedQuery(name = "findAll", query = "SELECT p FROM Pizza p")
public class Pizza implements Serializable {

    @Id
    private int id;
    private String name;
    private double price;

    public Pizza(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
