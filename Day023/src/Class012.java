class Mobile003{
    //멤버변수
    String company; //회사명
    String product; //제품명
    int price; //가격

    //멤버함수
    void show(){
        System.out.println("=== Mobile_ver3 ===");
        System.out.println("회사 : " + this.company);
        System.out.println("제품 : " + this.product);
        System.out.println("가격 : " + this.price);
    }
    void sale(){
        this.price = (int) (price-(price*0.1));
    }

    //생성자
    Mobile003(String company, int price, String product){
        this.company = company;
        this.price = price;
        this.product = product;
    }
    Mobile003(){
        this.company = "Samsung";
        this.product = "NOTE9";
        this.price = 1200000;

    }
}
public class Class012 {
    public static void main(String[] args) {
        /*
        1. Mobile003라는 자료형으로 만들 수 있는 인스턴스 변수[company | product | price]
        2. new의 역활 - 메모리를 빌려오고 새롭게 공간을 할당
        3. Mobile003라는("Samsung", 10000, "NOTE20") => 인스턴스변수에 [String company | int price | String product]
        4. 인스턴스변수를 사용할 수 있게 주소를 갖고있는 것 : mobile3
        */
        Mobile003 mobile3 = new Mobile003("Samsung", 10000, "NOTE20");
        mobile3.show();

        /*
        1. Mobile003라는 자료형으로 만들 수 있는 인스턴스 변수[company | product | price]
        2. new의 역활 - 메모리를 빌려오고 새롭게 공간을 할당
        3. Mobile003라는("Samsung", 1200000, "NOTE9") => 인스턴스변수에 [String company | int price | String product]
        4. 인스턴스변수를 사용할 수 있게 주소를 갖고있는 것 : mobile2
        */
        Mobile003 mobile2 = new Mobile003();
        mobile2.show();

        /*
        1. Mobile003라는 자료형으로 만들 수 있는 인스턴스 변수[company | product | price]
        2. new의 역활 - 메모리를 빌려오고 새롭게 공간을 할당
        3. Mobile003라는("Samsung", 1000000, "NOTE20") => 인스턴스변수에 [ company : Samsung |  price : 1000000 |  product : NOTE20]
        4. 인스턴스변수를 사용할 수 있게 주소를 갖고있는 것 : mobile1
        */
        Mobile003 mobile1 = new Mobile003();
        mobile1.company = "Sansung"; // 회사명지정
        mobile1.price = 1000000;    // 가격지정
        mobile1.product = "NOTE20"; // 제품명 지정
        mobile1.sale(); //10%세일
        mobile1.show(); //출력
    }
}
