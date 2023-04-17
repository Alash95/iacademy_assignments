package I_Academy.advancedOOP;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String bvn, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, bvn, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double earnings() {
        return baseSalary + (super.earnings());
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", bvn='" + super.getBvn() + '\'' +
                ", grossSales=" + super.getGrossSales() +
                ", commissionRate=" + super.getCommissionRate() +
                ", baseSalary=" + getBaseSalary() +
                ", earnings=" + earnings() +
                '}';
    }
}
