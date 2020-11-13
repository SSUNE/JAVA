package Ex021_package;

public class Ex021 {
    public static void main(String[] args) {
        MyTv t = new MyTv();
        t.setChannel(10);
        System.out.println("CH : " + t.getChannel());       // ch : 10
        t.setVolume(20);
        System.out.println("VOL : " + t.getVolume());       // VOL : 20
    }
}
