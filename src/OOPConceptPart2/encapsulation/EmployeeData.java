package OOPConceptPart2.encapsulation;

public class EmployeeData {

    private int ssn;
    private String empName;
    private int empAge;

    public static void main(String[] args) {

        EmployeeData emp = new EmployeeData();
        emp.setEmpName("tom peter");
        emp.setEmpAge(29);
        emp.setSsn(3245098);

        System.out.println("the employee name is :"+ emp.getEmpName());
        System.out.println("the employee age is :"+ emp.getEmpAge());
        System.out.println("the employee ssn is :"+emp.getSsn());


    }

// We need to create getter and setter to set and get the values of the fields
    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }



}
