package Pizza;

import IngredientFactory.Cheese.Cheese;
import IngredientFactory.Clams.Clams;
import IngredientFactory.Dough.Dough;
import IngredientFactory.Pepperoni.Pepperoni;
import IngredientFactory.Sauce.Sauce;
import IngredientFactory.Veggies.Veggies;

/* Pizza是所有具体比萨饼的父类，
 * 其属性成员需要由具体的子类来指定 */
public abstract class Pizza {

    String name;
    Dough dough;        //面团类型
    Sauce sauce;        //酱料类型
    Veggies veggies[];  //各种素食原料
    Cheese cheese;      //奶酪
    Pepperoni pepperoni;//意大利辣香肠
    Clams clam;         //蚌、蛤蜊

    /* 通过原料工厂
     * 针对不同的比萨，收集所需的原料，
     * 具体实现推迟到子类中完成 */
    public abstract void prepare();

    /* 以下三个工序是所有子类通有的步骤,
     * 故：在超类中实现 */
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        /* 打印比萨代码 */
        return null;
    }
}
