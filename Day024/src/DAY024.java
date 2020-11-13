class Car1 {
    //멤버변수
    String color;
    String gearType;
    int door;



    //멤버함수

    //생성자
    @Override
    public String toString() {
        return "Car1{" +
                "color='" + color + '\'' +
                ", gearType='" + gearType + '\'' +
                ", door=" + door +
                '}';
    }

    public Car1(String color, String gearType, int door) {
        this.color=color;   this.gearType=gearType;     this.door=door;
    }

    public Car1() {

    }
}


public class DAY024 {
    public static void main(String[] args) {
        //1. Car1 쓸수있는 인스턴스 변수 [color | gearType | door ]
        //2. new 메모리를 빌려오고 공간할당
        //3. Car1()셋팅내용 [ color = null | gearType = null | door = 0]
        //4. c1이 가지고있는 것  : 주소
        Car1 c1 = new Car1();
        System.out.println(c1);
        c1.color = "red";
        c1.gearType = "auto";
        c1.door =4;
        System.out.println(c1);
        Car1 c2 = new Car1("Wwhite","auto",2);
        System.out.println(c2);
    }
}
