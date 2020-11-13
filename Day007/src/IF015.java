import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class IF015 {
    public static void main(String[] args){

        // 변수
        String hakbun = "", jang="", pass="", totlevel= "", korLevel="", mathLevel="", engLevel="", trytest="";
        int kor=0, eng=0, math=0, tot=0;
        float avg=0f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("학번입력> ");		hakbun = scanner.next();
        System.out.println("국어점수 > ");	kor = scanner.nextInt();
        System.out.println("영어점수 > ");	eng = scanner.nextInt();
        System.out.println("수학점수 > ");	math = scanner.nextInt();

        // 처리
        tot = kor+eng+math;
        avg = tot/3.0f;

        if(avg>=95) {jang = "장학생";}
        else {jang = "X";}

        if(kor>=90) {korLevel = kor + "(수)";}
        else if (kor>=80) {korLevel =  kor + "(우)";}
        else if (kor>=70) {korLevel = kor + "(미)";}
        else if (kor>=60) {korLevel =  kor + "(양)";}
        else {korLevel =  kor + "(가)";}
        // 대처방안 : for, method, 삼항연산자

        engLevel = (eng>=90)? eng+"(수)" :
                (eng>=80)? eng+"(우)" :
                          (eng>=70)? eng+"(미)" :
                                  (eng>=60)? eng+"(양)" : eng+"(가)";

        mathLevel = (math>=90)? math+"(수)" :
                (math>=80)? math+"(우)" :
                        (math>=70)? math+"(미)" :
                                (math>=60)? math+"(양)" : math+"(가)";



        // 합격, 불합

        if(avg>=70)  {pass = "합격.";}
        else  {pass = "불격";}

        // 레벨
        totlevel = "LV" + ((int)avg/10);

        // 재시험
        if (kor < 40) {trytest += "O\t";} else {trytest += "-\t";}
        trytest += (eng < 40)? "O\t" : "-\t";
        trytest += (math < 40)? "O\t" : "-\t";




        // 출력



        System.out.println("==============================================================================");
        System.out.println("이름\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\t\t합격여부\t\t레벨\t\t장학생");
        System.out.println(hakbun + "\t" + korLevel + "\t" + engLevel + "\t" + mathLevel + "\t" + tot + "\t" + String.format("%.2f",avg) + "\t" + pass  + "\t" + jang + "\t" + totlevel);
        System.out.println("==============================================================================");

        if (kor < 40 || eng < 40 || math < 40)
        { System.out.println("------------------------------------------------");
            {System.out.println("재시험\t" + trytest);}



    }
}
}


 /*
        구문 연습15   클래스명 : IF015
	  0) 학번 담을 자료형선택해  학번이라 변수명을 정하고 입력받기
	  1) 국어점수 담을 자료형선택해 kor이라 변수명을 정하고 입력받기
	  2) 영어점수 담을 자료형선택해 eng이라 변수명을 정하고 입력받기
	  3) 수학점수 담을 자료형선택해 math이라 변수명을 정하고 입력받기
	  4) 총점점수 담을 자료형선택해 tot이라 변수명을 정하고 총점구하기
	  5) 평균점수 담을 자료형(float)선택해 avg이라 변수명을 정하고  평균구하기
	  6) 모두 출력 	- 평균은 소수점이 처리되게 만들기
	  7) 평균 95이상이면 장학생
	  8-1) 국어점수 90이상 수,80이상 우,70이상 미,60이상 양,나머지 가
	  8-2) 영어점수 90이상 수,80이상 우,70이상 미,60이상 양,나머지 가
	  8-3) 수학점수 90이상 수,80이상 우,70이상 미,60이상 양,나머지 가
	  9) 평균이 70이상이면 "합격"
	     평균이 70미만이면 무조건 "불합격"

	  10) 레벨 - 평균점수가 100점대라면 Lv10 , 평균이 90점대라면 Lv9 ,,,
	  11) 만약 재시험이 있다면 재시험과목 출력
	  		 세과목중에서 한과목이라도 40미만이면
		     해당과목 "재시험"

		     예시1)
	학번 입력 > std1111
	국어점수 입력 > 100
	영어점수 입력 > 100
	수학점수 입력 > 99

	===================================================================================
	학번	국어	영어	수학	총점	평균	합격여부	장학생  레벨
	===================================================================================
	std1111	100(수)	100(수)	99(수)	299	99.67	합격	장학생  Lv9
	===================================================================================

	예시1)
	학번 입력 > std2222
	국어점수 입력 > 40
	영어점수 입력 > 40
	수학점수 입력 > 39

	===================================================================================
	학번		국어		영어		수학		총점	평균		합격여부	장학생  레벨
	===================================================================================
	std1111	40(가)	39(가)	39(가)	118	39.33	불합격	-     Lv3
	===================================================================================
	재시험여부  -        O       O
	===================================================================================
        */