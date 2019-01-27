public class PersonBuilder {
    private String name;
    private int age;
    private float weight;

    public PersonBuilder() {
    }

    private PersonBuilder(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder weight(float weight) {
        this.weight = weight;
        return this;
    }

    public Person build() {
        return new Person(name, age, weight);
    }
}
