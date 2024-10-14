// 17. Create classes to store details for two different types of Products,
//    a) ImportedProducts which have import duty.
//    b) DiscountedProducts which have a discount rate.
// All products have name and base_price.Create required Constructors and following methods: print(), getNetPrice(), setPrice(), setImportDuty(), 
// setDiscountRate() also experiment with upcasting and downcasting.


public class ImportedProduct extends Product {
    private double importDuty;

    public ImportedProduct(String prodName, double price, double importDuty){
        super(prodName, price);
        this.importDuty = importDuty;
    }

    public void setImportDuty(double importDuty) {
        this.importDuty = importDuty;
    }

    public double netPrice(){
        return getPrice() + importDuty;
    }


    public void print(){
        super.print();
        System.out.println("import Duty :"+ importDuty);
        System.out.println(netPrice());
    }


}
