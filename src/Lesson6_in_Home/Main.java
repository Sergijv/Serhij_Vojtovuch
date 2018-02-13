package Lesson6_in_Home;

public class Main {
    public static void main(String[] args) {
/*Create an interface to the method calculatePay(), the base class Employee with a string variable employeeld.
Create two classes SalariedEmployee and ContractEmployee, which implement interface and are inherited from the base class.
 Describe hourly paid workers in the relevant classes (one of the children), and fixed paid workers (second child).
 Describe the string variable socialSecurityNumber in the class SalariedEmployee .
 Include a description of federalTaxIdmember in the class of contractEmployee .
 The calculation formula for the "time-worker“ is: "the average monthly salary = hourly rate * number of hours worked"
For employees with a fixed payment the formula is: "the average monthly salary = fixed monthly payment“
Create an array of employees and add the employees with different form of payment.
Arrange the entire sequence of workers descending the average monthly wage. Output the employee ID, name,
 and the average monthly wage for all elements of the list.
*/
SalariedEmployee s1=new SalariedEmployee();
s1.setSocialSecurityNumber("ID1");
s1.setSolary(2000);

SalariedEmployee s2=new SalariedEmployee();
s2.setSocialSecurityNumber("ID2");
s2.setSolary(2000);

ContractEmployee c1=new ContractEmployee(23,45);
c1.setfederalTaxIdmember("ID3");

ContractEmployee c2=new ContractEmployee(40,27);
c2.setfederalTaxIdmember("ID4");

        Employee employees[]  = new Employee[4];
        employees[0]=c1;
        employees[0]=c1;
        employees[0]=s1;
        employees[0]=s2;
        for (Employee e:employees) {
            e.toString();
        }
    }

}