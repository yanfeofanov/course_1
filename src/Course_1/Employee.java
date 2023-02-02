package Course_1;

public class Employee {
    private String fullName;

    private int department;
    private float salary;
    private int id;

    static int counter = 0 ;

    public Employee(){

    }
    public Employee(String fullName,int department,float salary){
        this.department = department;
        this.salary = salary;
        this.fullName = fullName;
        id = counter+1;
        counter++;

    }
    public String getFullName(){
        return this.fullName;

    }

    public int getDepartment(){
        return this.department;
    }
    public float getSalary(){
        return this.salary;
    }

    public int getId(){


        return this.id;
    }

    public void setDepartment(int department) {
        if (department < 1 || department > 5) {
            System.out.println("Такого отдела в компании нет!всего отделов 5!");
        } else {
            this.department = department;
        }
    }

    public void setSalary(float salary) {
        if (salary < 0) {
            System.out.println("Зарплата не может быть отрицательным числом! ");
        } else {
            this.salary = salary;
        }
    }
@Override
 public String toString(){
        return  "ID : "+getId()+" ФИО : "+getFullName()+"     Отдел :  "+getDepartment()+"    Зарплата : "+getSalary()+" рублей";
 }

}
