package PizzaStore;

import Pizza.Pizza;
import Pizza.ChicagoStyleCheesePizza;

/* 这是PizzaStore的底层组件，
 * 它负责将“抽象”类Pizza实例化 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
//        else if (type.equals("veggie")) {
//            return new ChicagoStyleVeggiePizza();
//        }
//        else if (type.equals("clam")) {
//            return new ChicagoStyleClamPizza();
//        }
//        else if (type.equals("pepperoni")) {
//            return new ChicagoStylePepperoniPizza();
//        }
        else {
            return null;
        }
    }
}
