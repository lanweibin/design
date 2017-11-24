package behavioral.observer;

public class Client {
    public static void main(String[] args) {
        //定义观察目标
        AllyControlCenter acc ;
        acc = new ConcreteAllyControlCenter("金庸群侠");

        //定义四个观察者
        Observer play1,play2,play3,play4;
        play1 = new Player("杨过");
        acc.join(play1);

        play2 = new Player("令狐冲");
        acc.join(play2);

        play3 = new Player("张无忌");
        acc.join(play3);

        play4 = new Player("段誉");
        acc.join(play4);

        //某成员受到攻击
        play1.beAttacked(acc);

        //执行顺序
        //play1.beAttacked() --> AllyControlCenter.notifyObserver() -->Player.help()

    }
}
