import employee.Employee;
import employee.FinanceEmployee;
import employee.HumanResEmployee;
import employee.TechnologyEmployee;

public class EmployeeFactory {
    public EmployeeFactory(){}
    public Employee createEmployee(EmployeePosition position) {
        return position.equals(EmployeePosition.TECHNOLOGY) ? new TechnologyEmployee() :
                position.equals(EmployeePosition.FINANCE) ? new FinanceEmployee() :
                        position.equals(EmployeePosition.HUMAN_RESOURCE) ? new HumanResEmployee() : null;
    }
}
