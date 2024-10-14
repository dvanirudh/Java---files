// 15. Create a class Student that stores the details like admin_no, stu_name, course_joined and fees_paid.
// —> Courses are: JAVA, PYTHON.
// —> The total fees for java is 10k and for python is 7.5k.
// —> Provide a constructor to take required details.The default course is JAVA.
// —> Provide the following methods: getTotalFee(), getDue(), getFeePaid(), payment(amount).


public class Student {
    private int adminNo;
    private String studentName;
    private String courseJoined;
    private double feesPaid;

  public static double java_fee = 10000.0;
  public static double python_fee = 7500.0;
  public static double fee = java_fee + python_fee;

    public Student(){}

    public Student(int adminNo, String studentName, String courseJoined ){
        this.adminNo = adminNo;
        this.studentName = studentName;
        this.courseJoined = courseJoined.toUpperCase();
        this.feesPaid = 0.0;
        this.courseJoined = (courseJoined != null) ? courseJoined : "JAVA";
    }

    public int getAdminNo() {
        return adminNo;
    }

    public String getStudentName() {
        return studentName;
    }
    public double getTotalFee(){


        switch(courseJoined){
            case "JAVA": {
                 return java_fee; }
            case "PYTHON": {
                return python_fee;
                }
            case "pack": {
                    return fee;
                   }
            default:
                return java_fee;
            
        }

    }
      
    public double getDue(){
        return getTotalFee() - feesPaid;
    }
   
    public double getFeePaid() {
        return feesPaid;
    }


    public void payment(double amount) {
        if (amount > 0) {
            if (amount <= getDue()) {
                feesPaid += amount;
                System.out.println("Payment of " + amount + " made successfully. Total fees paid: " + feesPaid);
            } else {
                System.out.println("Payment exceeds due amount. You can only pay up to: " + getDue());
            }
        } else {
            System.out.println("Invalid payment amount. Payment should be greater than 0.");
        }
    }
    public static void main(String[] args) {
        Student student = new Student(1, "Anirudh", "java");
        System.out.println("Total Fee for " + student.courseJoined + ": " + student.getTotalFee());
        student.payment(3000);
        System.out.println("Fee Due: " + student.getDue());
        System.out.println(student.feesPaid);
    }
}

