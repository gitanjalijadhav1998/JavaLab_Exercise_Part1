package Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        //for(int i=0;i<3;i++) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of employee : ");
        int num = sc.nextInt();
        int i=1;
        while(i <= num) {

            //Take Input From User

            System.out.println("Enter Name of employee = ");
            String Name = sc.next();

            System.out.println("Enter Work Hours Per Day = ");
            int workhours = sc.nextInt();
            System.out.println("Enter Hourly Salary = ");
            int salary = sc.nextInt();

            //Create object
            Employee employee = new Employee();
            if (workhours < 0 || salary < 0) {
                System.out.println("Please Enter Valid value");
            } else {
                employee.getInfo(workhours, salary);
                System.out.println("Name of Employee = " + Name);
                System.out.println("Basic Salary = " + employee.computeBaseSalary());
                System.out.println("After Adding $10 to salary if its less than 500 = " + employee.addSal());
                System.out.println("After Adding $5 to salary if work hours greater than 6 = " + employee.addWork());
                System.out.println("Final Salary = " + employee.getSalary());
            }
            i++;
        }
    }
}
