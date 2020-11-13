package ClassArr004_package;

public class ScoreProcess {
    //멤버함수
    public void process_avg(Score[] std) {
        for (int i = 0; i < std.length; i++) {
            std[i].setAvg((std[i].getKor() + std[i].getEng() + std[i].getMath()) / 3.0);
        }
    }

    public void process_pass(Score[] std) {
        for (int i = 0; i < std.length; i++) {
            if (std[i].getAvg() >= 60 && std[i].getKor() >=40 && std[i].getEng() >= 40 && std[i].getMath() >=40){
                std[i].setPass("합격\t");
            }else if (std[i].getAvg() >= 60 && (std[i].getKor() < 40 || std[i].getEng() < 40 || std[i].getMath() < 40)){
                std[i].setPass("나락\t");
            }else std[i].setPass("불합격");
        }
    }
}
