
public class Method014 {

    //윤년파악
    /*
    // TODO _boolean leap(int year)
    [분석]
    리턴 : boolean -> true / false
    파라미터 : int year -> year 년도
    기능 : 윤년인지 아닌지 판단하는 기능
    */

    /*
    // TODO _mycal1001(2020, 10, 19)
    [분석]
    리턴 : void
    파라미터 : int year, int month, int month, int date => 2020,10,19
    기능(1) : 총 일수 구하기
    기능(2) : 출력
            001. year : 737424 (1-2019년까지만 계산했을 때) - 윤년인지 파악해야되기때문에 1.번 메서드 leap사용하기
            002. month : 274   (1-9월까지 month계산) - 윤년인지 파악해야되기때문에 1.번 메서드 leap사용하기
            003. day : 19 (일만 계산)
    */
    public static boolean leap(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void mycal1001(int y, int m, int d) {
        int[] mom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = 0, month = 0;
        // year 총 일수
        for (int i = 1; i < y; i++) {
            if (leap(i) == true) {
                year += 366;
            } else year += 365;
        }
        System.out.println("001 : YEAR : " + year);

        // month 총 일수
        for (int i = 0; i < m - 1; i++) {
            mom[1] = 29;
            month += mom[i];
        }
        System.out.println("002 : MONTH : " + month);

        // day 일수
        d = 19;
        System.out.println("003 : DAY : " + d);

        System.out.println("서기 1년 1월 1일 ~ 2020년 10월 19일 > " + (year + month + d));
    }

    public static void main(String[] args) {
        mycal1001(2020, 10, 19);


    }
}
