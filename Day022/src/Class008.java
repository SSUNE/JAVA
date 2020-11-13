class MyPrice002{
    //1. 멤버변수
    String name;
    int price;

    //2. 멤버함수
    void show(){
        System.out.println("상품이름 : " + name);
        System.out.println("상품가격 : " + price);
    }
    // 생성자 - 생성자 오버로딩
    MyPrice002(){ //리턴값 (X) 메서드명 :  클래스명과 동일함 / 파라미터() - 기본생성자
        name = "갤럭시노트12";
        price = 110000;
    }
    // MyPrice002() - 생성자 : 리턴값X / 클래스명과 도일  / 파라미터 : String "갤럭시폴드", int 100000
    MyPrice002(String n, int p) {
        name = n;
        price=p;
    }
}

public class Class008 {
    public static void main(String[] args) {
        // 1. MyPrice002 [name | price | show] 만들 수 있는 단위의 자료형
        // 2. [new] 공간을 빌려오고
        // 3. [ MyPrice002() ]인스턴스를 초기화 [name : 갤러시노트12 | price : 110000 | show]
        // 4. product인스턴스변수를 사용가능하게 주소
        MyPrice002 product = new MyPrice002();
        product.show();

        MyPrice002 product2 = new MyPrice002("갤럭시폴드", 100000);
        product2.show();
    }
}
