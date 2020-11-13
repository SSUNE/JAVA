class Car3 {
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
    public Car3() {
        this.gearType = "auto"; this.door = 4;
    }
    public Car3(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    public Car3(String color) {
        this.color = color;
    }

    public Car3(Car3 car) { // 단순하게 주소만 던져준거였음. 그래서 깊은 복사를 통해서 값을 복사 해줘야한다. (데이터를 채운다.)
        //System.out.println(car); // 메서드할때, 뭘 넘겨받았는지 확인차 쓴 내용
        this.color = car.color; this.gearType = car.gearType; this.door = car.door;
    }
}

public class Class017 {
    public static void main(String[] args) {
        // 1. Car3 자료형으로 만들 수 있는 인스턴스 변수 [ color | gearType | door ]
        // 2. new의 역활 - 메모리를 빌려오고 새롭게 공간을 할당
        // 3. Car3() 초기화를 시키면 셋팅을 해줌 Ca3[ color : null | gearType : atuo | door : 4 ]
        // 4. 3번에서 한 인스턴스변수를 사용할 수 있게 주소를 갖고 있는 것은 c1 -> Car3[ color : null | gearType : atuo | door : 4 ]
        Car3 c1 = new Car3();   c1.color = "red";   //5. .을 이용해서 접근해서 사용함.. c1 -> Car3 [ color : red(#) | gearType : atuo | door : 4 ]
        System.out.println(c1);
        Car3 c2 = new Car3(c1);                     System.out.println(c2);

        // 1. Car3 자료형으로 만들 수 있는 인스턴스 변수 [ color | gearType | door ]
        // 2. new의 역활 - 메모리를 빌려오고 새롭게 공간을 할당
        // 3. Car3() => 인스턴스변수에 [ color : greeon | gearType : atuo | door : 4 ]
        // 4. 인스턴스변수를 사용할 수 있게 주소를 갖고있는 것 : c3,c4
        Car3 c3 = new Car3();   c3.color = "green";   System.out.println(c3);
        Car3 c4 = new Car3(c3);                     System.out.println(c4);



    }
}

