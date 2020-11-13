public class Repeat002 {
    public static void main(String[] args) {

        // for
        for (int i=1; i<6; i++){
            System.out.print(i);
        }
        System.out.println();

        for (int i=5; i>0; i--){
            System.out.print(i);
        }
        System.out.println();

        for (int i=1; i<4; i++){
            System.out.print("JAVA" + i + "\t");
        }
        System.out.println();


        // while
        // 1. 초기값   2. 조건식   3. 증감문
        int i=1;
        while (i<6) {
            System.out.print(i);
            i++;
        }
        System.out.println();

        int j=5;
        while (j>0) {
            System.out.print(j);
            j--;
        }
        System.out.println();

        int k=1;
        while (k<4){
            System.out.print("JAVA" + k + "\t");
            k++;
        }
        System.out.println();



        // do - while
        i = 1;
        do {
            System.out.print(i);
            i++;
        } while (i<6);
        System.out.println();

        i = 5;
        do {
            System.out.print(i);
            i--;
        } while (i>0);
        System.out.println();

        i = 1;
        do {
            System.out.print("JAVA" + i + "\t");
            i++;
        } while (i<4);




    }
}
