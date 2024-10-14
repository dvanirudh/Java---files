// 28. Design classes that need to sort a collection of Product objects either by product name or by price.

import java.util.*;

// Product class definition
public class Product {
    private int id;
    private String name;
    private double price;
    private byte rating;

    public Product(int id, String name, double price, byte rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        setRating(rating);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public byte getRating() {
        return rating;
    }

    // Ensure that rating is within 1 to 5
    public void setRating(byte rating) {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating must be between 1 and 5.");
        }
        this.rating = rating;
    }

    // toString method
    @Override
    public String toString() {
        return "Product{ID=" + id + ", Name='" + name + "', Price=" + price + ", Rating=" + rating + "}";
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Laptop", 1200.50, (byte) 4));
        productList.add(new Product(2, "Headphones", 150.75, (byte) 5));
        productList.add(new Product(3, "Smartphone", 800.00, (byte) 4));
        productList.add(new Product(4, "Monitor", 300.00, (byte) 3));

        // Print the original list
        System.out.println("Original List:");
        for (Product p : productList) {
            System.out.println(p);
        }

        // Sort by product name
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().compareToIgnoreCase(p2.getName());
            }
        });

        // Print sorted list by product name
        System.out.println("\nSorted by Product Name:");
        for (Product p : productList) {
            System.out.println(p);
        }

        // Sort by product price
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        // Print sorted list by product price
        System.out.println("\nSorted by Product Price:");
        for (Product p : productList) {
            System.out.println(p);
        }
    }
}

