public class Ex016 {
    public static void main(String[] args) {

        int[] lotto = new int[6]; // 0~5

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) ((Math.random() * 45) + 1);
            for (int j = 0; j < i; j++) {
                if (lotto[j] == lotto[i]) { //비교코드
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < lotto.length; i++) {
            System.out.println(lotto[i] + "\t");

        }
    }
}
