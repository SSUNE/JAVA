class Student003 {
    // 맴버변수
    String name,avg; // 학생이름
    int ban, no, kor, eng, math, total; // 반, 번호, 국어점수, 영어점수, 수학점수

    //맴버함수
    int getTotal() {
        return this.kor + this.eng + this.math;
    }

    String  getAverage() {
        return String.format("%.1f",getTotal()/3.0);
    }

    //생성자
    Student003(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;   this.ban = ban; this.no = no; this.kor = kor; this.eng = eng; this.math = math;
    }


    public String info() {
        return this.name + ", " + this.ban + ", " + this.no + ", " + this.kor + ", " + this.eng + ", " + this.math + ", " + this.getTotal() + ", " + this.getAverage();
    }

} //class end

public class EX005 {
    public static void main(String[] args) {
        Student003 s3 = new Student003("홍길동",1,1,100,60,76);
        System.out.println(s3.info());

    }
}
