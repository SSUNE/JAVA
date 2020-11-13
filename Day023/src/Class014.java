import java.util.Scanner;

class Coffee004 {
    //멤버변수
    String name; // 커피명
    int price; // 가격
    int num; // 개수
    String[] coffeeName; int[] coffeePrice; //메뉴판
    int index = -1;


    //멤버함수
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(":::::::::::::::COFFEE ORDER");
        for (int i = 0; i<coffeeName.length; i++){
            System.out.println(coffeeName[i] + " : " + coffeePrice[i] + "\t");
        }
        System.out.print("::커피이름 입력 > ");
        this.name = scanner.next();
        System.out.print("::잔수(개수) 입력 > ");
        this.num = scanner.nextInt();
        System.out.println();

    } // 입력을 받아주는 함수(커피명, 가격, 개수)

    void coffee_calc() {
        if (this.name.equals("아메리카노")) {
            this.price = 1000 * num;
        } else if (name.equals("카페라떼")) {
            this.price = 1500 * num;
        } else if (name.equals("카푸치노")) {
            this.price = 2000 * num;
        }//계산해주는 함
    }

    void show() {
        coffee_calc();
        System.out.println("====== COFFEE_SHOW");
        System.out.print("= 커 피 명 : " + this.name + "\t");
        System.out.print("= 커피잔수 : " + this.num + "\t");
        System.out.print("= 커피가격 : " + this.price + "\t");
        System.out.println();
    } //커피명, 가격을 출력해주는 함수

    public Coffee004() {
        String [] coname = {"아메리카노", "카페라떼", "카푸치노"};
        int[] coprice = {1000, 1500, 2000};
        coffeeName = coname;
        coffeePrice = coprice;
    }

    //생성자
    Coffee004(String name, int num) {
        this.name = name;
        this.num = num;
    }

    Coffee004(String name, int num, int price) {
        this.name = name;
        this.num = num;
        this.price = price;
    }
}

public class Class014 {
    public static void main(String[] args) {
        /*
        1. Coffee004 자료형으로 만들 수 있는 인스턴스 변수[ name | num | coffeeName[] | coffeePrice[] ]
        2. new의 역활 - 메모리를 빌려오고 새롭게 공간을 할당
        3. Coffee004("아메리카노", 3) => 인스턴스변수에 [ name : 아메리카노 | num : 3]
        4. 인스턴스변수를 사용할 수 있게 주소를 갖고있는 것 : a1
         */
        Coffee004 a1 = new Coffee004("아메리카노", 3);
        //System.out.println(a1);
        a1.show();


        Coffee004 a2 = new Coffee004();
        //System.out.println(a2);
        a2.input();
        a2.show();


    }
}

