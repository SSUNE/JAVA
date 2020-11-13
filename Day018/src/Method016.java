
public class Method016 {
    //윤년
    public static boolean leap(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    // 총 날수
    public static void myCalendar(int year, int month, int day) {

        int y = 0;
        int m = 0;
        int d = 0;
        int w = 0; // 11월까지
        int sum = 0;
        int[] mom = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //1992년부터 2019년 계산
        for (int i = 1992; i < year; i++) {
            y += leap(i) ? 366 : 365;
        }
        System.out.println(y);

        //월
        mom[2] = leap(year) ? 29 : 28;
        for (int i = 1; i < month; i++) {
            m += mom[i];
        }
        System.out.println(m);

        //일
        d=day;
        System.out.println(d);

        // 1992년 11월까지의 일수
        for (int i = 1; i < 11; i++) {
            mom[2] = 29;
            w += mom[i];
        }
        System.out.println(w);


        sum = ((y+m+d)-w)-2; // 2는 11월 3일이 태어난 날이여서 11월1,2일 이틀 제외
        System.out.println("지금까지 살아온 날 수 :  " + sum);
    }
    public static void main(String[] args) {

        myCalendar(2020, 10, 20);
    }
}
