import java.util.Scanner;

public class DAY011_3 {
    public static void main(String[] args) {


        //for
        for (int num=1; num<4; num++){
            System.out.print("HI" + num + "\t");
        }

        System.out.println();

        //while
        int num=1;
        while ( num<4 ){
            System.out.print("HI" + num + "\t");
            num++;
        }

        System.out.println();

        //do - while
        int num2=1;
        do {
            System.out.print("HI" + num2 + "\t");
            num2++;
        }while ( num2<4 );

    }
}
