//12. Create a class(Product) to store details of a product and provide required methods with the details prod_id, prod_name, price,quantity_on_hand
//Methods are:  init(prod_id,prod_name, price)
//getNetPrice() (returns the price after adding 12% tax)
//purchase()
//sell()
// Introduce multiple constructors in Product class.




public class Product {
    private int id;
    private String prodName;
    private double price;
    private double quantityOnHand;

    public Product() {}

    public Product( String prodName, double price) {
        this.prodName = prodName;
        this.price = price;
    }

    public Product(int id, String prodName, double price) {
        this.id = id;
        this.prodName = prodName;
        this.price = price;
        this.quantityOnHand = 0;

    }
    public Product(int id, String prodName) {
        this.id = id;
        this.prodName = prodName;
    }

    public int getId() {
        return id;
    }

    public String getProdName() {
        return prodName;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantityOnHand() {
        return quantityOnHand;
    }

    public void print(){
        System.out.println("product name :"+ prodName);
        System.out.println("product price :"+ price);
    }

    public double netPrice(){
        return price;
    }


    public double getNetPrice(){
       return price +(price + .12) ;
    }

    public void Purchase(int quantity){
          if(quantity > 0) {
              quantityOnHand += quantity;
              System.out.println(quantity + " units purchased. New stock: " + quantityOnHand);
          }
          else {
              System.out.println("out of stock..");
          }
    }
    public void Sell(int quantity){
        if (quantity > 0 && quantity <= quantityOnHand) {
            quantityOnHand -= quantity;
            System.out.println(quantity + " units sold. Remaining stock: " + quantityOnHand);
        } else {
            System.out.println("Invalid quantity to sell or insufficient stock.");
        }
    }

    public static void main(String[] args) {
        Product p = new Product(101, "Laptop", 50000.0);
        System.out.println("Product Name: " + p.getProdName());
        System.out.println("Price: " + p.getPrice());
        System.out.println("Net Price (with tax): " + p.getNetPrice());
        
        p.Purchase(10);
        p.Sell(3);


        
    }
}
