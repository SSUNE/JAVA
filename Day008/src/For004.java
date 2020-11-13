public class For004 {
    public static void main(String[] args) {
        // for문을 이용하여 1~10까지의 합을 구하시오.
        // 1~10까지의 합 ; 55

        int sum=0;

        for (int i = 1; i<=10; i++){
            sum +=i;
            //System.out.println("1부터 10까지의 합은 : " + sum);
        }
        System.out.println("1부터 10까지의 합은 : " + sum);

    }
}
