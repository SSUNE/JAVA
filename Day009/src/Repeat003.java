public class Repeat003 {
    public static void main(String[] args) {

        // for
        int count = 0;

        for (int i=1; i<=10; i++){
            if (i%3 == 0){
                count++;
            }
        }
        System.out.print("1~10까지의 3의 배수의 개수 : " + count + "개");
        System.out.println();



        // while
        // 1. 초기값   2. 조건식   3. 증감문
        int count1 = 0;
        int i=1;
        while (i<=10) {
            i++;
            if (i%3 == 0) {
                count1++;
            }
        }
        System.out.print("1~10까지의 3의 배수의 개수 : " + count1 + "개");
        System.out.println();




        // do - while
        int count3 = 0;
        i = 1;
        do {
            i++;
            if (i%3 == 0){}
            count3++;
        } while (i<=10);
        System.out.print("1~10까지의 3의 배수의 개수 : " + count1 + "개");
        System.out.println();


        



    }
}
