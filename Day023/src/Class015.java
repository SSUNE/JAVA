class Car1 {
    //멤버변수
    String color;       // 색상
    String gearType;    // 변속기 종류 - auto(자동), manual(수동)
    int door;           // 문의 개수

    //멤버함수 : X

    //생성자
    public Car1(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    public Car1() { }

    @Override
    public String toString() {
        return "Car1{" +
                "color='" + color + '\'' +
                ", gearType='" + gearType + '\'' +
                ", door=" + door +
                '}';
    }
}

public class Class015 {
    public static void main(String[] args) {
        /*
        1. Car1 자료형으로 만들 수 있는 인스턴스 변수[color | gearType | door]
        2. new의 역활 - 메모리를 빌려오고 새롭게 공간을 할당
        3. Car1("red", "auto", 4) => 인스턴스변수에 [color : red | gearType : auto | door : 4]
        4. 인스턴스변수를 사용할 수 있게 주소를 갖고있는 것 : c2
         */
        Car1 c1 = new Car1();
        System.out.println(c1);
        c1.color = "red";   c1.gearType = "auto";   c1.door = 4; // 5. .을 사용해서 접근해 데이터 셋팅을 할 수 있다.
        System.out.println(c1); // 6. toString를 이용해서 객체 출력

        /*
        1. Car1 자료형으로 만들 수 있는 인스턴스 변수[color | gearType | door]
        2. new의 역활 - 메모리를 빌려오고 새롭게 공간을 할당
        3. Car1("white", "auto", 2) => 인스턴스변수에 [color : white | gearType : auto | door : 2]
        4. 인스턴스변수를 사용할 수 있게 주소를 갖고있는 것 : c2
         */
        Car1 c2 = new Car1("white", "auto", 2);
        System.out.println(c2);


    }
}

