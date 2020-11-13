public class Method038 {
    // Method
    // process_aver - 평균구하기
    // 리턴 : int
    // 파라미터 : int kor, int eng, int mat
    private static int process_avg(int kor, int eng, int mat) {
        return (kor + eng + mat) / 3;
    }

    // process_rank - 등수구하기
    // 리턴 : void
    // 파라미터 :int size, int[] avg, int[] rank
    private static void process_rank(int size, int[] avg, int[] rank) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (avg[i] < avg[j]){
                    rank[i]++;
                }
            }
        }
    }

    // process_scholar - 장학생 95점 이상
    // 리턴 : void
    // 파라미터 : int[] avg, String[] jang
    private static void process_scholar(int[] avg, String[] jang) {
        for (int i = 0; i < avg.length; i++) {
            jang[i] = (avg[i] >= 95) ? "장학생" : "\t";
        }
    }

    // process_pass - 합격 60이상이고, 각각 40이상/불합격/재시험 - 각각 40미만인게 있다면
    // 리턴 : void
    // 파라미터 : int[] avg, int[] kor, int[] eng, int[] mat, String[] pass
    private static void process_pass(int[] avg, int[] kor, int[] eng, int[] mat, String[] pass) {
        for (int i = 0; i < avg.length; i++) {
            if (avg[i] >= 60 && kor[i] >= 40 && eng[i] >= 40 && mat[i] >= 40) {
                pass[i] = "합격";
            } else if (avg[i] < 60) {
                pass[i] = "불합격";
            } else if (avg[i] >= 60 && (kor[i] < 40 || eng[i] < 40 || mat[i] < 40)) {
                pass[i] = "재시험";
            }
        }
    }

    // process_star - 별
    // 리턴 : void
    // 파라미터 : int[] avg, String[] star
    private static void process_star(int[] avg, String[] star) {
        for (int i = 0; i<avg.length; i++){
            for (int j = 0; j<(avg[i]/10); j++){
                star[i] += "★";
            }
        }
    }

    // process_show - 출력
    // 리턴 : void
    // 파라미터 : String[] name, int[] kor, int[] eng, int[] mat, int[] avg, int[] rank, String[] pass, String[] jang, String[] star
    private static void process_show(String[] name, int[] kor, int[] eng, int[] mat, int[] avg, int[] rank, String[] pass, String[] jang, String[] star) {
        System.out.println("이름\t\t국어\t영어\t수학\t평균\t등수\t합격여부\t장학생\t랭킹");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + " \t" + avg[i] + "\t" + rank[i] + "\t" + pass[i] + "\t" + jang[i] + "\t" + star[i]);
        }
    }

    //Main
    public static void main(String[] args) {
        String name[] = {"아이언맨", "헐크\t", "캡틴\t", "토르\t", "호크아이"};
        int size = name.length;
        int[] kor = {100, 20, 90, 70, 35};
        int[] eng = {100, 50, 95, 80, 100};
        int[] mat = {100, 30, 90, 60, 100};
        int[] avg = new int[5];
        int[] rank = {1, 1, 1, 1, 1};
        String pass[] = new String[5];
        String jang[] = {"", "", "", "", ""};
        String star[] = {"", "", "", "", ""};

        //1) process_aver - 평균구하기
        for (int i = 0; i < name.length; i++) {
            avg[i] = process_avg(kor[i], eng[i], mat[i]);
        }
        //2) process_rank - 등수구하기
        process_rank(size, avg, rank);

        //3) process_scholar - 장학생 95점 이상
        process_scholar(avg, jang);

        //4) process_pass - 합격 60이상이고, 각각 40이상/불합격/재시험 - 각각 40미만인게 있다면
        process_pass(avg, kor, eng, mat, pass);

        // process_star - 별
        process_star(avg, star);

        // process_show - 출력
        process_show(name, kor, eng, mat, avg, rank, pass, jang, star);

    }


}
