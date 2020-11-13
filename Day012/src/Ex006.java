public class Ex006 {
    public static void main(String[] args) {

        int sum = 0;
        for (int a = 1; a <= 6; a++) { //1번째 주사위의 경우의 수
            for (int b = 1; b <= 6; b++) { //2번째 주사위의 경우의 수
                sum = a + b;
                if (sum == 6) {
                    System.out.println(a + "+" + b + "=" + sum);
                }
            }
        }

    }
}
