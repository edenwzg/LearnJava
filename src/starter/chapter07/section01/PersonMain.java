package starter.chapter07.section01;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Eden", "5033");
        Person p2 = new Person("Emma", "0793");
        Person p3 = new Person("Eden", "5033");

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p1.equals(p3));
    }
}
