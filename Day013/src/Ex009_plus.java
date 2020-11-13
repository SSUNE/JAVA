public class Ex009_plus {
    public static void main(String[] args) {


        int[] mom = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = 0;
        int y = 2020, m = 10, d = 13, nalsu = 0;

        if ((year % 4 == 0) && (year % 400 != 0) || (year % 100 == 0)) {
            mom[1] = 29;
        } else {
            mom[1] = 28;
        }

        nalsu = (y - 1) * 365 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;

        for (int i = 0; i < (m - 1); i++) {
            nalsu += mom[i];
        }

        nalsu += d;

        System.out.println(nalsu);
    }
}

