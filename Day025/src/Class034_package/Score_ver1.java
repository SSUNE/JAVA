package Class034_package;

public class Score_ver1 {
    //맴버변수
    private String name, p, s;
    private String rank; // 이름, 합격여부, 장학생여부, 별
    private int kor, eng, math, total; // 국어, 영어, 수학, 총점
    private double aver; // 평균

    public void process() {
        this.total = this.kor + this.eng + this.math;
        this.aver = total / 3.0;
    } // 총점, 평균을 계산해주는 메소드

    public void pass() {
        this.p = (aver >= 60) ? "합격\t" : "불합격";
    } // 합격을 계산해주는 메소드

    public void schola() {
        this.s = (aver >= 95) ? "장학생" : "\t";
    } // 장학생을 계산해주는 메소드

    public void star() {
        for (int j = 0; j < (int) (aver / 10); j++) {
            this.rank += "★";
        } // 평균정도를 별로 보여주는 메소드
    }
    public static void info(){
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"); // 출력해주는 메소드
        System.out.println("이름\t\t국어\t영어\t수학\t총점\t평균\t\t합격여부\t장학생\t랭킹");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"); // 출력해주는 메소드
    }

    public void show() {
        process();  pass(); schola();   star();
        System.out.println(this.name + "\t" + this.kor + "\t" + this.eng + "\t" + this.math + "\t" + this.total + "\t" +
                            String.format("%.2f",this.aver) + "\t" + this.p + "\t" + this.s + "\t" + this.rank);
    }

    //set
    public void setName(String name) { this.name = name; }
    public void setKor(int kor) { this.kor = kor; }
    public void setEng(int eng) { this.eng = eng; }
    public void setMath(int math) { this.math = math; }

    @Override
    public String toString() { return "Score_ver1{name='" + name + '\'' + ", p='" + p + '\'' + ", s='" + s + '\'' + ", rank='" + rank + '\'' +
            ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total + ", aver=" + aver + '}'; }

    //생성자
    public Score_ver1(){rank = ""; p = ""; s=""; }
    public Score_ver1(String name, int kor, int eng, int math ){
        this(); this.name = name;   this.kor = kor; this.eng = eng; this.math = math;
    }


}
	
