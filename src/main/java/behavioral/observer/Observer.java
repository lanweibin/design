package behavioral.observer;

//抽象观察类  观察者
public interface Observer {
    public String getName();
    public void getName(String name);
    public void help();//声明支援盟友方法
    public void beAttacked(AllyControlCenter acc);
}
