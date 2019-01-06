import Pizza.Pizza;
import Pizza.CheesePizza;
import Pizza.ClamPizza;
import Pizza.PepperoniPizza;
import Pizza.VeggiePizza;

/* 简单工厂内的方法一般为静态的，
 * 严格来讲，简单工厂不是一个设计模式，
 * 但简单工厂却是很常用的一种技巧 */
public class SimpleFactory {

    /* createPizza()方法会根据不同的type参数，
     * 返回不同的子类对象 */
    /* createPizza()方法一般被定义为static类型的，
     * static类型方法的好处是不需要创建SimpleFactory对象，就直接引用，
     * 其缺点是：不能通过继承来改变其行为 */
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }
        else if (type.equals("clam")) {
            pizza = new ClamPizza();
        }
        else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }
        else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
