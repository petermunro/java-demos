import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Yulia", 26, 10));
        people.add(new Person("Raphael", 20, 20));
        people.add(new Person("Ray", 30, 12));
        people.add(new Person("Mark", 27, 15));
        people.add(new Person("Mark", 27, 14));

        System.out.println("Hashcodes:");
        System.out.println("Hashcode for Yulia:" + people.get(0).hashCode());
        System.out.println("Hashcode for Raphael:" + people.get(1).hashCode());
        System.out.println("Hashcode for Ray:" + people.get(2).hashCode());
        System.out.println("Hashcode for Mark: " + people.get(3).hashCode());
        System.out.println("Hashcode for Mark2:" + people.get(4).hashCode());


        System.out.println("\n\nNatural ordering:");
        Collections.sort(people);

        for (Person p : people)
            System.out.println(p);

        System.out.println("\nBy Age:");
        Collections.sort(people, new AgeComparator());
        for (Person p : people)
            System.out.println(p);

        System.out.println("\nBy Name:");
        Collections.sort(people, new NameComparator());
        for (Person p : people)
            System.out.println(p);


    }
}

