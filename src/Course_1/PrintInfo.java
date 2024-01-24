package Course_1;

import java.util.HashMap;
import java.util.Map;

public class PrintInfo {
    public static void main(String[] args) {

        EmpService empService = new EmpService();
        empService.addEmployee(new Employee("Феофанов Ян Олегович", 1, 233));
        empService.addEmployee(new Employee("Самаров Алексей Вячеславович", 2, 34));
        empService.addEmployee(new Employee("Еремеев Алексей Сергеевич", 3, 42));

        empService.totalAmount();
        empService.removeEmployee("Самаров Алексей Вячеславович");
        empService.printAllEmployees();
        empService.maxSalary();
        empService.minSalary();
        empService.searchOnlyEmployees("Феофанов Ян Олегович");
    }


}
