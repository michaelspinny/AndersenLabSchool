package school.lesson3;

public class CompanyEmployee {

    private String employeeFullName;
    private String employeePosition;
    private String employeeEmailAddress;
    private String employeePhoneNumber;
    private int employeeSalary;
    private int employeeAge;

    public CompanyEmployee(String employeeFullName, String employeePosition, String employeeEmailAddress,
                           String employeePhoneNumber, int employeeSalary, int employeeAge) {
        this.employeeFullName = employeeFullName;
        this.employeePosition = employeePosition;
        this.employeeEmailAddress = employeeEmailAddress;
        this.employeePhoneNumber = employeePhoneNumber;
        this.employeeSalary = employeeSalary;
        this.employeeAge = employeeAge;
    }

    public static void main(String[] args) {
        System.out.println();
    }

}
