public class Ex009 {
    public static void main(String[] args) {


        System.out.println("ver-1");
        String str = "12345";
        int a = str.charAt(0) - '0';
        int b = str.charAt(1) - '0';
        int c = str.charAt(2) - '0';
        int d = str.charAt(3) - '0';
        int e = str.charAt(4) - '0';

        System.out.println(a + " + " + b + " + " + c + " + " + d + " + " + e + " = " + (a + b + c + d + e));

        System.out.println();
        System.out.println("ver-2");

        String str2 = "12345";
        int f = str2.charAt(0) - '0';
        int g = str2.charAt(1) - '0';
        int h = str2.charAt(2) - '0';
        int j = str2.charAt(3) - '0';
        int k = str2.charAt(4) - '0';

        int a2 = 0;
        for (char i = 0; i <= 4; i++) {
            a2 += str2.charAt(i) - '0';
        }

        System.out.println(f + " + " + g + " + " + h + " + " + j + " + " + k + " = " + a2);

        System.out.println();
        System.out.println("ver-3");


        String str3 = "12345";
        int sum = 0;

        for (int i=0; i<str.length();i++){
            sum+= str.charAt(i) -'0';
        }
        System.out.println(sum);


    }
}


 /*
        a = str.charAt(0) - '0';
        b = str.charAt(1) - '0';
        c = str.charAt(2) - '0';
        d = str.charAt(3) - '0';
        e = str.charAt(4) - '0';
        */