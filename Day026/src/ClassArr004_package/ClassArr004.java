package ClassArr004_package;

public class ClassArr004 {
    public static void main(String[] args) {
        //메소드 호출 방식
        Score[] std = new Score[3];
        std[0] = new Score("아이언맨", 100, 100, 100);
        std[1] = new Score("헐크\t", 90, 60, 80);
        std[2] = new Score("블랙팬서", 20, 60, 90);

        ScoreProcess process = new ScoreProcess();
        process.process_avg(std);
        process.process_pass(std);

        ScorePrint print = new ScorePrint();
        print.show(std);
    }
}
