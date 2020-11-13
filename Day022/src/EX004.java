class Student002 {
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
    Student002() {
    }
}

public class EX004 {
    public static void main(String[] args) {
        Student002 s2 = new Student002();
        s2.name = "홍길동";
        s2.ban = 1;
        s2.no = 1;
        s2.kor = 100;
        s2.eng = 60;
        s2.math = 76;
        System.out.println("이름 : " + s2.name);
        System.out.println("총점 : " + s2.getTotal());
        System.out.println("평균 : " + s2.getAverage());

    }
}
