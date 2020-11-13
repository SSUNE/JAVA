public class For004_2 {
    public static void main(String[] args) {
        // for문을 이용하여 1~10까지의 합을 구하시오.
        // 1~10까지의 합 ; 1+2+3+ ... +10=55

        int sum=0;

        for (int i = 1; i<=10; i++){
            sum +=i;
            System.out.print(i);
            switch (i){
                case 10 :
                    System.out.print("="); break;
                default:
                    System.out.print("+"); break;
            }
        }
        System.out.print(sum);



    }
}
