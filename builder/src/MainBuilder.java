public class MainBuilder {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder.name("Satya").age(25).weight(50).build();
        System.out.println(person.toString());
    }
}
