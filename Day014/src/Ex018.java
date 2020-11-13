public class Ex018 {
    public static void main(String[] args) {

        String[] name = {"아이언맨", "헐크\t", "캡틴\t", "토르\t", "호크아이"};
        String[] pass = {"", "", "", "", ""};
        String[] jang = {"", "", "", "", ""};
        String[] star = {"", "", "", "", ""};
        int[] kor = {100, 100, 100, 70, 35};
        int[] eng = {100, 100, 100, 80, 35};
        int[] mat = {100, 100, 100, 60, 35};
        int[] rank = {1, 1, 1, 1, 1};
        int[] avg = new int[5];
        int size = name.length;

        //처리
        for (int i = 0; i < size; i++) {
            // 평균
            for (int j = 0; j < avg.length; j++) {
                avg[j] = (kor[i] + eng[i] + mat[i]) / 3;
            }
            // 합격여부
            if (avg[i] >= 60) {
                pass[i] = "합격\t";
            } else {
                pass[i] = "불합격";
            }
            // 장학생여부
            if (avg[i] >= 95) {
                jang[i] = "장학생";
            } else {
                jang[i] = "----";
            }

            //랭킹
            for (int k = 0; k <= (avg[i] / 10); k++) {
                star[i] += "★";
            }

            // 등수
            for (int a = 0; a < rank.length; a++) {
                if (avg[i] < avg[a]) {
                    rank[i] = i - 1;
                } else if (avg[i] == avg[a]) {
                    break;
                }
            }
        }

        //출력
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("이름\t\t국어\t영어\t수학\t평균\t등수\t합격여부\t장학생\t랭킹");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        for (int i = 0; i < size; i++) {
            System.out.println(name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + avg[i] + "\t" + rank[i] + "\t" + pass[i] + "\t" + jang[i] + "\t" + star[i]);
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }
}
