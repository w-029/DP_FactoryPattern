package PizzaStore;

import Pizza.Pizza;

/* 披萨店里有一个抽象的方法createPizza(String type)，
 * 所有它也是抽象的，需要在PizzaStore的子类中去实现createPizza()方法 */
public abstract class PizzaStore {

    /* 订购Pizza */
    public Pizza orderPizza(String type) {
        Pizza pizza;

        /* 使用抽象方法来获得不同类型的pizza对象 */
        pizza = createPizza(type);

        /* 以下是所有pizza通有的制作步骤，
         * 不管“抽象方法”createPizza()返回的是哪种类型的pizza，
         * 只要是超类型Pizza，就执行这套标准工序
         * 可见：制作工序与具体的pizza子类型已经“解耦”*/

        /* OO设计原则6——要依赖抽象，不要依赖具体类。
         * 绝不能让高层组件PizzaStore依赖低层组件(PizzaStore的子类)，
         * 两者都应该依赖“抽象”的Pizza类) */
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        /* 制做完成，返回定制的pizza */
        return pizza;
    }

    /* OO工厂方法——定义了一个创建对象的接口，
     * 但由子类决定要实例化的类是哪一个。
     * 工程方法让类把实例化推迟到子类。 */
    abstract Pizza createPizza(String type);
}
