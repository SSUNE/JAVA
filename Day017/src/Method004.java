public class Method004 {

    public static void test1(int num) {
        System.out.println(num);
    }
    public static void test2(double num) {
        System.out.println(num);
    }
    public static void hap(int num, int num2) {
        int sum = 0;
        for (int i = num; i<=num2; i++ ) {
            sum += i;
        }
        System.out.println("3+4+5=" + sum);
    }
    public static void disp(int num, char a) {
        for (int i = 0; i<num; i++){
            System.out.print(a);
        }
        System.out.println();
    }
    public static void disp2(int num, char b) {
        for (int i = 0; i<num; i++){
            System.out.print(b);
        }
    }


    public static void main(String[] args) {
        // 파라미터 연습
        test1(50) ;
        test2(1.2);
        hap(3,5);
        disp(7,'*');
        disp2(2,'♥');


        /*

        함수구조 :
        일단은 그냥 붙이기 public static [리턴값] [메서드명] (파라미터)


         */
    }
}
