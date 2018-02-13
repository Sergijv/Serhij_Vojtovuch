package Lesson6_in_Home;

public  class Employee {

  protected String employeeid;


     int CalculatePay(){return 0;};

    protected int solary;

    public int getSolary() {
        return solary;
    }

    public void setSolary(int solary) {
        this.solary = solary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeid='" + employeeid + '\'' +
                ", solary=" + solary +
                '}';
    }
}
