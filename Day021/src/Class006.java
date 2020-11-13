class Score001 {
    //TODO 1.멤버변수

    String name, p, s;
    String rank="";
    int kor, eng, math, total, aver;

    //TODO 2.멤버함수

    // 총점, 평균 계산
    void process() {
        total = kor + eng + math;
        aver = total / 3;
    }

    // 합격계산
    void pass() {
        p = (aver >= 60) ? "합격 " : "불합격";
    }

    // 장학생
    void schola() {
        s = (aver >= 95) ? "장학생" : "\t";
    }

    // 평균을 별로
    void star() {
        for (int i = 0; i < (int) aver / 10; i++) {
            rank+="*";
        }
    }

    // 출력
    void show() {
        process();
        pass();
        schola();
        star();
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("이름\t\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + aver + "\t" + p + "\t" + s + "\t" + rank);
        System.out.println();
    }

}

public class Class006 {
    public static void main(String[] args) {
        //instance
        Score001 iron = new Score001();

        iron.name = "아이언맨";
        iron.kor = 100;
        iron.eng = 100;
        iron.math = 100;
        iron.show();

        Score001 hulk = new Score001();
        hulk.name = "헐크\t";
        hulk.kor = 20;
        hulk.eng = 50;
        hulk.math = 30;
        hulk.show();
    }
}
