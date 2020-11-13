public class DAY020_4 {
    public static void main(String[] args) {
        // star();
        //1. 분석 : 리턴 - void
        //2. 분석 : 파라미터 - int

        //출력 : ★
        //star();
        star(2);

    }

    private static void star(int j) {

        for (int i = 0; i<j; i++){
            System.out.print("★");
        }
    }
}
