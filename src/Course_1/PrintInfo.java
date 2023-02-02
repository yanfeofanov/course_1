package Course_1;

public class PrintInfo {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setDepartment(2);
        employee1.setSalary(180653);
        Employee employee2 = new Employee();
        employee2.setDepartment(1);
        employee2.setSalary(150680);
        Employee employee3 = new Employee();
        employee3.setDepartment(5);
        employee3.setSalary(30808);
        Employee employee4 = new Employee();
        employee4.setDepartment(3);
        employee4.setSalary(49092);
        Employee employee5 = new Employee();
        employee5.setDepartment(4);
        employee5.setSalary(12399);
        Employee employee6 = new Employee();
        employee6.setDepartment(1);
        employee6.setSalary(34999);
        Employee employee7 = new Employee();
        employee7.setDepartment(2);
        employee7.setSalary(68599);
        Employee employee8 = new Employee();
        employee8.setDepartment(3);
        employee8.setSalary(84988);
        Employee employee9 = new Employee();
        employee9.setDepartment(4);
        employee9.setSalary(23999);
        Employee employee10 = new Employee();
        employee10.setDepartment(5);
        employee10.setSalary(95499);


        EmpService employees = new EmpService();
        employees.addEmployee("Феофанов Ян Олегович", employee1.getDepartment(), employee1.getSalary());
        employees.addEmployee("Самаров Алексей Вячеславович",employee2.getDepartment(),employee2.getSalary());
        employees.addEmployee("Кабанов Елисей Донатович",employee3.getDepartment(),employee3.getSalary());
        employees.addEmployee("Давыдов Адам Альвианович",employee4.getDepartment(),employee4.getSalary());
        employees.addEmployee("Шарипов Роберт Степанович",employee5.getDepartment(),employee5.getSalary());
        employees.addEmployee("Беляков Артем Юлианович",employee6.getDepartment(),employee6.getSalary());
        employees.addEmployee("Голубев Кирилл Гордеевич",employee7.getDepartment(),employee7.getSalary());
        employees.addEmployee("Белов Архип Филиппович",employee8.getDepartment(),employee8.getSalary());
        employees.addEmployee("Горбунов Клим Христосович",employee9.getDepartment(),employee9.getSalary());
        employees.addEmployee("Филатов Осип Эльдарович",employee10.getDepartment(),employee10.getSalary());


        employees.printAllEmployees();
        employees.printOnlyEmployees();


    }
}
