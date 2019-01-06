import Pizza.Pizza;

public class PizzaTestDrive {
    public static void main(String arg[]) {
        Pizza pizza;
        SimpleFactory simpleFactory = new SimpleFactory();
        PizzaStore pizzaStore = new PizzaStore(simpleFactory);

        pizza = pizzaStore.orderPizza("cheese");
        pizza = pizzaStore.orderPizza("clam");
        pizza = pizzaStore.orderPizza("pepperoni");
        pizza = pizzaStore.orderPizza("veggie");
    }
}
