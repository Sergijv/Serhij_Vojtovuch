package Lesson6_in_Home;

public class ContractEmployee extends Employee {
    public String getfederalTaxIdmember(){
        return employeeid;
    }
    public void setfederalTaxIdmember(String federalTaxIdmember){
        employeeid=federalTaxIdmember;
    }

    int hourlyRate;
    int nomberHourMonth;
    int Solary=hourlyRate*nomberHourMonth;

    @Override
    int CalculatePay() {
        return hourlyRate*nomberHourMonth;
    }

    public ContractEmployee(int hourlyRate, int nomberHourMonth) {
        this.hourlyRate = hourlyRate;
        this.nomberHourMonth = nomberHourMonth;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "employeeid='" + employeeid + '\'' +
                ", solary=" + solary +
                '}';
    }
}
