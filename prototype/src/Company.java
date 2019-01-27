import java.util.ArrayList;
import java.util.List;

public class Company implements Cloneable{
    private List<String> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public Company(List<String> employees) {
        this.employees = employees;
    }

    public List<String> getEmployees() {
        return employees;
    }

    public void loadData() {
        employees.add("Satya");
        employees.add("Jack");
        employees.add("Marina");
        employees.add("Gracia");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> result = new ArrayList<>(employees);
        return new Company(result);
    }
}
