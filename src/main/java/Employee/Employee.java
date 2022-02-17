package Employee;

public class Employee {
    private int salary;
    private int Work_hours_per_day;
    private boolean basicCalculated;


    public void getInfo(int work_hours_per_day, int salary) {
        this.salary = salary;
        this.Work_hours_per_day = work_hours_per_day;
    }
    //Compute the base salary
    public double computeBaseSalary(){
        if(this.salary<0){
            throw new RuntimeException("Enter Valid Value");
        }
        int salary_of_twenty_days = this.Work_hours_per_day*20;
        int total_salary = salary_of_twenty_days*this.salary;
        this.salary = total_salary;
        basicCalculated=true;
        return this.salary;
    }
    //Add $10 if salary is less than 500
    public double addSal(){
        if(this.salary<0) {
            throw new RuntimeException("Enter Valid Value");
        }
        if(this.salary<500){
            this.salary+=10;
        }
        return this.salary;
    }

    //Add $5 daily if work hour per day greater than 6
    public double addWork(){
        if(Work_hours_per_day<0){
            throw new RuntimeException("Enter Valid Value");
        }
        if(Work_hours_per_day >6){
            this.salary+=5*20;
        }
        return this.salary;
    }

    //Get the Salary
    public int getSalary() {
        return salary;
    }
}
