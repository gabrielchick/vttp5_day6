package Day06;

import java.util.Date;

public class Person {
    private Long id;

    private String firstName;

    private String lastName;

    private Double salary;

    private Date dob;

    public Person(long l, String string, String string2, double d, Date currentDate) {
        //TODO Auto-generated constructor stub
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString(){
        return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
        + ", dob=" + dob + "]";
    }
    
}
