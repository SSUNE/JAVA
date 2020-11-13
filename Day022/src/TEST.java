public class TEST {
    public static void main(String[] args) {
        String name[] = {"아이언맨", "헐크\t", "캡틴\t", "토르\t", "호크아이"};
        String pass[] = new String[5];
        String jang[] = {"", "", "", "", ""};
        String star[] = {"", "", "", "", ""};
        int size = name.length;
        int[] kor = {100, 20, 90, 70, 35};
        int[] eng = {100, 50, 95, 80, 100};
        int[] mat = {100, 30, 90, 60, 100};
        float avg[] = new float[5];
        int[] rank = {1, 1, 1, 1, 1};

        // 1) process_aver = 평균
        for (int i = 0; i < name.length; i++) {
            avg[i] = process_aver(kor[i], eng[i], mat[i]);
        }
        // 2) process_rank = 등수
        process_rank(size, avg, rank);

        // 3) process_scholar - 장학생 95점 이상
        process_scholar(avg, jang);

        // 4) process_pass
        process_pass(avg, kor, eng, mat, pass);

        // process_star = 별
        process_star(avg, star);

        // process_show
        process_show(name, kor, eng, mat, avg, rank, pass, jang, star);
    }

    //평균
    private static float process_aver(int kor, int eng, int math) {
        return (kor + eng + math) / 3.f;
    }

    //등수
    private static void process_rank(int size, float[] avg, int[] rank) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (avg[i] < avg[j]) {
                    rank[i]++;
                }
            }
        }
    }

    //장학생
    private static void process_scholar(float[] avg, String[] jang) {
        for (int i = 0; i < avg.length; i++) {
            jang[i] = (avg[i] >= 95) ? "장학생" : "\t";
        }
    }

    // 합격여부
    private static void process_pass(float[] avg, int[] kor, int[] eng, int[] mat, String[] pass) {
        for (int i = 0; i < avg.length; i++){
            if (avg[i] >= 60 && kor[i] >= 40 && eng[i] >= 40 && mat[i] >= 40){
                pass[i] = "합격\t";
            }else if (avg[i] < 60) {
                pass[i] = "불합격";
            }else if (avg[i] >= 60 && (kor[i] < 40 || eng[i] < 40 || mat[i] < 40)){
                pass[i] = "재시험";
            }
        }
    }

    //별랭크
    private static void process_star(float[] avg, String[] star) {
        for (int i = 0; i < avg.length; i++){
            for (int j = 0; j < (int)(avg[i]/10); j++) {
                star[i] += "*";
            }
        }
    }


    private static void process_show(String[] name, int[] kor, int[] eng, int[] mat, float[] avg, int[] rank, String[] pass, String[] jang, String[] star) {
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("이름\t\t국어\t영어\t수학\t평균\t\t등수\t합격여부\t장학생\t랭킹");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + String.format("%.2f",avg[i]) + "\t" + rank[i] + "\t" + pass[i] + "\t" + jang[i] + "\t" + star[i]);
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

    }
}
