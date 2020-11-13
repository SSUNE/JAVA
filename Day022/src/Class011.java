import java.util.Scanner;

class Animal002{
    //1. 멤버변수
    String name = "USERNAME";
    int age;


    //2. 멤버함수
    void show(){
        System.out.println(":::::::::::::::::::::::::");
        System.out.println("::이름 : " + this.name);
        System.out.println("::나이 : " + this.age);
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(":::::::::::::::::::::::::");
        System.out.print("::이름입력 > ");
        this.name = scanner.next();
        System.out.print("::나이입력 > ");
        this.age = scanner.nextInt();
    }
    Animal002(){

    }

}

public class Class011 {
    public static void main(String[] args) {
        Animal002 a1 = new Animal002();
        a1.show();

        Animal002 a2 = new Animal002();
        a2.input();
        a2.show();

    }
}
