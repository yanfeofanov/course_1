package Course_1;

public class EmpService {

    private final Employee[] employees;
    private int size;




    public EmpService(){                                    // Приводим все к массиву данных
        this.employees = new Employee[10];
    }

    public void addEmployee(String employeeFullName, int employeeDepartment, float employeeSalary){  // Метод добавления сотрудника в массив
        if (employeeFullName.isEmpty()){
            System.out.println("ФИО не может быть пустым полем ");

        }
        else if(size >= employees.length ){
            System.out.println("Нельзя добавить сотрудника, закончилось место!");
        }
        else {
            Employee newEmployee = new Employee(employeeFullName,employeeDepartment,employeeSalary);
            employees[size++] = newEmployee;

        }
    }
    public float totalAmount() {                                // Метод общей суммы зарплаты
        int sum = 0;
        for (int i = 0; i < size; i++) {
          sum += employees[i].getSalary();
        }
        return sum;
    }

    public String maxSalary(){                              // Поиск сотрудника с высоким заработком
        float max = 0;
        String employeeMaxSalary = "";
        for (int i = 0; i < size; i++) {
                if(employees[i].getSalary()>max){
                    max=employees[i].getSalary();
                    employeeMaxSalary=employees[i].getFullName();

                }
        }
        return employeeMaxSalary;
    }
    public String minSalary(){                                        // Поиск сотрудника с низким заработком
        float min = employees[0].getSalary();
        String employeeMaxSalary = "";
        for (int i = 0; i < size; i++) {
            if(employees[i].getSalary()<min){
                min=employees[i].getSalary();
                employeeMaxSalary=employees[i].getFullName();

            }
        }
        return employeeMaxSalary;
    }
    public void printOnlyEmployees() {                                   // Вывод только ФИО сотрудников
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getFullName());

        }
    }
    public float averageAmount(){                                   // Метод средней суммы зп
        return totalAmount()/size;
    }

    public void printAllEmployees(){                                  // Вывод всех параметров массива ID ФИО Отдел зарплата
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee);

        }

        System.out.println();
        System.out.println("Всего в компании работает : "+size+" сотрудника");
        System.out.println();
        System.out.printf("Общая сумма трат на зарплату сотрудников составила: %.2f рублей,за один месяц",totalAmount());
        System.out.println();
        System.out.println("Сотрудник "+minSalary()+" имеет самую низкую зарплату в компании");
        System.out.println("Сотрудник "+maxSalary()+" имеет самую высокую зарплату в компании");
        System.out.printf("Среднее значение зарплат за месяц составило: %.2f рублей",averageAmount());
        System.out.println();
        System.out.println();
    }

}
