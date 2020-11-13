import java.util.Scanner;

class TV002{
    //멤버변수
    String channel;
    int volume;

    //멤버함
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

    TV002(String channel, int volume){
        this.channel = channel;
        this.volume = volume;
    }
    TV002(){
    }
}

public class DAY023 {
    public static void main(String[] args) {
        //1. TV002라는 자료형으로 만들 수 있는 인스턴스 변수 [String channel | int volume]
        //2. new - 매모리를 빌려오고 새롭게 공간을 할당
        //3. TV002("MBC", 6) => 인스턴스변수에 [channel : MBC | volume : 6]세팅됨
        //4. 인스턴스변수를 사용할 수 있게 주소를 갖고있는것 : a1, a2

        TV002 a1 = new TV002("MBC", 6);
        a1.show();

        TV002 a2 = new TV002();
        a2.input();
        a2.show();
    }
}
