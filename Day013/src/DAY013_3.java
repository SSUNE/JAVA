import java.util.Scanner;

public class DAY013_3 {
    public static void main(String[] args) {

        System.out.println("[ for ]");
        for (int a = 100; a <= 300; a += 100) {
            System.out.print(a + "\t");
        }

        System.out.println();
        System.out.println("[ while ]");
        int a = 100;
        while (a <= 300) {
            System.out.print(a + "\t");
            a += 100;
        }

        System.out.println();
        System.out.println("[ do-while ]");
        int a2 = 100;
        do {
            System.out.print(a2 + "\t");
            a2 += 100;
        } while (a2 <= 300);
    }
}
