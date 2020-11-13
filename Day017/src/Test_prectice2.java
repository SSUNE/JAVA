public class Test_prectice2 {
    public static void main(String[] args) {
        String name[] = {"아이언맨", "헐크\t", "캡틴\t", "토르\t", "호크아이"};
        String hap[] = new String[5];
        String jang[] = {"","","","",""};
        String star[] = {"","","","",""};
        String pass[] = new String[5];
        int[] kor = {100,20,90,70,35};
        int[] eng = {100,50,95,80,100};
        int[] math = {100,30,90,60,100};
        int[] avg = new int[5];
        int[] rank = {1,1,1,1,1};


        for (int i = 0; i<name.length; i++){

            // 평균
            for (int j = 0; j<name.length; j++){
                avg[i] = (kor[i] + eng[i] + math[i])/3;
            }

            // 합격여부
            if (avg[i] >= 60 && kor[i]>=40 && eng[i]>=40 && math[i]>=40){
                pass[i] = "합격\t";
            }else if (avg[i] < 60) {
                pass [i] = "불합격";
            }else if (avg[i] >= 60 && (kor[i]<40 || eng[i]<40||math[i]<40)){
                pass [i] = "재시험";
            }

            // 장학생여부[ㅔ[
            if (avg[i]>=95){
                jang[i] = "장학생";
            } else {
                jang[i] = "\t";
            }

            // 랭킹
            for (int j = 0; j<(avg[i]/10); j++) {
                star[i] += "★";
            }
            //System.out.println();

        }

        // 등수
        for (int i = 0; i<name.length; i++) {
            System.out.println("i : " + i);
            for (int k = 0; k < name.length; k++) {
                System.out.println("k : " + k);
                if (avg[i] < avg[k]) {
                    if (i == k) {
                        continue;
                    } else {
                        rank[i]++;
                        System.out.println(" rank[i] : (" +  rank[i] + ")");
                    }
                }
            }
        }

        //출력
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("이름\t\t국어\t영어\t수학\t평균\t등수\t합격여부\t장학생\t랭킹");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        for (int i=0; i< name.length; i++){
            System.out.println(name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + math[i] + "\t" + avg[i] + "\t" + rank[i] + "\t" + pass[i] + "\t" + jang[i] + "\t" + star[i]);
        }
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");


    }
}
