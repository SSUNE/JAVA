public class Ex011 {
    public static void main(String[] args) {

        // 서기1년 부터 오늘 총 날수 (20.10.13 기준)
        int[] mom = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sum = 0;

        for (int i = 1; i < 2020; i++) {
            if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) {
                sum += 366;
            } else {
                sum += 365;
            }
        }

        for (int i = 0; i < 10; i++) {
            mom[2] = 29;
            sum += mom[i];
        }

        // 요일 찾기 (20.10.13 기준)
        String[] week = {"일", "월", "화", "수", "목", "금", "토"};
        String w = "";
        int nalsu = 737711;

        w = week[nalsu % 7];


        // 달력만들기 (2020.10월기준)
        // 10월1일까지의 총 일수
        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int total = 0;

        for (int i = 1; i < 2020; i++) {
            if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) {
                total += 366;
            } else {
                total += 365;
            }
        }

        for (int i = 0; i < 10; i++) {
            month[2] = 29;
            total += month[i];
        }
        //System.out.println(total+1); // 총 일수 737699일 출력

        int wee = 0;
        int nalsu2 = 737699;

        wee = nalsu2 % 7;

        System.out.println(" 서기1년 ~ 오늘 총 날수 : " + (sum + 13));
        System.out.println(" 2020년 10월 13일 " + w + "요일");
        System.out.println();
        System.out.println("==========10월==========");
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        for (int i = 0; i< wee; i++){
            System.out.print("*\t");
        }
        for (int i = 1; i<=month[10];i++){
            System.out.print(i + "\t");
            wee++;
            if (wee%7 == 0){
                System.out.println();
            }
        }
    }
}

