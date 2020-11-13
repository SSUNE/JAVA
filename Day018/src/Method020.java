import java.util.Scanner;

public class Method020 {

    //total = process_total(kor, eng, math);
    //분석
    //기능 : 세개의 파라미터를 받아 총점구해 정수형을 리턴함.
    //리턴 : total -> int (total의 자료형)
    //파라미터 : kor, eng, math -> int kor, int eng, int math
    public static int process_total(int kor, int eng, int math) {
        return kor + eng + math;
    }
    public static float process_avg(int total) {
        float avg = (total/3.0f);
        return avg;
    }
    public static String process_pass(float avg, int kor, int eng, int math, String pass){
        int total=0;
        avg = (total / 3);
        if (avg >= 60 && kor > 40 && eng > 40 && math > 40) {
            pass = "합격";
        } else if (avg < 60) {
            pass = "불합격";
        } else if (avg >= 60 && (kor < 40 || eng < 40 || math < 40)) {
            pass = "합격유보";
        }
        return pass;
    }
    public static String process_scholar(float avg){
        String pass = (avg >= 95) ? "장학생" : "\t";
        return pass;
    }
    public static String process_star(float avg){
        String star = "";
        for (int i = 0; i<(int)avg/10; i++){
            star += "*";
        }
        System.out.println();
        return star;
    }
    public static String process_level(int kor){
        String level_kor = (kor >= 90) ? "수" : (kor >= 80) ? "우" : (kor >= 70) ? "미" : (kor >= 60) ? "양" : "가";
        return level_kor;
    }
    /*public static String process_level2(int eng){
        String level_eng = (eng >= 90) ? "수" : (eng >= 80) ? "우" : (eng >= 70) ? "미" : (eng >= 60) ? "양" : "가";
        return level_eng;
    }
    public static String process_level3(int math){
        String level_math = (math >= 90) ? "수" : (math >= 80) ? "우" : (math >= 70) ? "미" : (math >= 60) ? "양" : "가";
        return level_math;
    }*/

    public static String process_re(int kor, int eng, int math){
        String re = "";
        re = (kor < 40)? "o\t" : "-\t";
        re += (eng < 40)? "o\t" : "-\t";
        re += (math < 40)? "o\t" : "-\t";

        return re;
    }
    public static void process_show1(String name, int kor, int eng, int math, int total, float avg, String pass, String jang, String star){
        System.out.println("이름\t\t국어\t영어\t수학\t총점\t평균\t\t합격여부\t장학생\t랭킹");
        line2();
        System.out.println(name + "\t"+ kor + "\t"+ eng + "\t"+ math + "\t"+ total + "\t"+ String.format("%.2f",avg) + "\t"+ pass + "\t"+ jang + "\t"+ star);
    }
    public static void process_show2(String level_kor, String level_eng, String level_math){
        System.out.println("\t\t" + level_kor + "\t" + level_eng + "\t" + level_math);
    }
    public static void process_show3(String re){
        System.out.println("재시험\t" + re);
    }
    public static void line1(){
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }
    public static void line2(){
        System.out.println("----------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        // 변수
        String name = "";
        int kor, eng, math, total;
        float avg = 0.0f;
        String pass = "";
        String jang = "";
        String star = "";
        String level_kor = "", level_eng = "", level_math = "";
        String re = "";

        //입력
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름 입력 > "); name = scanner.next();
        System.out.println("국어점수 입력 > "); kor = scanner.nextInt();
        System.out.println("영어점수 입력 > "); eng = scanner.nextInt();
        System.out.println("수학점수 입력 > "); math = scanner.nextInt();

        //처리
        total = process_total(kor, eng, math);
        avg = process_avg(total);
        pass = process_pass(avg, kor, eng, math, pass);
        jang = process_scholar(avg);
        star = process_star(avg);

        level_kor = process_level(kor);
        level_eng = process_level(eng);
        level_math = process_level(math);
        re = process_re(kor, eng, math);

        //출력
        line1();
        process_show1(name, kor, eng, math, total, avg, pass, jang, star);
        line2();
        process_show2(level_kor, level_eng, level_math);
        line2();
        process_show3(re);
        line2();







    }
}
