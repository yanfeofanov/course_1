package Course_1;

import java.util.*;

public class EmpService {

    private final Map<String, Employee> employeeMap = new HashMap<>();




    public void addEmployee(Employee employee) {  // Метод добавления сотрудника в массив
        employeeMap.put(employee.getFullName(), employee);
    }

    public void removeEmployee(String name) {
        employeeMap.remove(name);
    }

    public void totalAmount() {
        int sum = 0;
        for (Employee value : employeeMap.values()) {
            sum = (int) (value.getSalary() + sum);
        }
        System.out.println(sum);
    }

    public void averageAmount(){
     
    }
    public void maxSalary() {
        int max = 0;
        String name = " ";
        for (Employee value : employeeMap.values()) {
            if (value.getSalary() > max) {
                max = (int) value.getSalary();
                name = value.getFullName();
            }
        }
        System.out.println("Самая высокая зп у " + name + " составляет : " + max);
    }

    public void minSalary() {
        int min = employeeMap.values().hashCode();
        String name = " ";
        for (Employee value : employeeMap.values()) {
            if (value.getSalary() < min) {
                min = (int) value.getSalary();
                name = value.getFullName();
            }
        }
        System.out.println("Самая низкая зп у " + name + " составляет : " + min);
    }

    public void searchOnlyEmployees(String name){
        employeeMap.get(name);
    }




//    public void printOnlyEmployees() {                                   // Вывод только ФИО сотрудников
//        for (int i = 0; i < size; i++) {
//            System.out.println(employees[i].getFullName());
//
//        }
//    }
//    public float averageAmount(){                                   // Метод средней суммы зп
//        return totalAmount()/size;
//    }
//
    public void printAllEmployees() {                                  // Вывод всех параметров массива ID ФИО Отдел зарплата
        for (Employee value : employeeMap.values()) {
            System.out.println(value);
        }
    }


//        System.out.println();
//        System.out.println("Всего в компании работает : "+size+" сотрудника");
//        System.out.println();
//        System.out.printf("Общая сумма трат на зарплату сотрудников составила: %.2f рублей,за один месяц",totalAmount());
//        System.out.println();
//        System.out.println("Сотрудник "+minSalary()+" имеет самую низкую зарплату в компании");
//        System.out.println("Сотрудник "+maxSalary()+" имеет самую высокую зарплату в компании");
//        System.out.printf("Среднее значение зарплат за месяц составило: %.2f рублей",averageAmount());
//        System.out.println();
//        System.out.println();
//    }

}
