package Class035_package;

public class ScoreDto {
    //멤버변수
    private String name, p, s, rank; // 이름, 합격여부, 장학생여부, 별
    private int kor, eng, math, total;
    private double aver;

    //get

    public String getName() {
        return name;
    }
    public String getP() {
        return p;
    }
    public String getS() {
        return s;
    }
    public String getRank() {
        return rank;
    }
    public int getKor() {
        return kor;
    }
    public int getEng() {
        return eng;
    }
    public int getMath() {
        return math;
    }
    public int getTotal() {
        return total;
    }
    public double getAver() {
        return aver;
    }

    //set
    public void setName(String name) {
        this.name = name;
    }
    public void setP(String p) {
        this.p = p;
    }
    public void setS(String s) {
        this.s = s;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public void setAver(double aver) {
        this.aver = aver;
    }

    @Override
    public String toString() { return "Score_ver2{name='" + name + '\'' + ", p='" + p + '\'' + ", s='" + s + '\'' + ", rank='" + rank +
                                '\'' + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total + ", aver=" + aver + '}';
    }

    public ScoreDto(String name, String p, String s, String rank, int kor, int eng, int math, int total, double aver)
    { super(); this.name = name;this.p = p;this.s = s;this.rank = rank;this.kor = kor;this.eng = eng;this.math = math;this.total = total;this.aver = aver; }

    public ScoreDto(String name, int kor, int eng, int math) {
        this(); this.name = name; this.kor = kor; this.eng = eng; this.math = math;
    }

    public ScoreDto() {
        name = ""; p = ""; s=""; rank="";
    }
}
