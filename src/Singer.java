public class Singer extends Person {
    private String dangName;

    public Singer(String name, String designation, String dangName) {
        super(name, designation);
        this.dangName = dangName;
    }

    public void learn() {
        System.out.println("Singer is learning");
    }

    public void walk() {
        System.out.println("Singer is walking");
    }

    public void eat() {
        System.out.println("Singer is eating");
    }

    public void singing() {
        System.out.println("singer is singing");
    }

    public void plauGitar() {
        System.out.println("Singer is plauGitar");
    }

    public String getDangName() {
        return dangName;
    }

    public void setDangName(String dangName) {
        this.dangName = dangName;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "groupName='" + dangName + '\'' +
                "Name='" + getName() + '\'' +
                "designation='" + getDesignation() + '\'' +
                "dangName='" + getDangName() + '\'' +
                '}';
    }
}


