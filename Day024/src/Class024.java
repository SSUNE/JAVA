
class Product {
    //멤버변수
    static int count; // 클래스 변수 - Method area - 메모리상에 올라가 있으므로 사용이 가능함. // 여기서 초기화하는게 명시적초기화(static int count=0; - 권장사항 아님.)
    int serialNo; // 인스턴스 변수
    static {count = 0;}

    //멤버함수


    //생성자
    public Product() {
        this.serialNo = ++count;
    }

}

public class Class024 {
    public static void main(String[] args) {
        //0. static변수 초기화 : [기본값 : count = 0; | 명시적초기화 X | 클래스초기화{} : count = 0 ]
        //1. 사용할 수 있는 이스턴스 변수 [serialNO ]
        //2. new 공간을 빌려오기
        //3. Product() 생성자를 불러와서 초기화를 해준다    [기본값 : serialNo=0 | 명시적초기화X | 인스턴스블록X | 생성자]
        Product p1 = new Product(); //serialNO  =1 [serialNo=1]     1대입하고 증가 [serialNo = count++]
        Product p2 = new Product(); //serialNO  =2 [serialNo=2]     2대입하고 증가 [serialNo = count++]
        Product p3 = new Product(); //serialNO  =3 [serialNo=3]     3대입하고 증가 [serialNo = count++]

        System.out.println("p1의 제품번호는 (serial no)는 " + p1.serialNo);
        System.out.println("p2의 제품번호는 (serial no)는 " + p2.serialNo);
        System.out.println("p3의 제품번호는 (serial no)는 " + p3.serialNo);
        System.out.println("생산된 제품의 수는 모두 " + Product.count + "개 입니다.");
    }
}
