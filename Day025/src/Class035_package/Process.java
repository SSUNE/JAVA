package Class035_package;

public class Process {
    public Process() {
        super();
    }

    // 기능1) 총점평균 구하기
    // 리턴값  : double []
    // 메서드명 : exec
    // 파라미터 : int kor, int eng, int math
    public double[] exec(int kor, int eng, int math) {
        double[] result = new double[2]; //총점, 평균
        result[0] = kor + eng + math; // 총점
        result[1] = result[0] / 3.0f; //평균
        return result;
    }

    // 기능2) 합격을 계산해주는 메소드
    // 리턴값    :  합격/불합격  String
    // 메서드명   :  exec_pass
    // 파라미터   :  double aver
    public String exec_pass(double aver) {
        return (aver >= 60) ? "합격" : "불합격";
    }

    // 기능3) 장학생을 계산해주는 메소드
    // 리턴값   :  String
    // 메서드명  :  exec_schola
    // 파라미터  :  double ever
    public String exec_schola(double aver) {
        return (aver >= 95) ? "장학생" : "\t\t";
    }

    // 기능4) 평균정도를 별로 보여주는 메소드
    // 리턴값    :  String
    // 메서드명   :  exec_star
    // 파라미터   :  aver
    public String exec_star(double aver) {
        String result="";
        for (int j = 0; j < (int)(aver / 10); j++) {
            result += "★";
        }
        return result;
    } // 평균정도를 별로 보여주는 메소드

    public static void info(){
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"); // 출력해주는 메소드
        System.out.println("이름\t\t국어\t영어\t수학\t총점\t평균\t\t합격여부\t장학생\t랭킹");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"); // 출력해주는 메소드
    }

    // 기능5)출력해주는 메소드
    // 리턴값   :  void
    // 메서드명  :  show
    // 파라미터  :  ScoreDto  iron
    public void show(ScoreDto iron) {
        //정의 : double[]  exec(int kor, int eng, int math)
        double[] result = exec( iron.getKor() , iron.getEng(), iron.getMath()  );
        //1. 총점, 평균처리
        iron.setTotal( (int)result[0] );
        iron.setAver( result[1]);
        iron.setP(exec_pass(result[1]));
        iron.setS(exec_schola(result[1]));
        iron.setRank(exec_star(result[1]));
        info();
        System.out.println(iron.getName() + "\t" + iron.getKor() + "\t" + iron.getEng() + "\t" + iron.getMath() + "\t" + iron.getTotal() + "\t" +
                String.format("%.2f",iron.getAver()) + "\t" + iron.getP() + "\t" + iron.getS() + "\t" + iron.getRank());
    }


    //생성자
    public Process(String name, int kor, int eng, int math) { }

}

