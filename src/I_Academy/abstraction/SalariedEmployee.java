package I_Academy.abstraction;

public class SalariedEmployee extends Employee{

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        if (weeklySalary < 0) {
            throw new IllegalArgumentException("Weekly salary cannot be negative");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + super.toString() +
                "weeklySalary=" + getWeeklySalary() +
                '}';
    }

    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }

//    @Override
//    public double earnings() {
//        return getWeeklySalary();
//    }
}
