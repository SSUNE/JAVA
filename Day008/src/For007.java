public class For007 {
    public static void main(String[] args) {
        // 서기1년~서기2020년중에서 윤년의 갯수를 출력하시오.

        int count = 0;

        for (int i=1; i<=2020; i++) {
            if (i%4 == 0 && i%100 !=0 || i%400 == 0) {
                count++;
            }
        }
        System.out.println("서기1년~서기2020년중에서 윤년의 갯수 : " + count);


    }
}
