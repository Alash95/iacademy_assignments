package I_Academy.advancedOOP;

public class EmployeeTest {

    public static void main(String[] args) {
        Date birthDate = new Date(2, 5, 2023);
        Date hireDate = new Date(2, 5, 1983);
        hireDate.setDay(2);
        hireDate.setMonth(5);
        hireDate.setYear(1983);
        Date weddingDate = new Date(3,5,2016);
        Employee sarah = new Employee("Oyinlola", "Alasoluyi", "1234567890", Gender.MALE, birthDate, hireDate, weddingDate);
        sarah.displayEmployeeInfo();
    }
}
