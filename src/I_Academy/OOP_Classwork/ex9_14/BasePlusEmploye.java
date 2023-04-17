package I_Academy.OOP_Classwork.ex9_14;

public class BasePlusEmploye extends CommissionEmploye{
    private double baseSalary;

    public BasePlusEmploye(String firstName, String lastName, String bvn, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, bvn, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return super.toString() + "baseSalary=" + getBaseSalary() +
                "earnings=" + earnings();
    }
}
