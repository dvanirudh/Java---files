import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] main) {
        List<Integer> arr = Arrays.asList(47, 43, 56, 99, 22, 76, 55, 12, 34, 67);
        List<String> words = List.of("apple" , "kiwi", "pear", "banana" , "orange");

        System.out.println("-----------------even numbers-------------------");
        arr.stream()
                .filter(n -> n%2==0)
                .forEach(System.out::println);

        System.out.println("-----------------odd numbers--------------------");
        arr.stream()
             .filter(n -> n%2!=0)
             .forEach(System.out::println);

        System.out.println("--------------------------Group the Strings by length------------------------");
        Map<Integer, List<String>>  res =   words.stream().collect(Collectors.groupingBy(String::length));
               System.out.println(res);

               System.out.println("-----------------Sorting the Strings based on first letter---------------------");
               words.stream().sorted((s1,s2) -> Character.compare(s1.charAt(0),s2.charAt(0)))
              .forEach(System.out::println);






    }
}
