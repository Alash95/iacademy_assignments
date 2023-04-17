package I_Academy.abstraction;

public class CommissionEmployee extends Employee{

    private double grossSales;
    private double commissionRate;


    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        if (grossSales < 0) {
            throw new IllegalArgumentException("Gross sales cannot be negative");
        }
        this.grossSales = grossSales;
        if (commissionRate < 0) {
            throw new IllegalArgumentException("Commission rate cannot be negative");
        }
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0) {
            throw new IllegalArgumentException("Gross sales cannot be negative");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate < 0) {
            throw new IllegalArgumentException("Commission rate cannot be negative");
        }
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" + super.toString() +
                "grossSales=" + getGrossSales() +
                ", commissionRate=" + getCommissionRate() +
                '}';
    }

//    @Override
//    public double earnings() {
//        return getCommissionRate() * getGrossSales();
//    }


    @Override
    public double getPaymentAmount() {
        return getCommissionRate() * getGrossSales();
    }
}
