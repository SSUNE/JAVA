import java.util.Scanner;

public class test_2 {
    public static void main(String[] args) {

        // 변수
        int kor = 0, eng = 0, math = 0, tot = 0;
        double avg = 0;
        String ID = ""; // ID
        String pass = ""; // 합격여부
        String jang = ""; // 장학생여부
        String retest = " "; // 재시험여부
        String star = ""; // 랭킹

        Scanner scanner = new Scanner(System.in);

        // 입력
        System.out.println("ID    입력 > ");
        ID = scanner.next();

        System.out.println("국어점수입력 (0~100사이) > ");
        kor = scanner.nextInt();
        System.out.println("영어점수입력 (0~100사이) > ");
        eng = scanner.nextInt();
        System.out.println("수학점수입력 (0~100사이) > ");
        math = scanner.nextInt();

        // 처리
        tot = kor + eng + math;
        avg = tot/3.f;

        // 합격유무
        if ((avg>=60) && (kor >=40 && eng >=40 && math >=40)){
            pass = "합격";
        }else if ((avg>=60) ||(kor <40 || eng <40 || math <40) ){
            pass = "합격유보";
        }else if (avg<60) {
            pass = "불합격";
        }

        // 장학생
        if (avg>=95){
            jang = "장학생";
        }else {
            jang= " ";
        }

        // 랭킹
        if (avg){

        }

        // 재시험



    }
}