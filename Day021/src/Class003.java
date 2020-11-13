class Coffee001{
    //1.멤버변수
    String name; // 제품이름
    int price; // 제품가격
    //2. 멤버함수
    public void show(){
        System.out.print("=====커피" + "\n커피명 : " + name + "\n커피가격 : " + price);
    }
}

public class Class003 {
    public static void main(String[] args) {

        //instance
        Coffee001 coffe = new Coffee001();

        //pulic
        coffe.name = "아메리카노";
        coffe.price = 2000;
        coffe.show();

    }
}
