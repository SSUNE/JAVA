package ClassArr004_package;

public class ScorePrint {
    //멤버하수
    ScorePrint(){super();}
    /*public void show(Score std){
        showtitle();
        System.out.println(std.getName() + "\t" + std.getKor() + "\t" + std.getEng() + "\t" + std.getAvg() + "\t" + std.getPass());
    }*/
    public void show(Score[] std){
        showtitle();
        for (int i = 0; i<std.length; i++){
            System.out.println(std[i].getName() + "\t" + std[i].getKor() + "\t" + std[i].getEng() + "\t" + std[i].getMath()
                    + "\t" + String.format("%.2f",std[i].getAvg()) + "\t" + std[i].getPass());
        }
    }
    public void showtitle(){
        System.out.println("=================================================");
        System.out.println("이름\t\t국어\t영어\t수학\t평균\t\t합격여부");
        System.out.println("=================================================");
    }
}
