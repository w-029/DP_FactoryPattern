package IngredientFactory.Dough;

public abstract class Dough {
    /* 这是抽象工厂方法，它的实现依赖子类，
     * 不同的子类通过实现它来统一返回值类型（统一的编程接口） */
    abstract Dough createDough();
}
