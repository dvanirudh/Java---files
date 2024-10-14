// 16. Create a subclass called FactoryEmployee, for all factory employees we need to store bus_no, 
// emp_boards.Create a super class related to this subclass.


public class FactoryEmployee extends Employee {
    private int busNo;
    private boolean empBoards;

    public FactoryEmployee(String name, int id, String department, int busNo, boolean empBoards) {
        super(id, name, department);  
        this.busNo = busNo;
        this.empBoards = empBoards;
    }

    public void displayEmployeeDetails(){
        super.displayEmployeeDetails();
        System.out.println("Bus No:" + busNo);
        System.out.println("emp boards:" + empBoards);
    }
 
    public static void main(String[] args) {
        FactoryEmployee factoryEmployee = new FactoryEmployee("John Doe", 101, "Manufacturing", 5, true);
        factoryEmployee.displayEmployeeDetails();
    }
}