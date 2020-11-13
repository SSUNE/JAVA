
public class Method013 {

    /*
    [분석]
    리턴값 : boolean
    파라미터 : int year
    기능 : 윤년인지, 평년인지 판단해서 윤년이면 true, 평년이면 false리턴
     */

    /*public static boolean leap(int year){
        boolean a;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            a = true;
        } else {
            a = false;
        }
        return a;
    }*/

    public static boolean leap(int year){
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        //System.out.println("윤년인지 , 평년인지 판단해서 윤년이면 true, 평년이면 false 리턴");
       if (leap(2019)){
           System.out.println("윤년");
       }else {
           System.out.println("평년");
       }

    }
}
