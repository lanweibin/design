package wrapper;

/**
 * 具体装饰角色“鱼儿”
 */

public class Fish extends Change{

    public Fish(TheGreatestSage sage) {
        super(sage);
    }

    public void move(){
        System.out.println("Fish Move");
    }
}
