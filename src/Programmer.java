public class Programmer extends Person {
    private String companiName;

    public Programmer(String name, String designation, String companiName) {
        super(name, designation);
        this.companiName = companiName;
    }

    public void learn() {
        System.out.println("Programmer is learning");
    }

    public void walk() {
        System.out.println("Programmer is walking");
    }

    public void eat() {
        System.out.println("Programmer is eating");
    }

    public void coding() {
        System.out.println("Programmer is coding");

    }

    public String getCompaniName() {
        return companiName;
    }

    public void setCompaniName(String companiName) {
        this.companiName = companiName;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "companiName='" + companiName + '\'' +
                "Name='" + getName() + '\'' +
                "designation=" + getDesignation() + '\'' +
                "CompaniNave=" + getCompaniName() + '\'' +
                '}';
    }
    }








