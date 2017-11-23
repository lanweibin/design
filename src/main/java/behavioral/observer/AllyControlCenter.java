package behavioral.observer;

import java.util.ArrayList;

//战队控制中心类
public abstract class AllyControlCenter {
    protected String allName;
    protected ArrayList<Observer> players = new ArrayList<Observer>();

    public String getAddName() {
        return allName;
    }

    public void setAddName(String addName) {
        this.allName = allName;
    }

    //注册方法
    public void join(Observer obs){
        System.out.println(obs.getName() + "加入" + this.allName + "战队！");
        players.add(obs);
    }

    //注销方法
    public void quit(Observer obs){
        System.out.println(obs.getName() + "退出" + this.allName + "战队！");
        players.remove(obs);
    }

    //声明抽象通知方法
    public abstract void notifyObserver(String name);
}
