package starter.chapter07.section01;

public class Cook {
    String name;

    public Cook(){
        this.name = "Jack Chen";
    }
    void cutPepper(){
        System.out.println(name + " cut the pepper");
    }

    void washVegetables(){
        System.out.println(name + " wash the vegetables");
    }

    void cooking(String dish){
        cutPepper();
        washVegetables();
        System.out.println(name + " cooking " + dish);
    }
}
