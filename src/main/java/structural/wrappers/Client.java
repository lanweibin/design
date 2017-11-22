package structural.wrappers;

public class Client {
    public static void main(String[] args) {
//
        Component component,componentSB; //使用抽象构件定义
        component = new Window(); //定义具体构件
        componentSB = new ScrollBarDecorator(component); //定义装饰后的构件
        componentSB.display();

//        Component component,componentSB,componentBB; //全部使用抽象构件定义
//        component = new Window();
//        componentSB = new ScrollBarDecorator(component);
//        componentBB = new BlackBorderDecorator(componentSB); //
//        componentBB.display();

    }
}
