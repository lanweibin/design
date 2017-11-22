package structural.wrapper;

/**
 * 具体装饰角色“鸟儿”
 */

public class Bird extends Change {
    public Bird(TheGreatestSage sage) {
        super(sage);
    }

    public  void  move(){
        System.out.println("Bird Move");
    }
}
