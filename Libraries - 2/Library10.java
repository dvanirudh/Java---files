// 42. Create a treeset of strings and sort them by length (use Comparator)




import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Library10 {
    public static void main(String[] args) {
       
        Comparator<String> lengthComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int len1 = s1.length();
                int len2 = s2.length();
                
               
                if (len1 != len2) {
                    return len1 - len2; 
                } else {
                    return s1.compareTo(s2); 
                }
            }
        };

      
        Set<String> treeSet = new TreeSet<>(lengthComparator);

  
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Kiwi");
        treeSet.add("Cherry");
        treeSet.add("Orange");
        treeSet.add("Fig");

     
        System.out.println("TreeSet sorted by string length:");
        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}
