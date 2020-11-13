class Student001 {
    // 맴버변수
    String name; // 학생이름
    int ban, no, kor, eng, math; // 반, 번호, 국어점수, 영어점수, 수학점수

    //맴버함수
    @Override
    public String toString() {
        return "Student001{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", no=" + no +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }

    //생성자
    Student001(){}
}

public class EX003 {
    public static void main(String[] args) {
        Student001 s1 = new Student001();
        System.out.println(s1);
    }
}
