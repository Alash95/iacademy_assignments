package I_Academy.OOP_Classwork.ex9_3;

public class EmployeTest {
    public static void main(String[] args) {
        Commission commissionDetails = new Commission(30.0, 0.5, 30000);

        Employeee employee = new Employeee("Oyinlola", "Alasho", "1234", commissionDetails);

        employee.displayInfo();
    }
}
