package IngredientFactory;

import IngredientFactory.Cheese.Cheese;
import IngredientFactory.Clams.Clams;
import IngredientFactory.Dough.Dough;
import IngredientFactory.Pepperoni.Pepperoni;
import IngredientFactory.Sauce.Sauce;
import IngredientFactory.Veggies.Veggies;

/* OO抽象工厂——提供一个接口，
 * 用于创建相关/依赖对象的家族，
 * 而不需要明确指定具体类 */

/* 这个接口就是一个“抽象工厂”，
 * 每个具体的子工厂都必须实现它 */
public interface PizzaIngredientFactory {
    /* 针对接口编程的实质是：针对抽象类编程。
     * 所以下面工厂方法的返回类型都是抽象类，而不是严格的接口，
     * 不同的具体子类通过继承这些抽象类而获得统一的返回类型 */
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
