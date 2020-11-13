import java.util.Scanner;

class Coffee005{
    //멤버변수
    String name;
    int price;
    int num;

    static String[] coffeeName;
    static int[] coffeePrice;
    static {coffeeName = new String[]{"아메리카노", "카페라떼", "카푸치노"};}
    static {coffeePrice = new int[]{1000, 1500, 2000};}

    //멤버함수
    void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("::::::: COFFEE_ORDER");
        for (int i = 0; i<coffeeName.length; i++){
            System.out.print(coffeeName[i] + " : " + coffeePrice[i] + "\t");
        }
        System.out.println();
        System.out.print("::커피이름 입력 > ");
        this.name = scanner.next();
        System.out.print("::커피잔수 입력 > ");
        this.num = scanner.nextInt();
    }
    void show(){
        coffe_calc();
        System.out.println("====== COFFEE_SHOW");
        System.out.println("= 커 피 명 : " + name + "\t");
        System.out.println("= 커피잔수 : " + num + "\t");
        System.out.println("= 커피가격 : " + price + "\t");
    }
    void coffe_calc() {
        if (name.contains("아메")) {
            this.price = 1000 * num;
        } else if (name.contains("카페") || name.contains("라떼")) {
            this.price = 1500 * num;
        } else if (name.contains("카푸") || name.contains("치노")) {
            this.price = 2000 * num;
        }

    }
    //생성자
    public Coffee005(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public Coffee005() {
    }
}

public class Class025 {
    public static void main(String[] args) {

        Coffee005 a1 = new Coffee005("아메리카노",3);
        a1.show();
        Coffee005 a2 = new Coffee005();
        a2.input();
        a2.show();

    }

}
