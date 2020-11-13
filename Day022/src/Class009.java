class Coffee002{
    //1. 멤버변수
    String name; // 커피이름
    int price; // 커피가격
    int num; // 커피잔수

    //2. 멤버함수
    void show(){
        System.out.println("===== 커피");
        System.out.println("커피명 : " + name);
        System.out.println("커피잔수 : " + num);
        System.out.println("커피가격 : " + price);
    }

    Coffee002(String name, int num, int price){
        this.name = name; this.num = num; this.price = price; // this 붙이면 1. 멤버변수를 해당함.
    }
    Coffee002(){
        this.name = "아메리카노";
        this.num = 1;
        this.price = 2000;
    }
}

public class Class009 {
    public static void main(String[] args) {
        Coffee002 a1 = new Coffee002("카페라떼", 2, 4000); // 생성자 오버로딩시 디폴트생성자는 수동으로 호출됨.
        a1.show();

        Coffee002 a2 = new Coffee002(); //디폴트 생성자
        a2.show();

    }
}
