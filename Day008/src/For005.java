public class For005 {
    public static void main(String[] args) {
        // 1~10까지 3의 배수 갯수를 출력하시오.
        // 1~10까지 3의 배수 : 3

        // ver1
        int count = 0;

        for (int i=1; i<=10; i++){
            if (i%3 == 0) {
                count ++;
                //System.out.println("1~10까지의 3의 배수 : " + i);
            }

        }
        System.out.println("1~10까지의 3의 배수 : " + count + "개");



/*
        // ver2
        int count = 0;
        for (int i=1; i<=10; i++){
            switch (i%3){
                case 0 : count++;
            }
        }
        System.out.println("1~10까지의 3의 배수 : " + count);

 */
    }
}
