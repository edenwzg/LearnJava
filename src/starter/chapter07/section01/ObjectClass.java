package starter.chapter07.section01;

public class ObjectClass {
    @Override
    public String toString() {
        return "This is Object Class";
    }


    public static void main(String[] args) {
        Object[] obj = new Object[4];

        obj[0] = new Object();
        obj[1] = new String("Hello");
        obj[2] = Integer.valueOf(10);
        obj[3] = new ObjectClass();

        for (Object o : obj){
            System.out.println(o.getClass());
        }

        System.out.println();
        for (Object o : obj){
            System.out.println(o); // System.out.println(o.toString())
        }

    }

}
