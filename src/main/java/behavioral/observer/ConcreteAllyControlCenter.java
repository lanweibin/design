package behavioral.observer;

//具体战队控制中心类：具体的观察对象
public class ConcreteAllyControlCenter extends AllyControlCenter {
    public ConcreteAllyControlCenter(String allName){
        System.out.println(allName+"战队组建成功！");
        System.out.println("--------------------------");
        this.allName = allName;
    }

    //通知实现的方法
    public void notifyObserver(String name) {
        System.out.println(this.allName +"战队紧急通知，盟友"+ name +"遭受敌人攻击！");

        for(Object obs : players){
            if(!((Observer)obs).getName().equalsIgnoreCase(name)){
                ((Observer) obs).help();
            }
        }
    }
}
