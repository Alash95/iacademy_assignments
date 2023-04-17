package I_Academy.advancedOOP;

public class CommissionEmployee {

    private String firstName;
    private String lastName;
    private String bvn;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String bvn, double grossSales, double commissionRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bvn = bvn;
        validateGrossSales(grossSales);
        this.grossSales = grossSales;
        validateCommissionRate(commissionRate);
        this.commissionRate = commissionRate;
    }

    private void validateGrossSales(double sales) {
        if (sales < 0) {
            throw new IllegalArgumentException("Sales has to be 0 or more");
        }
    }

    private void validateCommissionRate(double rate) {
        if (rate < 0 || rate > 1) {
            throw new IllegalArgumentException("Your commission rate has to be between 0 and 1");
        }
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

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        validateGrossSales(grossSales);
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        validateCommissionRate(commissionRate   );
        this.commissionRate = commissionRate;
    }

    public double earnings() {
        return getGrossSales() * getCommissionRate();
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", bvn='" + getBvn() + '\'' +
                ", grossSales=" + getGrossSales() +
                ", commissionRate=" + getCommissionRate() +
                ", earnings=" + earnings() +
                '}';
    }
}
