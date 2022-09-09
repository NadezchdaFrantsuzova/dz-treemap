import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Лидия", "Бех-Иванова", 45));
        people.add(new Person("Эльдар", "Ахадов-ибн-Хабибов", 55));
        people.add(new Person("Ольга", "Захарьева-Юрьева-Мамонтова-Иволгина", 70));
        people.add(new Person("Алексей", "Петренко-Колотов-Румпель-Штицкин", 48));
        people.add(new Person("Ольга", "Иванова", 60));
        people.add(new Person("Екатерина", "Сливко", 17));
        people.add(new Person("Ольга", "Брюзгина-Нечепоренко", 10));

        people.removeIf(person -> person.getAge() < 18);

        Collections.sort(people, new PersonComparator(3));
        System.out.println(people);
    }
}