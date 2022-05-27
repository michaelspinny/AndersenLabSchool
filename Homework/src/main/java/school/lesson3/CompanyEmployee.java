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

    public void getInfo() {
        System.out.println(employeeFullName + " working as " + employeePosition + " and receives " + employeeSalary + " at the age of " + employeeAge + ".");
        System.out.println(employeeFullName + " contact phone number is " + employeePhoneNumber + " and email address is " + employeeEmailAddress + ".\n");
    }

    public String getEmployeeFullName() {
        return employeeFullName;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public String getEmployeeEmailAddress() {
        return employeeEmailAddress;
    }

    public String getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

}
