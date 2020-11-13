class Myprice001 {// 멤버변수
    String name; // 제품이름
    int price; // 제품가격

    // 멤버함수
    public void show() { // 이름과 가격출력
        System.out.println("이름 : " + name + ", " + "가격 : " + price);
    }
}

public class Class002 {
    public static void main(String[] args) {

        Myprice001 price1 = new Myprice001();
        //pulic
        price1.name = "노트20";
        price1.price = 100000;
        price1.show();
    }
}
