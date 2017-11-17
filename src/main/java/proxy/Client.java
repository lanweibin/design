package proxy;

public class Client {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCash(12000);

        BuyCarProxy buyCarProxy = new BuyCarProxy(customer);
        buyCarProxy.buyCar();
    }
}
