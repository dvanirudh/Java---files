//  36. File Marks.txt, which have marks separated by comma in different lines.
//  Find the total marks of each line and display them.(Use fault tolerance)
// 37. Write 20 marks into Marks.data.



import java.io.*;
import java.util.*;

public class Library5 {
    public static void fileName() throws IOException{
        String fn = "marks.txt";
        File file = new File(fn);
        file.createNewFile();
                System.out.println("File created: " + fn);
        try (BufferedReader br = new BufferedReader(new FileReader(fn))) {
            
            String line;

           
            while ((line = br.readLine()) != null) {
                int total = Marks(line);  
                System.out.println("Total marks for this line: " + total);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    
}
    
    public static int Marks(String input){
        String[] marks = input.split(",");

        int total = 0;

        for (int i = 0; i < marks.length; i++) {
          
            total += Integer.parseInt(marks[i].trim());
        }
        return total;
    }
    
    public static void writeMarksToFile() throws IOException {
        String outputFile = "Marks.data";
        Random random = new Random();
        
        // Writing 20 random marks to Marks.data
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            for (int i = 0; i < 20; i++) {
                int mark = random.nextInt(101); // Generate random marks between 0 and 100
                bw.write(Integer.toString(mark));
                if (i < 19) {
                    bw.write(","); // Add comma between marks, not after the last one
                }
            }
            System.out.println("20 marks written to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter marks separated by commas: ");
        String input = sc.nextLine();
         
        fileName();
        int total = Marks(input);
        System.out.println("Total marks: " + total);

          writeMarksToFile();

        sc.close();
        
    }
}
