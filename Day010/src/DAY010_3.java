import java.util.Scanner;

public class DAY010_3 {
    public static void main(String[] args) {

        // Q1. 1    2   3   4   5 (출력)

        // for
        for (int i=1; i<6; i++){
            System.out.print(i+"\t");
        }

        System.out.println();

        // while
        int i=1;
        while (i<6){
            System.out.print(i+"\t");
            i++;
        }

        System.out.println();

        // do-while
        i = 1;
        do {
            System.out.print(i+"\t");
            i++;
        } while (i<6);
        System.out.println();


        // Q2. 5    4   3   2   1 (출력)

        // for
        for (int j=5; j>0; j--){
            System.out.print(j+"\t");
        }

        System.out.println();

        // while
        int j=5;
        while (j>0){
            System.out.print(j+"\t");
            j--;
        }

        System.out.println();

        // do-while
        i = 5;
        do {
            System.out.print(i+"\t");
            i--;
        } while (i>0);
        System.out.println();

    }
}
