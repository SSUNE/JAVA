class Day022 {// 멤버변수
    String name; // 제품이름
    int price; // 제품가격

    // 멤버함수
    public void show() { // 이름과 가격출력
        System.out.println("====커피\n" + "커피명 : " + name + "\n" + "커피가격 : " + price);
    }
}

public class DAY022 {
    public static void main(String[] args) {

        Day022 test = new Day022();
        //pulic
        test.name = "아메리카노";
        test.price = 2000;
        test.show();
    }
}
