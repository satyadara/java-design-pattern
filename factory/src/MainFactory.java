import employee.Employee;

public class MainFactory {
    public static void main(String[] args) {
        EmployeeFactory factory = new EmployeeFactory();

        Employee emp1 = factory.createEmployee(EmployeePosition.TECHNOLOGY);
        Employee emp2 = factory.createEmployee(EmployeePosition.FINANCE);
        Employee emp3 = factory.createEmployee(EmployeePosition.HUMAN_RESOURCE);

        System.out.println("EMP 01 : " + emp1.position());
        System.out.println("EMP 02 : " + emp2.position());
        System.out.println("EMP 03 : " + emp3.position());
    }
}
