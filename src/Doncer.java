public class Doncer extends Person {

    private String groupName;

    public Doncer(String name, String designation, String groupName) {
        super(name,designation);
        this.groupName = groupName;
    }

    public void learn() {
        System.out.println("Doncer is learning");
    }

    public void walk() {
        System.out.println("Doncer is walking");
    }

    public void eat() {
        System.out.println("Doncer is eating");
    }

    public void dancing() {
        System.out.println("dancing is a dance");
    }


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                "Name='" + getName() + '\'' +
                "designation='" + getDesignation() + '\'' +
                "groupName1='" + getGroupName() + '\'' +
                '}';
    }
}
