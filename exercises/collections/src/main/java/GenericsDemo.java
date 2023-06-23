import java.util.Comparator;

public class GenericsDemo {
    public static void main(String[] args) {
        Person p = new Person("Ben", 27, 14);
        doSomething(p);

    }

    static public <T extends Comparator<Person>> void doSomething(T thing) {
        System.out.println(thing);
    }


}
