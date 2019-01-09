import PizzaStore.PizzaStore;
import PizzaStore.NYPizzaStore;
import PizzaStore.ChicagoPizzaStore;
import Pizza.Pizza;

/* 不同的子类店会通过“工厂方法”返回不同的Pizza实例，
 * 即：Pizza实例是“推迟”到PizzaStore的具体子类中实现——OO工厂模式。*/

/* NYPizzaStore类与ChicagoPizzaStore类所返回的
 * 低层的nyStore与chicagoStore对象依赖于高层的抽象类Pizza，
 * 这与通常的高层超类依赖低层子类来实现是相反的——OO依赖倒置原则。 */
public class PizzaTestDrive {
    public static void main(String arg[]) {

        /* 创建了两个不同的店 */
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        /* 在一个店里下单 */
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ordered a " + pizza.getName() + "\n");

        /* 在另一个店里下单 */
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Ordered a " + pizza.getName() + "\n");
    }
}
