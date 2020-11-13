public class Ex0010 {
    public static void main(String[] args) {
        System.out.println("[ ver-1 ]");
        int num = 12345;

        int a = num / 10000;
        int b = (num / 1000) - 10;
        int c = (num / 100) - 120;
        int d = (num / 10) - 1230;
        int e = (num / 1) - 12340;

        System.out.println(a + "+" + b + "+" + c + "+" + d + "+" + e + " = " + (a + b + c + d + e));

        System.out.println();

        System.out.println("[ ver-2 ]");
        int sum = 0;
        for (int i = 12345; i > 0; i /= 10) {
            sum += i % 10;
        } System.out.println(sum);


        System.out.println();
        System.out.println("[ ver-3 ]");
        int num3 = 12345;
        int sum3 = 0;
        int temp = 0;

        temp = num3 % 10; // 5추출
        sum3 += temp;   // sum에 5더하기
        num3 = num3 / 10; // 1234
        System.out.println("5추출 : " + temp + "\t합sum : " + sum3 + "\t나머지 : " + num3);

        temp = num3 % 10; // 4추출
        sum3 += temp;   // sum에 4더하기
        num3 = num3 / 10; // 123
        System.out.println("4추출 : " + temp + "\t합sum : " + sum3 + "\t나머지 : " + num3);

        temp = num3 % 10; // 3추출
        sum3 += temp;   // sum에 3더하기
        num3 = num3 / 10; // 12
        System.out.println("3추출 : " + temp + "\t합sum : " + sum3 + "\t나머지 : " + num3);


        temp = num3 % 10; // 2추출
        sum3 += temp;   // sum에 2더하기
        num3 = num3 / 10; // 1
        System.out.println("2추출 : " + temp + "\t합sum : " + sum3 + "\t나머지 : " + num3);

        temp = num3 % 10; // 1추출
        sum3 += temp;   // sum에 1더하기
        num3 = num3 / 10; // 0
        System.out.println("1추출 : " + temp + "\t합sum : " + sum3 + "\t나머지 : " + num3);


        System.out.println("[ 최종본 ]");
        int sum4 = 0;
        int temp4 = 0;
        for (int num4 = 12345; num4 > 0; num4 /= 10) {
            temp4 = num4 % 10;
            sum4 += temp4;

        }
        System.out.println(sum4);
        int num4 = 0;
        while (temp4 > 0) {
            temp4 = num4 % 10;
            sum4 += temp4;
            num4 = num4 / 10;
        }
        System.out.println(sum4);
    }
}
