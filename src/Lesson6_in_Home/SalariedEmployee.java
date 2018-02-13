package Lesson6_in_Home;

public class SalariedEmployee extends Employee{

    public String getSocialSecurityNumber() {
    return employeeid;
    }
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        employeeid = socialSecurityNumber;
    }
    @Override
    int CalculatePay() {
        return solary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "employeeid='" + employeeid + '\'' +
                ", solary=" + solary +
                '}';
    }
}
