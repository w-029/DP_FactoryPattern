package Pizza;

/* 这是具体的比萨饼，它扩展了Pizza超类，
 * 并定制属于自己的各个属性（配料不同），
 * 但制作的流程都是在Pizza抽象类里统一了的，
 * 这符合OO设计原则1：封装变化 */

/* 并列的“芝加哥风格的比萨饼”还有很多，
 * 根据不同的类型来定制配料，比如：
 * ChicagoStyleVeggiePizza类、
 * ChicagoStyleClamPizza类、
 * ChicagoStylePepperoniPizza类 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Sauce and Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    /* 这里重写(覆盖)了超类中的cut()方法，用另一种方式实现了它 */
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
