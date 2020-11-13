public class For009 {
    public static void main(String[] args) {
        //  ABCDE 65~69
        //	FGHIJ 70~74
        //	KLMNO 75~79
        //	PQRST 80~84
        //	UVWXY 85~99
        //	Z     100

/*

        for (char alpha = 'A'; alpha <='Z'; alpha++){ //A~Z ++
            if (alpha%5 ==0){
                System.out.println(); //줄바꿈
            }//5개마다 줄바끔
            System.out.print(alpha);
        }
*/

        for (char alpha = 'A'; alpha <= 'Z'; alpha++) {
            if (alpha % 5 == 0) {
                System.out.println(); //줄바꿈
            }
            System.out.print(alpha);
        }
    }
}
