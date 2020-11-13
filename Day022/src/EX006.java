class Distance {

    // 맴버변수
    int x, x1, y, y1;

    //맴버함수
    public double getDistance(int x, int y, int x1, int y1) {
        // 내가 원하는 거리^2 = (x1-x)^2 + (y1-y)*^2
        // Math.sqrt(내가원하는거리^2)
        return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
    }
    //생성자

} //class end

public class EX006 {
    public static double getDistance(int x, int y, int x1, int y1) {
        return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
    }
    public static void main(String[] args) {
        Distance d = new Distance(); // 인스터스란 ?  클래스(붕어빵틀) 객체(붕어빵) 찍어낸것 d
        System.out.println("객체 찍어서사용 일반메서드 : " + d.getDistance(1,1,2,2));
        System.out.println("클래스 멤버함수이용 : " + d.getDistance(1,1,2,2));
        // statice 메모리상에 올라가 있으므로 new 안하고도 사용이 가능함.
        System.out.println("클래스 멤버함수이용 : " +  + EX006.getDistance(1,1,2,2));
    }
}
/*
피타고라스의 정리(1)
    : 두점    c^2 = a^2 + b^2
    :        c^2 = (x1-x2)^2 + (y1-y2)^2
 */