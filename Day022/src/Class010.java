import java.util.Scanner;

class TV002{
    //1. 멤버변수
    String channel; // 채널
    int volume; // 볼륨


    //2. 멤버함수
    void show(){
        System.out.println("===== TV");
        System.out.println("TV채널 : " + channel);
        System.out.println("TV볼륨 : " + volume);
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(":::::::::MYTV");
        System.out.print("::TV채널입력 > ");
        channel = scanner.next();
        System.out.print("::TV볼륨입력 > ");
        volume = scanner.nextInt();
    }

    TV002(String c, int v){
        channel = c;
        volume = v;
    }
    TV002(){
    }

}

public class Class010 {
    public static void main(String[] args) {
        TV002 a1 = new TV002("MBC", 6);
        a1.show();

        TV002 a2 = new TV002();
        a2.input();
        a2.show();

    }
}
