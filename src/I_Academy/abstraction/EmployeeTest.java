package I_Academy.abstraction;

public class EmployeeTest {

    public static void main(String[] args) {

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Oyin", "Alasho", "1234", 150.0, 0.2, 300.0);
        System.out.println(basePlusCommissionEmployee.toString());
        System.out.println(basePlusCommissionEmployee.earnings());


        CommissionEmployee commissionEmployee = new CommissionEmployee("Oyin", "Folashade", "4321", 150.0, 0.2);
        System.out.println(commissionEmployee.toString());
        System.out.println(commissionEmployee.earnings());

        SalariedEmployee salariedEmployee = new SalariedEmployee("Fola", "Esan", "3421", 400);
        System.out.println(salariedEmployee.toString());
        System.out.println(salariedEmployee.earnings());

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Alash", "Baba", "1342", 150, 50);
        System.out.println(hourlyEmployee);
        System.out.println(hourlyEmployee.earnings());




    }
}
