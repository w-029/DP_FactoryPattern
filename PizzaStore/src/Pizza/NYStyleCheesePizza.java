package Pizza;

/* 这是具体的比萨饼，它扩展了Pizza超类，
 * 并定制属于自己的各个属性（配料不同），
 * 但制作的流程都是在Pizza抽象类里统一了的，
 * 这符合OO设计原则1：封装变化 */

/* 并列的“纽约风格的比萨饼”还有很多，
 * 根据不同的类型来定制配料，比如：
 * NYStyleVeggiePizza类、
 * NYStyleClamPizza类、
 * NYStylePepperoniPizza类 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated *** Cheese");
    }
}
