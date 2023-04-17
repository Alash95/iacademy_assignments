package I_Academy.OOP_Classwork.ex9_3;

public class Employeee {

    private String firstName;
    private String lastName;
    private String bvn;
    private Commission employee;

    public Employeee(String firstName, String lastName, String bvn, Commission employee ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bvn = bvn;
        this.employee = employee;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBvn() {
        return bvn;
    }

    public void setBvn(String bvn) {
        this.bvn = bvn;
    }

//    public Commission getGrossSales() {
//        return grossSales;
//    }
//
//    public void setGrossSales(Commission grossSales) {
//        this.grossSales = grossSales;
//    }
//
//    public Commission getCommissionRate() {
//        return commissionRate;
//    }
//
//    public void setCommissionRate(Commission commissionRate) {
//        this.commissionRate = commissionRate;
//    }
//
//    public Commission getBaseSalary() {
//        return baseSalary;
//    }
//
//    public void setBaseSalary(Commission baseSalary) {
//        this.baseSalary = baseSalary;
//    }

    public double earnings(){
        double earning = employee.getBaseSalary() + employee.getGrossSales() * employee.getCommissionRate();
        return earning;
    }

    public void displayInfo() {
        System.out.printf("""
                firstName: %s\nLastName: %s\nbvn: %s\ngrossSales: %.2f\ncommissionRate: %.2f\nBaseSalary: %.2f\nearnings: %.2f

                """, getFirstName(), getLastName(), getBvn(), employee.getGrossSales(), employee.getCommissionRate(), employee.getBaseSalary(), earnings());
    }

//    public void displayInfo() {
//        System.out.printf("""
//                firstName: %s\nLastName: %s\nbvn: %s\ndetails %d\nearnings: %d
//
//                """, getFirstName(), getLastName(), getBvn(), employee.toString(), earnings());
//    }
}
