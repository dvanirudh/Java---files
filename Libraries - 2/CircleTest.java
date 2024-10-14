// 41. Create a class called Circle with x & y radius, Now create Hashset & insert circle objects with some duplicates, 
// and also use treeset for the same for circle objects and see what happens.



import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;


class Circle implements Comparable<Circle> {
    private int x, y;
    private double radius;

    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Getters for x, y, and radius
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    // Override equals method to check for equality based on x, y, and radius
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return x == circle.x && y == circle.y && Double.compare(circle.radius, radius) == 0;
    }

    // Override hashCode method to generate hash based on x, y, and radius
    @Override
    public int hashCode() {
        return Objects.hash(x, y, radius);
    }

    // Override compareTo for TreeSet sorting (we'll sort by radius)
    @Override
    public int compareTo(Circle other) {
        return Double.compare(this.radius, other.radius);
    }

    // Override toString method for easy printing
    @Override
    public String toString() {
        return "Circle{" + "x=" + x + ", y=" + y + ", radius=" + radius + '}';
    }
}

public class CircleTest {
    public static void main(String[] args) {
        // Creating some circle objects (some are duplicates)
        Circle c1 = new Circle(0, 0, 5.0);
        Circle c2 = new Circle(1, 1, 7.5);
        Circle c3 = new Circle(0, 0, 5.0); 
        Circle c4 = new Circle(2, 2, 3.0);
        Circle c5 = new Circle(1, 1, 7.5); 

        // HashSet to store Circle objects
        Set<Circle> hashSet = new HashSet<>();
        hashSet.add(c1);
        hashSet.add(c2);
        hashSet.add(c3); 
        hashSet.add(c4);
        hashSet.add(c5); 

 
        System.out.println("HashSet contains:");
        for (Circle c : hashSet) {
            System.out.println(c);
        }

  
        Set<Circle> treeSet = new TreeSet<>();
        treeSet.add(c1);
        treeSet.add(c2);
        treeSet.add(c3); 
        treeSet.add(c4);
        treeSet.add(c5); 

     
        System.out.println("\nTreeSet contains:");
        for (Circle c : treeSet) {
            System.out.println(c);
        }
    }
}
