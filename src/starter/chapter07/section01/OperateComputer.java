package starter.chapter07.section01;

public class OperateComputer {
    public static void main(String[] args) {
        Computer dell = new Computer("dell");
        Pad iPad = new Pad("iPad");
        dell.getScreen();
        dell.showPicture();
        dell.startUp();
        System.out.println(dell.sayHello());

        System.out.println();
        iPad.open3G();
        iPad.getScreen();
        iPad.getBattery();
        iPad.showPicture();
        dell.startUp();
        System.out.println(iPad.sayHello());


    }

}
