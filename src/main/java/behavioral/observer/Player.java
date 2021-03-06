package behavioral.observer;

//战队成员类：具体观察者类
public  class Player implements Observer {
    private String name;
    public Player(String name){
        this.name = name;
    }

    public String getName() {

        return this.name = name;
    }

    public void getName(String name) {
        this.name = name;
    }

    public void help() {

        System.out.println("坚持住，" + this.name + "来救你！");
    }

    public void beAttacked(AllyControlCenter acc) {
        System.out.println(this.name+"被攻击！");
        acc.notifyObserver(name);
    }
}
