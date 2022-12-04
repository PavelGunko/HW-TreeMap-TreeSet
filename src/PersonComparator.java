import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int len1 = o1.getSurname().length();
        int len2 = o2.getSurname().length();

        if (len1 > len2) {
            return -1;
        } else if (len1 < len2) {
            return 1;
        } else {
            return Integer.compare(o2.getAge(), o1.getAge());
        }
    }
}

