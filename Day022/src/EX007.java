class MyPoint {

    // 맴버변수
    int x, y;

    //맴버함수
    //System.out.println(p.getDistance(2,2))
    //리턴값 : double / 메서드명 : getDistance / 파라미터(2,2) int x1, int y1
    public double getDistance(int x1, int y1) {
        // 내가 원하는 거리^2 = (x1-x)^2 + (y1-y)*^2
        // Math.sqrt(내가원하는거리^2)
        return Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
    }
    //생성자
    MyPoint(){}
    MyPoint(int x, int y){this.x = x; this.y=y;}

} //class end

public class EX007 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1,1);
        System.out.println(p.getDistance(2,2));

    }
}
/*
피타고라스의 정리(1)
    : 두점    c^2 = a^2 + b^2
    :        c^2 = (x1-x2)^2 + (y1-y2)^2
 */