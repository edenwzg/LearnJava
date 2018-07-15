package starter.chapter07.section01;

public class OrderDishes {
    public static void main(String[] args) {
        Waiter tom = new Waiter();

        System.out.println("** Please ask the cook to make me a spicy shredded meat **");
        tom.takeOrder("spicy shredded meat");

        System.out.println("** What's the name of the cook, please **");
        tom.saySorry();

        System.out.println("** Please ask the cook to cut me some pepper **");
        tom.saySorry();

    }
}
