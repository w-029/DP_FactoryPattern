package IngredientFactory;

import IngredientFactory.Cheese.Cheese;
import IngredientFactory.Cheese.MozzarellaCheese;
import IngredientFactory.Cheese.ReggianoCheese;
import IngredientFactory.Clams.Clams;
import IngredientFactory.Clams.FreshClams;
import IngredientFactory.Clams.RefrigerantClams;
import IngredientFactory.Dough.Dough;
import IngredientFactory.Dough.ThickCrustDough;
import IngredientFactory.Dough.ThinCrustDough;
import IngredientFactory.Pepperoni.Pepperoni;
import IngredientFactory.Pepperoni.SlicedPepperoni;
import IngredientFactory.Sauce.MarinaraSauce;
import IngredientFactory.Sauce.Sauce;
import IngredientFactory.Sauce.TomatoSauce;
import IngredientFactory.Veggies.*;

/* 芝加哥披萨原料工厂 是 披萨原料工厂的一个具体子类，
 * 它会从各种原料工厂中选择具体的子类作为制作Pizza的原料 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {
                /* 这里写得有点死，可以优化为：
                 * 将一个蔬菜组作为一个返回值 */
                new Garlic(),
                new Onion(),
                new Mushroom(),
                new RedPepper()
        };
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        /* 无论纽约还是芝加哥，都是用切片式意大利辣香肠 */
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        /* 芝加哥在内陆，只能选择“冷冻蛤蜊”这个具体的子类了 */
        return new RefrigerantClams();
    }
}
