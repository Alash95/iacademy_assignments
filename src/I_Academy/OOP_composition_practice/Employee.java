package I_Academy.OOP_composition_practice;

public class Employee {
    private String firstName;
    private String lastName;
    private String bvn;
    private Gender gender;
    private Date birthDate;
    private Date hireDate;
    private Date weddingDate;

    public Employee(String firstName, String lastName, String bvn, Gender gender, Date birthDate, Date hireDate, Date weddingDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bvn = bvn;
        this.gender = gender;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.weddingDate = weddingDate;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getWeddingDate() {
        return weddingDate;
    }

    public void setWeddingDate(Date weddingDate) {
        this.weddingDate = weddingDate;
    }

    private boolean validateBvn(String bvn) {
        System.out.println(ErrorMessages.bvnLengthError);
        return bvn.length() == 11;
    }

    public void displayEmployeeInfo() {
        System.out.printf("""
                firstName: %s\nlastName: %s\nbvn: %s\ngender: %s\nbirthDate: %s\nhireDate: %s\nweddingDate
                
                """, getFirstName(), getLastName(), getBvn(), getGender(), getBirthDate(), getHireDate(), getWeddingDate());
    }
}
