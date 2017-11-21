package facade.two;

public class Fund {
    private NationalDebt nationalDebt;
    private  Realty realty;
    private  Stock stock;

    public Fund(){
        nationalDebt = new NationalDebt();
        realty = new Realty();
        stock = new Stock();
    }
    public void sell(){
        nationalDebt.sell();
        realty.sell();
        stock.sell();
    }

    public void buy(){
        nationalDebt.buy();
        realty.buy();
        stock.buy();
    }
}
