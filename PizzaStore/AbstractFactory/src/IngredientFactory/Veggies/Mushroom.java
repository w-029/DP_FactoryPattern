package IngredientFactory.Veggies;

/* 这个具体的子类负责实现超类的抽象工厂方法，
 * 不同的超类继承同一个子类是为了统一返回类型 */
public class Mushroom extends Veggies {
    @Override
    Veggies createVeggies() {
        return null;
    }
}
