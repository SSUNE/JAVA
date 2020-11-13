import java.util.Scanner;

public class DAY011_2 {
    public static void main(String[] args) {
        char a = ' ';
        Scanner scanner = new Scanner(System.in);

        System.out.println("a,b,c중에 한개의 문자를 입력하시오 > ");
        a = scanner.next().charAt(0);

        System.out.println("ver-1");
        switch (a) {
            case 'a':
            case 'A':
                System.out.println("apple이다.");
                break;
            case 'b':
            case 'B':
                System.out.println("banana이다.");
                break;
            case 'c':
            case 'C':
                System.out.println("coconut이다.");
                break;

        }

        System.out.println();

        System.out.println("ver-2");
        String result = "";
        switch (a) {
            case 'a':
            case 'A':
                result = "apple이다.";
                break;
            case 'b':
            case 'B':
                result = "banana이다.";
                break;
            case 'c':
            case 'C':
                result = "coconut이다.";
                break;
        }
        System.out.println(result);
    }
}
