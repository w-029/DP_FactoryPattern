package Pizza;

import IngredientFactory.PizzaIngredientFactory;

/* 这是Pizza抽象类的具体子类，
 * 它会通过自己的原料工厂来实现超类Pizza中变化的部分 */
public class PepperoniPizza extends Pizza {
    /* 针对接口原料工厂编程 */
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        /* 构造器中指定一个“原料工厂”，通过原料工厂获得相应的披萨原料，
         * Pizza类只负责通用的制作方法，
         * 不同地域的原料对Pizza的制作不构成任何影响，
         * 即：Pizza与原料完成了“解耦” */
        this.ingredientFactory = ingredientFactory;
    }

    /* 只需要实现超类中的抽象方法即可，
     * 其他方法可以选择重写进行覆盖，也可原样引用 */
    @Override
    public void prepare() {
        /* 不同地域的原料工厂可能提供各种Pizza原料，
         * 但当前Pizza子类只需要获取自己需要的几种原料即可 */
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
