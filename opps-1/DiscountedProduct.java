// 17. Create classes to store details for two different types of Products,
//    a) ImportedProducts which have import duty.
//    b) DiscountedProducts which have a discount rate.
// All products have name and base_price.Create required Constructors and following methods: print(), getNetPrice(), setPrice(), setImportDuty(), 
// setDiscountRate() also experiment with upcasting and downcasting.


public class DiscountedProduct extends Product {
    private double discountedRate;
    
    public DiscountedProduct(String prodName, double price, double discountedRate) {
        super(prodName, price);
        this.discountedRate = discountedRate;
    }

public void setDiscountRate(double discountedRate) {
    this.discountedRate = discountedRate;
}

public double netPrice(){
    return getPrice() * (1 - discountedRate / 100);
}

    public void print(){
        super.print();
        System.out.println("Discounted Product price:"+ discountedRate);
        System.out.println(netPrice());
     
    }

}
