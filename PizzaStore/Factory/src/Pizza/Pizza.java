package Pizza;

import java.util.ArrayList;

/* Pizza是所有具体比萨饼的父类，
 * 其属性成员需要由具体的子类来指定 */
public abstract class Pizza {

    String name;
    String dough;   //面团类型
    String sauce;   //酱料类型
    ArrayList toppings = new ArrayList();   //一套佐料

    /* 针对不同的子类进行准备工序 */
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough ...");
        System.out.println("Adding sauce ...");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
    }

    /* 以下三个工序是所有子类通有的步骤 */
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
