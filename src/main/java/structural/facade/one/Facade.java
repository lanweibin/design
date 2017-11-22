package structural.facade.one;

public class Facade {
    private SubSystemOne one;
    private  SubSystemTwo two;
    private  SubSystemThree three;

    public  Facade(){
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
    }

    public void methodA(){
        System.out.println("A组方法:");
        one.methodOne();
        two.methodTwo();
    }

    public  void methodB(){
        System.out.println("B组方法");
        two.methodTwo();
        three.methodThree();
    }
}
