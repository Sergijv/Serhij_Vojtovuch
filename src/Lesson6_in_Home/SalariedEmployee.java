package Lesson6_in_Home;

public class SalariedEmployee extends Employee{


    public String getSocialSecurityNumber() {
    return employeeid;
    }
    private void setSocialSecurityNumber(String socialSecurityNumber) {
        employeeid = socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        return solary;
    }

     SalariedEmployee(String socialSecurityNumber, int solary,String name) {
        setSocialSecurityNumber(socialSecurityNumber);
        super.solary=solary;
        super.name=name;
    }
}
