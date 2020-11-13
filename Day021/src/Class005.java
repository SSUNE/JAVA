import java.util.Scanner;

class Animal001 {
    //1.멤버변수
    String name; // 제품이름
    int age; // 제품가격

    //2. 멤버함수
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("::이름입력 > ");
        name = scanner.next();
        System.out.print("::나이입력 > ");
        age = scanner.nextInt();
    }

    public void show() {
        System.out.println("::::::::::::::::::::::::::::::::::::");
        System.out.println("::이름 : " + name);
        System.out.println("::나이 : " + age);
    }
}

public class Class005 {
    public static void main(String[] args) {

        //instance
        Animal001 ai = new Animal001();

        ai.input();
        ai.show();

    }
}
