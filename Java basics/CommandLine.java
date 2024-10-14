//11. Write a program to consider command line arguments num, length as inputs (where length is optional) if you won't get that use default number as length.



public class CommandLine {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Usage: java CommandLineArguments <num> [<length>]");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]);
            int length = (args.length > 1) ? Integer.parseInt(args[1]) : 10;

            for (int i = 1; i <= length; i++) {
                System.out.print(num * i + " ");
            }
        } catch (NumberFormatException e) {
            System.out.println("Both num and length provided should be integers.");
        }
    }
}

