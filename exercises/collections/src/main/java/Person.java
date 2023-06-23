import java.util.Objects;

public class Person implements Comparable {
    private String name;
    private int age;

    private int height;

    public int getHeight() {
        return height;
    }

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Object other) {
        if (!(other instanceof Person))
            throw new IllegalArgumentException("Wrong type");
        Person otherPerson = (Person) other;
        return this.height - otherPerson.height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && height == person.height && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }
}
