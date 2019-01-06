import Pizza.Pizza;

public class PizzaStore {
    SimpleFactory simpleFactory;

    public PizzaStore(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        /* pizza会根据不同的类型而返回不同的对象，
         * 这部分变化的会被单独封装在simpleFactory类中
         * 这符合OO设计原则1——封装变化 */
        pizza = simpleFactory.createPizza(type);
        /* 以下是一些不变的制作步骤 */
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
