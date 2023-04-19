package I_Academy.abstraction;

public class EmployeeTest {

    public static void main(String[] args) {

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Oyin", "Alasho", "1234", 150.0, 0.2, 300.0);
        System.out.println(basePlusCommissionEmployee.toString());
        System.out.println(basePlusCommissionEmployee.getPaymentAmount());


        CommissionEmployee commissionEmployee = new CommissionEmployee("Oyin", "Folashade", "4321", 150.0, 0.2);
        System.out.println(commissionEmployee.toString());
        System.out.println(commissionEmployee.getPaymentAmount());

        SalariedEmployee salariedEmployee = new SalariedEmployee("Fola", "Esan", "3421", 400);
        System.out.println(salariedEmployee.toString());
        System.out.println(salariedEmployee.getPaymentAmount());

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Alash", "Baba", "1342", 150, 50);
        System.out.println(hourlyEmployee.toString());
        System.out.println(hourlyEmployee.getPaymentAmount());




    }
}
