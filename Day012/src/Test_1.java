import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {

        // 변수
        int kor = 0, eng = 0, math = 0, tot = 0;
        double avg = 0;
        String ID = ""; // ID
        String pass = ""; // 합격여부
        String jang = ""; // 장학생여부
        String retest = " "; // 재시험여부
        String rank = ""; // 랭킹

        Scanner scanner = new Scanner(System.in);

        // 입력
        System.out.println("ID      입력> ");
        ID = scanner.next();


        for (; ; ) {
            System.out.println("국어점수입력 (0~100사이) > ");
            kor = scanner.nextInt();
            if (kor >= 0 && kor <= 100) {
                break;
            }
        }

        for (; ; ) {
            System.out.println("영어점수 (0~100사이)  > ");
            eng = scanner.nextInt();
            if (eng >= 0 && eng <= 100) {
                break;
            }
        }

        for (; ; ) {
            System.out.println("수학점수 (0~100사이)  > ");
            math = scanner.nextInt();
            if (math >= 0 && math <= 100) {
                break;
            }
        }

        // 처리
        tot = kor + eng + math;
        avg = tot / 3.0f;

        if (avg >= 95) {
            jang = "장학생";
        } else {
            jang = " ";
        }


        // 합격, 불합격
        if (avg >= 60 && (kor > 40 && eng > 40 && math > 40)) {
            pass = "합격";
        } else if (avg >= 60 || (kor < 40 || eng < 40 || math < 40)) {
            pass = "합격유보";
        } else if (avg < 60) {
            pass = "불합격";
        }


        // 랭킹
        for (int i = 1; i <= (int) avg / 10; i++) {
            rank += "★";
        }


        // 재시험여부
        if (kor < 40) {
            retest += "O\t";
        } else {
            retest += "X\t";
        }
        retest += (eng < 40) ? "O\t" : "X\t";
        retest += (math < 40) ? "O\t" : "X\t";


        // 출력
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("이름\t\t국어\t\t영어\t\t수학\t\t평균\t\t합격여부\t\t장학생\t\t랭킹");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(ID + "\t" + kor + "\t" + eng + "\t" + math + "\t" +
                String.format("%.2f", avg) + "\t" + pass + "\t" + jang + "\t" + rank);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("재시험\t" + retest);
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }
}
