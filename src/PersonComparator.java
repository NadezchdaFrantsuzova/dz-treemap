import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    protected int wordCount;

    public PersonComparator(int wordCount) {
        this.wordCount = wordCount;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int surnameFirstPerson = o1.getSurname().split("-").length;
        int surnameSecondPerson = o2.getSurname().split("-").length;

        if (surnameFirstPerson >= wordCount && surnameSecondPerson >= wordCount) {
            return Integer.compare(o2.getAge(), o1.getAge());
        } else
            return surnameFirstPerson < surnameSecondPerson ? 10 : -10;
    }
}
