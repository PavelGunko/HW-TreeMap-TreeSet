import java.util.Comparator;


public class Person implements Comparator<Person> {

    private String name;
    private String surname;
    private int age;

    // создайте конструктор на все поля
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }
    // создайте геттеры и сеттеры

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getSurname() {
        return surname;

    }

    public void setSurname(String surname) {
        this.surname = surname;

    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.age = age;


    }

    //@Override
    // public int compare(Person a, Person b) {
    // if (a.length() > b.length()) {
    //     return -1;
    //} else if (a.length() < b.length()) {
    //    return 1;
    // }
    //  return a.compareTo(b);
    // }
    //if (o1.setSurname > o2.getSurname()) {
    // } else if (o1.setSurname() < o2.getSurname()){
    //   return 1;
    // }
    //return o1.compareTo(o2);

    //return o1.getSurname().compareTo(o2.getSurname();

    // if (o1.getSurname() < o2.setSurname());
    // return 1;
    //else if (s0.length() > s1.length())
    //    return -1;
    //return 0;

    @Override

    public int compare(Person o1, Person o2) {
        if(o2.getAge() > o1.getAge()) {
            return -1;
        }
        else if(o1.getAge()==o2.getAge()){
            return 1;
        }

        return 0;
    }

    // создайте toString
    @Override
    public String toString() {
        return (name + " " + surname + " " + age);


    }

}
