public class For2008 {
    public static void main(String[] args) {

        // 4팩토리얼값을 구하시오 (누적의 곱) 4*3*2*1

        // for
        int pak = 1;
        for (int i=4; i>0; i--){
            pak *= i;
        }
        System.out.println("4! = " + pak);

        System.out.println();

        // while
        int fac = 1;
        int i=4;
        while (i>0){
            fac *= i;
            i--;
        }
        System.out.println("4! = " + fac);

        System.out.println();

        // do-hile
        int fack = 1;
        int j=4;
        while (j>0){
            fack *= j;
            j--;
        }
        System.out.println("4! = " + fack);

    }
}
