package starter.chapter07.section01;

public class Pad extends Computer {
    protected String battery = "5000 Ma battery";

    Pad(String name) {
        super(name);
    }

    public void open3G(){
        System.out.printf("%s Turn on the 3G network\n", name);
    }
    public void getBattery(){
        System.out.printf("%s has %s\n", name, battery);
    }

    public void showPicture(){
        System.out.printf("%s open the picture with your finger\n", name);
    }

    public String sayHello(){
        return super.sayHello() + " " + name;

    }
}
