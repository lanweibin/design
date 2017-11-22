package structural.proxy;

public class BuyCarProxy implements IBuyCar {
    private Customer customer;

    public BuyCarProxy(Customer customer){
        this.customer = customer;
    }


    public void buyCar() {
        customer.buyCar();
    }
}
