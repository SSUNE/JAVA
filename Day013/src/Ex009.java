public class Ex009 {
    public static void main(String[] args) {


        int[] mom = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sum = 0;

        for (int i = 1; i < 2020; i++) {
            if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) {
                sum += 366;
            } else {
                sum += 365;
            }
        }

        for (int i = 0; i < 10; i++) {
            mom[2] = 29;
            sum += mom[i];
        }

        System.out.println(sum + 13);
    }
}

