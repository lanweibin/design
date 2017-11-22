package structural.wrapper;

/**
 * 抽象装饰角色“七十二变”
 */

public class Change implements TheGreatestSage {
    private TheGreatestSage sage;
    public  Change(TheGreatestSage sage){
        this.sage = sage;
    }

    public void move() {
        sage.move();
    }
}
