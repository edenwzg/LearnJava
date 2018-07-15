package starter.chapter07.section01;

public class Person {
    protected String name;
    protected String id;

    Person(String name, String id){
        this.name = name;
        this.id = id;
    }
    @Override
    public boolean equals(Object obj) {
        Person p = (Person)obj;
        boolean b1 = this.name.equals(p.name);
        boolean b2 = this.id.equals(p.id);
        return b1 && b2;
    }
}
