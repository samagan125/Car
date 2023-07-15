public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void learn() {
        System.out.println("Person is learning");

    }

    public void walk() {
        System.out.println("Person is walk");
    }

    public void eat() {
        System.out.println("Person is eat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation1) {
        this.designation = designation1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name + '\'' +
                " kesip=" + designation +
                '}';
    }
}
