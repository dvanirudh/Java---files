
// 14. Create a class called Counter that stores a number and provides methods to increment, decrement and return the count. 
// Provide the constructor without parameters that sets the values to zero and 
// another constructor with parameters takes the values and starts from there.



public class Counter {
    private int count;


    public Counter(){}

    public Counter(int count){
        this.count = count;
    }


    private int getCount() {
        return count;   
    }

 
    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public static void main(String[] args) {
        Counter counter = new Counter
        (10);

        // Increment the counter
        System.out.println("Initial count: " + counter.getCount());
        counter.increment();
        System.out.println("Count after increment: " + counter.getCount());
    
    
        counter.decrement();
        System.out.println("Count after decrement: " + counter.getCount());
    
    }
}

