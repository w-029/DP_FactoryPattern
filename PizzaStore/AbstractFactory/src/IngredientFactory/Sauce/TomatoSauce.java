package IngredientFactory.Sauce;

/* 这个具体的子类负责实现超类的抽象工厂方法，
 * 不同的超类继承同一个子类是为了统一返回类型 */
public class TomatoSauce extends Sauce {
    @Override
    Sauce createSauce() {
        return null;
    }
}
