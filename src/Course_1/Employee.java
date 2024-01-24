package Course_1;

import java.util.Objects;

public class Employee {
    private String fullName;

    private int department;
    private int salary;
    private int id;

    static int counter = 0;


    public Employee(){

    }

    public Employee(String fullName, int department, int salary) {
        this.department = department;
        this.salary = salary;
        this.fullName = fullName;
        id = counter++;

    }

    public String getFullName() {
        return this.fullName;

    }

    public int getDepartment() {
        return this.department;
    }

    public float getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        if (department < 1 || department > 5) {
            System.out.println("Такого отдела в компании нет!всего отделов 5!");
        } else {
            this.department = department;
        }
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            System.out.println("Зарплата не может быть отрицательным числом! ");
        } else {
            this.salary = salary;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }

    @Override
    public String toString() {
        return "ID : " + getId() + " ФИО : " + getFullName() + " Отдел : " + " " + getDepartment() + " Зарплата : " + getSalary() + " рублей";
    }

}
