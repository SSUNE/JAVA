import java.util.Scanner;

public class DAY012_3 {
    public static void main(String[] args) {

        System.out.println("for문");
        for (int num = 1; num < 4; num++){
            System.out.print("JAVA" + num + "\t");
        }
        System.out.println();

        System.out.println("while문");
        int num = 1;
        while (num < 4){
            System.out.print("JAVA" + num + "\t");
            num++;
        }
        System.out.println();

        System.out.println("do-while문");
        int num2 = 1;
        do{
            System.out.print("JAVA" + num2 + "\t");
            num2++;
        }while (num2 < 4);

    }
}
