import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Лидия", "Бех-Иванова", 45));
        people.add(new Person("Эльдар", "Ахадов-ибн-Хабибов", 55));
        people.add(new Person("Ольга", "Захарьева-Юрьева-Мамонтова-Иволгина", 70));
        people.add(new Person("Алексей", "Петренко-Колотов-Румпель-Штицкин", 48));
        people.add((new Person("Ольга", "Иванова", 60)));

        Comparator<Person> comparatorPerson = (o1, o2) -> {
            int surnameFirstPerson = o1.getSurname().split("-").length;
            int surnameSecondPerson = o2.getSurname().split("-").length;
            int compareAge = Integer.compare(o2.getAge(), o1.getAge());

            if (surnameFirstPerson >= 3 && surnameSecondPerson >= 3) {
                return compareAge;
            } else if (surnameFirstPerson == surnameSecondPerson) {
                return compareAge;
            }
            return surnameFirstPerson < surnameSecondPerson ? 10 : -10;
        };

        people.sort(comparatorPerson);
        System.out.println(people);
    }
}