import java.util.Scanner;

public class For017 {
    public static void main(String[] args) {

        // 변수
        String name = "", jang="", pass="", totlevel= "", korLevel="", mathLevel="", engLevel="", trytest="";
        int kor=0, eng=0, math=0, tot=0;
        float avg=0f;

        Scanner scanner = new Scanner(System.in);


        System.out.println("이름입력> ");
        name = scanner.next();


        for (;;) {
            System.out.println("국어점수 > ");
            kor = scanner.nextInt();
            if (kor >= 0 && kor <= 100) {
                break; //잘썼으면 빠져나오기
            }
        }

        for (;;) {
            System.out.println("영어점수 > ");
            eng = scanner.nextInt();
            if (eng >= 0 && eng <= 100) {
                break; //잘썼으면 빠져나오기
            }
        }

        for (;;) {
            System.out.println("수학점수 > ");
            math = scanner.nextInt();
            if (math >= 0 && math <= 100) {
                break; //잘썼으면 빠져나오기
            }
        }

        // 처리
        tot = kor+eng+math;
        avg = tot/3.0f;

        if(avg>=95) {
            jang = "장학생";
        } else {jang = "해당없음";}

        // 국어 등급
        if(kor>=90) {
            korLevel = kor + "(수)";
        } else if (kor>=80) {
            korLevel =  kor + "(우)";
        } else if (kor>=70) {
            korLevel = kor + "(미)";
        } else if (kor>=60) {
            korLevel =  kor + "(양)";
        } else {korLevel =  kor + "(가)";}

        // 영어 등급
        if (eng>=90) {
            engLevel = eng + "(수)";
        } else if (eng>=80) {
            engLevel =  eng + "(우)";
        } else if (eng>=70) {
            engLevel =  eng + "(미)";
        } else if (eng>=60) {
            engLevel =  eng + "(양)";
        } else {
            engLevel = eng + "(가)";
        }

        // 수학 등급
        if (math>=90) {
            mathLevel = math + "(수)";
        } else if (math>=80) {
            mathLevel =  eng + "(우)";
        } else if (math>=70) {
            mathLevel =  eng + "(미)";
        } else if (math>=60) {
            mathLevel =  math + "(양)";
        } else {
            mathLevel = math + "(가)";
        }

        // 대처방안 : for, method, 삼항연산자

        /*
        mathLevel = (math>=90)? math+"(수)" :
                (math>=80)? math+"(우)" :
                        (math>=70)? math+"(미)" :
                                (math>=60)? math+"(양)" : math+"(가)";
        */



        // 합격, 불합격

        if(avg>=70) {
            pass = "합격";
        } else  {
            pass = "불격";
        }


        String star = " ";
        for (int i = 1; i<=(int)avg/10; i++ ){
            star+="★";
        }


        // 재시험
        if (kor < 40) {trytest += "O\t";} else {trytest += "-\t";}
        trytest += (eng < 40)? "O\t" : "-\t";
        trytest += (math < 40)? "O\t" : "-\t";


        // 출력
        System.out.println("==============================================================================");
        System.out.println("이름\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\t\t합격여부\t\t레벨\t\t장학생");
        System.out.println(name + "\t" + korLevel + "\t" + engLevel + "\t" + mathLevel + "\t" + tot + "\t" +
                String.format("%.2f",avg) + "\t" + pass  + "\t" + star + "\t" + jang);
        System.out.println("==============================================================================");


        if (kor < 40 || eng < 40 || math < 40) {
            System.out.println("재시험\t" + trytest);
        }
        System.out.println("==============================================================================");

    }
}
/*
[연습문제]     클래스명 : For017
    //  0) 이름 담을 자료형선택해  name이라 변수명을 정하고 입력받기
    //  1) 국어점수 담을 자료형선택해 kor이라 변수명을 정하고 입력받기 (0~100사이만입력받기-아니라면 무한반복)
    //  2) 영어점수 담을 자료형선택해 eng이라 변수명을 정하고 입력받기 (0~100사이만입력받기-아니라면 무한반복)
    //  3) 수학점수 담을 자료형선택해 math이라 변수명을 정하고 입력받기 (0~100사이만입력받기-아니라면 무한반복)
    //  4) 총점점수 담을 자료형선택해 tot이라 변수명을 정하고 총점구하기
    //  5) 평균점수 담을 자료형(float)선택해 avg이라 변수명을 정하고  평균구하기
    //  6) 모두 출력 	- 평균은 소수점이 처리되게 만들기
    //  7) 평균 95이상이면 장학생
    //  8) 각각 국어, 영어, 수학 점수 90이상 수,80이상 우,70이상 미,60이상 양,나머지 가
    //  9) 평균이 70이상이면 "합격"
	         평균이 70미만이면 무조건 "불합격"
    // 10) 단, 세과목중에서 한과목이라도 40미만이면
	         합격이 아니라 "재시험"    (재시험과목출력)
    // 11) 해당평균의 별   예)    90점대면 별 9개      / 80점대이면 별8개 ....

	ㅁ실행화면
	이름 입력 > FIRST
	국어점수 입력 > 100
	영어점수 입력 > 100
	수학점수 입력 > 99
	==============================================================================
	이름		국어	영어	수학	총점	평균	합격여부	레벨			장학생
	==============================================================================
	FIRST		100(수)	100(수)	99(수)	299	99.67	합격	★★★★★★★★★	 	장학생
	==============================================================================
 */

// 레벨
        /*
        switch ((int)avg/10){
            case 10 : totlevel = "★★★★★★★★★★"; break;
            case 9 : totlevel = "★★★★★★★★★"; break;
            case 8 : totlevel = "★★★★★★★★"; break;
            case 7 : totlevel = "★★★★★★★"; break;
            case 6 : totlevel = "★★★★★"; break;
            case 5 : totlevel = "★★★★★"; break;
            case 4 : totlevel = "★★★★"; break;
            case 3 : totlevel = "★★★"; break;
            case 2 : totlevel = "★★"; break;
            case 1 : totlevel = "★"; break;
        }
         */