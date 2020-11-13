package ClassArr004_package;
// 클래스의 기능 : 데이터를 받아서 (전달하는) 기능 : DTO
public class Score {
    //1. 멤버변수
    private String name, pass;
    private int kor, eng, math;
    private double avg;

    //getter
    public String getName() { return name; }
    public String getPass() { return pass; }
    public int getKor() { return kor; }
    public int getEng() { return eng; }
    public int getMath() { return math; }
    public double getAvg() { return avg; }

    //setter
    public void setName(String name) { this.name = name; }
    public void setPass(String pass) { this.pass = pass; }
    public void setKor(int kor) { this.kor = kor; }
    public void setEng(int eng) { this.eng = eng; }
    public void setMath(int math) { this.math = math; }
    public void setAvg(double avg) { this.avg = avg; }

    @Override
    public String toString() { return "Score{name='" + name + '\'' + ", pass='" + pass + '\'' + ", kor=" + kor
            + ", eng=" + eng + ", math=" + math + ", avg=" + avg + '}'; }

    //생성자
    public Score(String name, String pass, int kor, int eng, int math, double avg)
    { this.name = name; this.pass = pass; this.kor = kor; this.eng = eng; this.math = math; this.avg = avg; }

    public Score() { this.name = ""; this.pass = ""; this.kor = 0; this.eng = 0; this.math = 0; this.avg = 0; }

    public Score(String name, int kor, int eng, int math) {
        this.name = name; this.kor = kor; this.eng = eng; this.math = math;
    }
}
