package I_Academy.OOP_Classwork.ex9_3;

public class Commission {

    private double grossSales;
    private double commissionRate;
    private double baseSalary;



    public Commission(double grossSales, double commissionRate, double baseSalary) {

        this.grossSales = validateGrossSales(grossSales);
        this.commissionRate = validateCommissionRate(commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    private double validateGrossSales(double sales) {
        if (sales < 0) {
            sales = 0;
            System.out.println(ErrorMesage.grossSalesError);
        }
        return sales;
    }

    private double validateCommissionRate(double rate){
        if (rate < 0 || rate > 1){
            rate = 0;
            System.out.println(ErrorMesage.commissionRateError);
        }
        return rate;
    }

    @Override
    public String toString() {
        return "Commission{" +
                "grossSales=" + getGrossSales() +
                ", commissionRate=" + getCommissionRate() +
                ", baseSalary=" + getBaseSalary() +
                '}';
    }
}
