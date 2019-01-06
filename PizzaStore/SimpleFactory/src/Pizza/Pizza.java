package Pizza;

import java.util.ArrayList;

/* Pizza是所有具体比萨饼的父类，
 * 其name属性需要由具体的子类来指定 */
public abstract class Pizza {

    /* name是因不同子类而变化的 */
    public String name;

    /* 针对不同的子类进行准备工序 */
    public void prepare() {
        System.out.println("Preparing " + name);
    }

    /* 以下三个工序是所有子类通有的步骤,
     * 它们是不变的部分 */
    public void bake() {
        System.out.println("Baking ...");
    }

    public void cut() {
        System.out.println("Cutting ...");
    }

    public void box() {
        System.out.println("Boxing ..." + "\n");
    }
}
