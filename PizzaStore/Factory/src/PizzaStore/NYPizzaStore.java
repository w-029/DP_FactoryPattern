package PizzaStore;

import Pizza.Pizza;
import Pizza.NYStyleCheesePizza;

/* 这是PizzaStore的底层组件
 * 它负责将“抽象”类Pizza实例化 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
//        else if (type.equals("veggie")) {
//            return new NYStyleVeggiePizza();
//        }
//        else if (type.equals("clam")) {
//            return new NYStyleClamPizza();
//        }
//        else if (type.equals("pepperoni")) {
//            return new NYStylePepperoniPizza();
//        }
        else {
            return null;
        }
    }
}
