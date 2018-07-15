package starter.chapter07.section01;

public class Waiter {
    Cook jack = new Cook();

    void takeOrder(String dish){
        jack.cooking(dish);
        System.out.println("Your food is ready. Please use it slowly!");
    }

    void saySorry(){
        System.out.println("Sorry, the restaurant doesn't offer this service.");
    }
}
