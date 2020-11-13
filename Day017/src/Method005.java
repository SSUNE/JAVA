public class Method005 {

    /*public static void line() {
        System.out.println("\n\n[ " + ver + " ]");
    }*/
    public static int return_num() {return 5;} // 자료형을 던져줘야한다.
    public static float return_float() {return  3.333f;}
    public static String mycolor() {return  "red";}
    public static String jangsu() {return  "★★★★★";}
    public static int  myadd( int a, int b) {return a+b;}
    public static char myban() {return 'A';}
    public static String sydID(int id) {return "G"+id;}
    public static char sydavg(int num) {
        char result = ' ';
        result = (num >= 90)? 'A' : (num >= 80)? 'B' : (num >= 70)? 'C' : 'D';
        return result;
    }

    public static void main(String[] args) {
        System.out.println("RETURN");
        //line();
        System.out.println("1. 내가 좋아하는 숫자는 : " + 5 ); // 무조건 숫자5
        System.out.println("2. 10/3을 실수로 표현 : " + 3.333); // 실수표현
        System.out.println("3. BEST COLOR : " + "red"); //문자열이 들어오게
        System.out.println("4. 장수돌침대 별이 : " + "★★★★★"); //
        System.out.println("5. 10+20 = : " + "30");
        System.out.println("6. 반(A/B) : " + 'A'); // 문자
        System.out.println();

        //line("ver-2");
        System.out.println("1. 내가 좋아하는 숫자는 : " + return_num() ); // 무조건 숫자5
        System.out.println("2. 10/3을 실수로 표현 : " + return_float()); // 실수표현
        System.out.println("3. BEST COLOR : " + mycolor()); //문자열이 들어오게
        System.out.println("4. 장수돌침대 별이 : " + jangsu()); //
        System.out.println("5. 10+20 = : " + myadd(10,20));
        System.out.println("6. 반(A/B) : " + myban()); // 문자
        System.out.println("당신의 학번은? : " + sydID(1111));
        System.out.println("당신의 평균은? : " + sydavg(88));
        // 90 ~ 100사이라면 A리턴, 80-90미만 B리턴, 70-80미만 C리턴, 그 이외D




    }

}
