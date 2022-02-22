package Employee;

import static org.junit.Assert.*;

public class EmployeeTest {

    @org.junit.Test
    public void getInfo() {
        Employee employee =new Employee();
        employee.getInfo(5,10);
        assertNotNull("Not Null",employee.getSalary());
    }

    @org.junit.Test
    public void computeBaseSalary() {
        Employee employee =new Employee();
        employee.getInfo(7,12);
        employee.computeBaseSalary();

        assertEquals(1680,employee.getSalary());
        employee.getInfo(5,10);
        employee.computeBaseSalary();

        assertEquals(1000,employee.getSalary());
        employee.getInfo(4,5);
        employee.computeBaseSalary();
        assertEquals(400,employee.getSalary());
    }

    @org.junit.Test
    public void addSal() {
        Employee employee =new Employee();
        employee.getInfo(7,12);
        employee.computeBaseSalary();
        employee.addSal();
        assertEquals(1680,employee.getSalary());
    }

    @org.junit.Test
    public void addWork() {
        Employee employee =new Employee();
        employee.getInfo(7,12);
        employee.computeBaseSalary();
        employee.addSal();
        employee.addWork();
        assertEquals(1780,employee.getSalary());
    }

    @org.junit.Test
    public void getSalary() {
        Employee employee =new Employee();
        employee.getInfo(5,10);
        employee.computeBaseSalary();
        employee.addSal();
        employee.addWork();
        assertEquals(1000,employee.getSalary());

        employee.getInfo(7,12);
        employee.computeBaseSalary();
        employee.addSal();
        employee.addWork();
        assertEquals(1780,employee.getSalary());

        employee.getInfo(4,5);
        employee.computeBaseSalary();
        employee.addSal();
        employee.addWork();
        assertEquals(410,employee.getSalary());
    }
}