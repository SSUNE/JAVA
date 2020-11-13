public class DAY020_5 {
    public static void main(String[] args) {
        // star();
        //1. 분석 : 리턴 - String
        //2. 분석 : 파라미터 - int

        //출력 : ★
        //star();
        System.out.print("장수돌침대는 별이" + star(5));

    }

    private static String star(int star) {
        String k = "";
        k = star + "개";
        for (int i = 0; i<star; i++){
            k+="★";
        }
    return k;
    }

}
