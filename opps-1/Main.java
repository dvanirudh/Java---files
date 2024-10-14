public class Main {
    public static void main(String[] args) {
        
    
    ImportedProduct importedProduct = new ImportedProduct("Laptop", 1000, 150);
        importedProduct.print();

        System.out.println();

        // Creating an instance of DiscountedProduct
        DiscountedProduct discountedProduct = new DiscountedProduct("Smartphone", 800, 10);
        discountedProduct.print();

        System.out.println();

        // Upcasting: Treating ImportedProduct as Product
        Product product1 = importedProduct;
        product1.print();  // Will call the overridden print() method of ImportedProduct

        System.out.println();

        // Upcasting: Treating DiscountedProduct as Product
        Product product2 = discountedProduct;
        product2.print();  // Will call the overridden print() method of DiscountedProduct

        System.out.println();

        // Downcasting: Casting back to ImportedProduct
        if (product1 instanceof ImportedProduct) {
            ImportedProduct downcastedImported = (ImportedProduct) product1;
            downcastedImported.setImportDuty(200);
            downcastedImported.print();
        }

        System.out.println();

        // Downcasting: Casting back to DiscountedProduct
        if (product2 instanceof DiscountedProduct) {
            DiscountedProduct downcastedDiscounted = (DiscountedProduct) product2;
            downcastedDiscounted.setDiscountRate(15);
            downcastedDiscounted.print();
        }
    }
    

}