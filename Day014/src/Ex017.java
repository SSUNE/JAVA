public class Ex017 {
    public static void main(String[] args) {

        String[] name = {"아이언맨", "헐크", "캡틴", "토르", "호크아이"};
        String[] pass = {"", "", "", "", ""};
        String[] jang = {"", "", "", "", ""};
        int[] kor = {100, 20, 90, 70, 35};
        int[] eng = {100, 50, 95, 80, 100};
        int[] mat = {100, 30, 90, 60, 100};
        int[] aver = new int[5];
        int size = name.length;

        //처리
        for (int i = 0; i < size; i++) {
            // 평균
            for (int j = 0; j < aver.length; j++) {
                aver[j] = (kor[i] + eng[i] + mat[i]) / 3;
            }
            // 합격여부
            if (aver[i] >= 60) {
                pass[i] = "합격";
            } else {
                pass[i] = "불합격";
            }
            // 장학생여부
            if (aver[i] >= 95) {
                jang[i] = "장학생";
            } else {
                jang[i] = "----";
            }
        }

        //출력
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("이름\t\t국어\t영어\t수학\t평균\t\t합격여부\t장학생");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        for (int i = 0; i < size; i++) {
            System.out.println(name[i] + "\t\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + aver[i] + "\t" + pass[i] + "\t" + jang[i]);
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }
}
