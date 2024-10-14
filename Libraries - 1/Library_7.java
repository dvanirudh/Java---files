// 25. Write a program to accept names until the END is given and display all the names separated by '-'.



import java.util.Scanner;

public class Library_7 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        StringBuilder result = inputStr();
        System.out.println("Concatenated Names: " + result.toString());        
    }
public static StringBuilder inputStr(){
    StringBuilder names = new StringBuilder();
    while(true){
        System.out.println("Enter a name (or type 'END' to finish): ");
        String name = sc.nextLine();
        if(name.equalsIgnoreCase("END")){
            break;
        }
        if(names.length() > 0)
            names.append("-");
        names.append(name);
    }
return names;
}
   
  
    
}
