
public class Method017__ {
    //윤년
    public static boolean leap(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    //요일구하기
    public static String week(int key) {
        String[] yoil = {"일", "월", "화", "수", "목", "금", "토"};
        return yoil[key % 7]; // yoil[1] <- 월
    }


    // 총 날수
    public static void myCalendar(int year, int month, int day) {

        int box = 0;
        int[] mom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //년
        for (int i = 1; i < year; i++) {
            box += leap(i) ? 366 : 365;
        }
        //월
        mom[1] = leap(year) ? 29 : 28;
        for (int i = 0; i < month - 1; i++) {
            box += mom[i];
        }
        //System.out.println(box);
        //일
        box += day;
        //System.out.println("서기 1년 1월 1일 ~ " + year + "년 " + month + "월 " + day + "일 " + week(box) + "요일 " + "> " + box);
        show(box, month, mom[month], day);

    }


    public static void show(int hap, int month, int end, int date) {
        //System.out.println(hap + "\t" + month + "\t" + end + "\t" + date);
        String[] yoil = {"일", "월", "화", "수", "목", "금", "토"};

        System.out.println();
        System.out.println("========== " + month + "월 " + "===========");
        for (int i = 0; i < yoil.length; i++) {
            System.out.print(yoil[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < (hap - date + 1) % 7; i++) {
            System.out.print("*\t");
        }
        for (int i = 1; i <= end; i++) {
            if ((hap - date + i) % 7 == 0) {
                System.out.println();
            }
            System.out.print(i + "\t");
        }

        // [1]      이번달수 : *** 2019.2.1
        //                  전체일수 - 27 + 1
        //2019.2.1의 총일수 : hap - data + 1
        //System.out.println("2019. 02. 01 요일 : " + week(hap - date + 1)); //금

    }

    public static void showAll(int year2) {

        for (int month = 1; month <= 12; month++) {
            myCalendar(year2, month, 1);
        }
    }


    public static void main(String[] args) {

        myCalendar(2019, 2, 27);

        showAll(2020);


    }

}
