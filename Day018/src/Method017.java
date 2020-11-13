/*

public class Method017 {
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
        //showAll(box, month, mom[month], day);

    }


    */
/*public static void show(int hap, int month, int end, int date) {
        //System.out.println(hap + "\t" + month + "\t" + end + "\t" + date);
        String[] yoil = {"일", "월", "화", "수", "목", "금", "토"};

        System.out.println("========== " + month + "월 " + "===========");
        for (int i = 0; i < yoil.length; i++) {
            System.out.print(yoil[i] + "\t");
        }
        System.out.println();
        //별 출력
        for (int i = 0; i < (hap - date + 1) % 7; i++) {
            System.out.print("*\t");
        }
        //월에 맞는 일자 출력
        for (int i = 1; i <= end; i++) {
            if ((hap - date + i) % 7 == 0) {
                System.out.println();
            }
            System.out.print(i + "\t");
        }

    }*//*


    public static void showAll(int year){

        for (int i = 1; i<=12; i++) {
            System.out.println("========== " + month + "월 " + "===========");
            String[] yoil = {"일", "월", "화", "수", "목", "금", "토"};
            //별 출력
            for (int k = 0; k < (hap - date + 1) % 7; k++) {
                System.out.print("*\t");
            }
            //월에 맞는 일자 출력
            for (int j = 1; j <= end; j++) {
                if ((hap - date + j) % 7 == 0) {
                    System.out.println();
                }
                System.out.print(j + "\t");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {

        showAll(2020);


    }

}
*/
