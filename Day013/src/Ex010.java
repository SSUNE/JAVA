public class Ex010 {
    public static void main(String[] args) {

        String[] week = {"일", "월", "화", "수", "목", "금", "토"};
        String w = "";
        int nalsu = 737711;

        w = week[nalsu % 7];


        System.out.println(" 서기1년 ~ 오늘 총 날수 : " + nalsu);
        System.out.println(" 2020년 10월 13일 " + w + "요일");
    }
}
