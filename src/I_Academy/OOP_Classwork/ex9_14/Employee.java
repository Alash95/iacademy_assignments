package I_Academy.OOP_Classwork.ex9_14;

public class Employee {
    private String firstName;
    private String lastName;
    private String bvn;

    public Employee(String firstName, String lastName, String bvn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bvn = bvn;
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

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", bvn='" + getBvn() + '\'' +
                '}';
    }
}
