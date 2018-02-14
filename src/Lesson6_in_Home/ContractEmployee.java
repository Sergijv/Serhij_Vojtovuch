package Lesson6_in_Home;

public class ContractEmployee extends Employee {

    public String getfederalTaxIdmember(){
        return employeeid;
    }
    public void setfederalTaxIdmember(String federalTaxIdmember){
        employeeid=federalTaxIdmember;
    }

    private int hourlyRate;
    private int nomberHourMonth;


    @Override
    public int calculatePay() {
        return hourlyRate*nomberHourMonth;
    }


    ContractEmployee(String federalTaxIdmember, int hourlyRate, int nomberHourMonth, String name) {
        this.hourlyRate = hourlyRate;
        this.nomberHourMonth = nomberHourMonth;
        super.name=name;
        super.solary=hourlyRate*nomberHourMonth;
        super.employeeid=federalTaxIdmember;

    }

}
