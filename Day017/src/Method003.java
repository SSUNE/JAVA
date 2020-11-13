public class Method003 {

    public static void myInt(int num){
        System.out.println(" para1 : " + num);
    }
    public static void myFloat(float num) {
        System.out.println("para2 : " + num);
    }
    public static void myDouble(double d1, double d2) {
        System.out.println("para3 : " + d1 + ", " + d2);
    }

    public static void main(String[] args) {

        System.out.println("[ 예시1 ]");
        myInt(1); // myInt ( 1 )
        myInt(9); // ( 1 ) : 재료받는 자리
        myInt(7); // 자료형에 맞게 넣어주고  + 변수명 (int num)

        System.out.println("[ 예시2 ]");
        myFloat(1.1f);
        myFloat(1.2f);
        myFloat(1.3f);
        myFloat(10);  // 작은 자료형은 넣을 수 있다.
        myFloat('a');  // 작은 자료형은 넣을 수 있다. (문자 : 0~65535)

        System.out.println("[ 예시3 ]");
        myDouble(1.1, 1.2);


        /*

        함수구조 :
        일단은 그냥 붙이기 public static [리턴값] [메서드명] (파라미터)


         */
    }
}
