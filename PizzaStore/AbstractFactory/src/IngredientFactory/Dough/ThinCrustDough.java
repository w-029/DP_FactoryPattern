package IngredientFactory.Dough;

/* 这个具体的子类负责实现超类的抽象工厂方法，
 * 不同的超类继承同一个子类是为了统一返回类型 */
public class ThinCrustDough extends Dough {
    @Override
    Dough createDough() {
        return null;
    }
}
