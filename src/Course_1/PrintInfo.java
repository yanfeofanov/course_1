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



        EmpService employees = new EmpService();
        employees.addEmployee("Феофанов Ян Олегович", employee1.getDepartment(), employee1.getSalary());
        employees.addEmployee("Самаров Алексей Вячеславович",employee2.getDepartment(),employee2.getSalary());
        employees.addEmployee("Кабанов Елисей Донатович",employee3.getDepartment(),employee3.getSalary());
        employees.addEmployee("Давыдов Адам Альвианович",employee4.getDepartment(),employee4.getSalary());
        employees.addEmployee("Шарипов Роберт Степанович",employee5.getDepartment(),employee5.getSalary());
        employees.addEmployee("Беляков Артем Юлианович",1,35060);
        employees.addEmployee("Голубев Кирилл Гордеевич",2,15615);
        employees.addEmployee("Белов Архип Филиппович",3,65488);
        employees.addEmployee("Горбунов Клим Христосович",4,70568);
        employees.addEmployee("Филатов Осип Эльдарович",5,78745);


        employees.printAllEmployees();
        employees.printOnlyEmployees();


    }
}
