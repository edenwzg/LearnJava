package starter.chapter07.section01;

public class Computer {
    protected String name;
    protected String screen = "LCD Liquid Crystal Display";

    Computer(String name){
        this.name = name;
    }

    public void getScreen(){
        System.out.printf("%s's screen is %s\n", name, screen);
    }
    public void startUp(){
        System.out.printf("%s is starting up, please wait a moment...\n", name);
    }

    public void showPicture(){
        System.out.printf("%s open the picture with a click\n", name);
    }

    public String sayHello(){
        return "welcome";
    }
}
