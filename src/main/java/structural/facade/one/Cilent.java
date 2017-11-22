package structural.facade.one;

public class Cilent {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        System.out.println("--------------------------");
        facade.methodB();
    }
}
