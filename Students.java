
import java.util.*;

public class Students {
    static Scanner sc = new Scanner(System.in);

    private List<String> names = new ArrayList<>();
    private List<Integer> ids = new ArrayList<>();
    private List<List<String>> subjectsList = new ArrayList<>();
    private List<List<Integer>> marksList = new ArrayList<>();

    public void data() {
        System.out.print("Do you have student data : ");
        if (sc.next().equalsIgnoreCase("yes")) {
            studentData();
        } else {
            System.out.println("Bye!");
        }
    }

    private void studentData() {
        System.out.print("Enter the Student name: ");
        String name = sc.next();
        System.out.print("Enter the Student ID: ");
        int ID = sc.nextInt();

        names.add(name);
        ids.add(ID);

        System.out.print("Do you want to add subject details : ");
        if (sc.next().equalsIgnoreCase("yes")) {
            marks(name, ID);
        } else {
            display();
        }
    }


    private void marks(String name, int ID) {
        List<String> subjects = new ArrayList<>();
        List<Integer> subjectMarks = new ArrayList<>();

        while (true) {
            System.out.print("Enter the subject name: ");
            String subject = sc.next();
            System.out.print("Enter marks for " + subject + ": ");
            subjectMarks.add(sc.nextInt());
            subjects.add(subject);

            System.out.print("Do you want to add another subject : ");
            if (sc.next().equalsIgnoreCase("no"))
                break;
        }

        subjectsList.add(subjects);
        marksList.add(subjectMarks);

        System.out.print("Do you want to add another student : ");
        if ("yes".equalsIgnoreCase(sc.next())) {
            studentData();
        } else {
            display();
        }
    }

    private List<String> gatherAllSubjects() {
        Set<String> subjectSet = new HashSet<>();
        for (List<String> subjects : subjectsList) {
            subjectSet.addAll(subjects);
        }
        return new ArrayList<>(subjectSet);
    }

    private void display() {
        List<String> expectedSubjects = gatherAllSubjects();

        for (String subject : expectedSubjects) {
            System.out.printf("%-45s", subject);
        }
        System.out.println();

        for (int i = 0; i < names.size(); i++) {
            String Name = names.get(i);
            int ID = ids.get(i);
            List<String> subjects = subjectsList.get(i);
            List<Integer> marks = marksList.get(i);

            System.out.printf("%-30s %-10d", Name, ID);
            for (String subject : expectedSubjects) {
                int index = subjects.indexOf(subject);
                String mark = "" ;
                if(index != -1)
                    mark = String.valueOf(marks.get(index));
                else
                    mark = "N/A";
                System.out.printf("%-30s", mark);
            }
            System.out.println();
        }
    }
}