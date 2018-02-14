package Lesson6_in_Home;

public  class Employee implements CalculatePay {

     String employeeid;


    @Override
    public int calculatePay() {
        return 0;
    }

     int solary;
     String name;




    @Override
    public String toString() {
        return "Employee{" +
                "employeeid='" + employeeid + '\'' +
                ", solary=" + solary +
                ", name='" + name + '\'' +
                '}';
    }

    static public void arrangeEmployee(Employee[] emp_arr) {
        for (Employee e:emp_arr) {
            System.out.println(e.toString());
        }


    }

    static public void teamUp(Employee[] team) {
        for (int i = 0; i < team.length - 1; i++) {
            for (int j = i + 1; j < team.length; j++) {
                if (team[i].solary > team[j].solary) {
                    Employee tmp = team[i];
                    team[i] = team[j];
                    team[j] = tmp;
                }
            }
        }
    }
}
