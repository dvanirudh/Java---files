// 16. Create a subclass called FactoryEmployee, for all factory employees we need to store bus_no,
//  emp_boards.Create a super class related to this subclass.



public class Employee {
    private int id;
    private String name;
    private String departmant;

    public Employee(int id, String name, String department ){
        this.departmant = department;
        this.name = name;
        this.id = id; 
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id= id;
    }

    public String getDepartment()
      {
        return departmant;
      }    

      public void setDepartment(String department) {
        this.departmant = department;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + getDepartment());
    }

}

