package Pizza;

/* 这是具体的比萨饼，它扩展了Pizza超类，
 * 并指定属于自己的name，
 * 但制作的流程都是在Pizza抽象类里统一了的，
 * 这符合OO设计原则1：封装变化 */
public class ClamPizza extends Pizza {

    public ClamPizza() {
        name = "ClamPizza";
    }
}
