package structural.facade.two;

public class Client {
    public static void main(String[] args) {
        Fund fund = new Fund();

        fund.buy();
        System.out.println("------------------");
        fund.sell();
    }
}
