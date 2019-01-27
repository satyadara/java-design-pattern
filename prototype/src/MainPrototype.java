public class MainPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Company company = new Company();
        company.loadData();

        Company compA = (Company) company.clone();
        compA.getEmployees().add("Runa");

        System.out.println(company.getEmployees());
        System.out.println(compA.getEmployees());
    }
}
