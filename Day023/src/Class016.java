class Car2 {
    //멤버변수
    String color;       // 색상
    String gearType;    // 변속기 종류 - auto(자동), manual(수동)
    int door;           // 문의 개수
    //멤버함수 : X

    @Override
    public String toString() {
        return "Car1{" +
                "color='" + color + '\'' +
                ", gearType='" + gearType + '\'' +
                ", door=" + door +
                '}';
    }

    //생성자
    public Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    public Car2(String color) {
        this.color = color;
    }

    public Car2() { }
}

public class Class016 {
    public static void main(String[] args) {
        // 1. Car2 자료형으로 만들 수 있는 인스턴스 변수 [ color | gearType | door ]
        // 2. new의 역활 - 메모리를 빌려오고 새롭게 공간을 할당
        // 3. Car2() => 인스턴스변수에 [ color : null | gearType : null | door : 0 ]
        // 4. 인스턴스변수를 사용할 수 있게 주소를 갖고있는 것 : c1
        Car2 c1 = new Car2();
        System.out.println(c1);

        // 1. Car2 자료형으로 만들 수 있는 인스턴스 변수[ color | gearType | door ]
        // 2. new의 역활 - 메모리를 빌려오고 새롭게 공간을 할당
        // 3. Car2("white") => 인스턴스변수에 [ color : white | gearType : null | door : 0 ] ]
        // 4. 인스턴스변수를 사용할 수 있게 주소를 갖고있는 것 : c2
        Car2 c2 = new Car2("white");
        System.out.println(c2);

        // 1. Car2 자료형으로 만들 수 있는 인스턴스 변수[ color | gearType | door ]
        // 2. new의 역활 - 메모리를 빌려오고 새롭게 공간을 할당
        // 3. Car2("red", "manual", 2) => 인스턴스변수에 [ color : red | gearType : manual | door : 0 ]
        // 4. 인스턴스변수를 사용할 수 있게 주소를 갖고있는 것 : c3
        Car2 c3 = new Car2("red", "manual", 2);
        System.out.println(c3);

        System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
        System.out.println("c3의 color = " + c3.color + ", gearType = " + c3.gearType + ", door = " + c3.door);


    }
}

