import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentReport {
    static Scanner sc = new Scanner(System.in);

    private Map<Integer, String> studentInfo = new HashMap<>();
    private Map<Integer, Map<String, Integer>> studentSubjects = new HashMap<>();

    public void data() {
        System.out.print("Do you have student data: ");
Stream.of(sc.next()).filter(input -> input.equalsIgnoreCase("yes"))
        .findFirst()
        .ifPresentOrElse(
                input -> studentData(),
                () -> System.out.println("Bye!")
        );
    }

    private void studentData() {
        System.out.print("Enter the Student name: ");
        String name = sc.next();
        System.out.print("Enter the Student ID: ");
        int ID = sc.nextInt();

        studentInfo.put(ID, name);

        System.out.print("Do you want to add subject details: ");
        if (sc.next().equalsIgnoreCase("yes")) {
            addSubjects(ID);
        } else {
            display();
        }
    }

    private void addSubjects(int ID) {
        Map<String, Integer> subjectsAndMarks = new HashMap<>();

        do {
            System.out.print("Enter the subject name: ");
            String subject = sc.next();
            System.out.print("Enter marks for " + subject + ": ");
            int marks = sc.nextInt();

            subjectsAndMarks.put(subject, marks);

            System.out.print("Do you want to add another subject: ");
        }
        while (!sc.next().equalsIgnoreCase("no"));


        studentSubjects.put(ID, subjectsAndMarks);

        System.out.print("Do you want to add another student: ");
        if (sc.next().equalsIgnoreCase("yes")) {
            studentData();
        } else {
            display();
        }
    }

    private Set<String> gatherAllSubjects() {
        return studentSubjects.values().stream()
                .flatMap(subjects -> subjects.keySet().stream())
                .collect(Collectors.toSet());
    }


    private void display() {
        List<String> subjectList = gatherAllSubjects().stream()
                .sorted()
                .toList();


        System.out.printf("%-30s %-10s", " Name", "ID");
        subjectList.forEach(subject -> System.out.printf("%-20s", subject));
        System.out.println();



        studentInfo.entrySet().stream()
                .forEach(entry -> {
                    int ID = entry.getKey();
                    String name = entry.getValue();
                    System.out.printf("%-30s %-10d", name, ID);
                    Map<String, Integer> subjects = studentSubjects.getOrDefault(ID, Collections.emptyMap());

        subjectList.forEach(subject -> {
                          String mark = subjects.getOrDefault(subject, -1) == -1 ? "N/A" : String.valueOf(subjects.get(subject));
                          System.out.printf("%-20s", mark);
                      });
                      System.out.println();
                  });
    }
}
