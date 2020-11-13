public class Method013 {

    public static boolean leap(int year){
        boolean a = true;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
             a = true;
        } else {
             a = false;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println("윤년인지 , 평년인지 판단해서 윤년이면 true, 평년이면 false 리턴");
        boolean a = leap(2020);
        System.out.println(a);

    }
}


