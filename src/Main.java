import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Tolubai", "Asanov");
        System.out.println(person);
        Programmer programmer = new Programmer("Samagan :", "Pragramis :", "Google :");
        System.out.println(programmer);
        System.out.println(programmer.getCompaniName());
        programmer.coding();
        Doncer dancer = new Doncer("Samagan :", " a dit :", "top 15  :");
        System.out.println(dancer);
        System.out.println(dancer.getGroupName());
        dancer.dancing();
        Singer singer = new Singer("Samagan :", "muzk :", "gitara  :");
        System.out.println(singer);
        System.out.println(singer.getDangName());
        singer.singing();
        singer.plauGitar();



    }
}