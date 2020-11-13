public class For006_2 {
    public static void main(String[] args) {
        // 1~10까지 3의 배수의 합을 출력하시오.
        //	1~10까지 3의 배수의 합 : 3+6+9 = 18

        int count = 0;
        int sum = 0;

        for (int i=1; i<=10; i++){
            if (i%3 == 0) {
                count = i;

                System.out.print(count);
                sum += i;

                switch (i){
                    case 9 :
                        System.out.print("="); break;
                    default:
                        System.out.print("+"); break;
                }
            }

        }
        System.out.print(sum);

    }
}
