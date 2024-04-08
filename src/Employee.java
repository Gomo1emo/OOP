public class Employee {

    int empNo;

    String name;

    String surname;

    double salary;


    Employee(int empNumber, String Firstname, String lastName, double salary){
        this.empNo = empNumber;
        this.name = Firstname;
        this.surname = lastName;
        this.salary = salary;
    }

    Employee() {}

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
