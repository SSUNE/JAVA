public class Ex008 {
    public static void main(String[] args) {

        int[] su = {-3, -5, -1, -9, -7};

        int max = su[0];
        int min = su[0];

        for (int i = 0; i < su.length; i++) {
            if (su[i] > max) {
                max = su[i];
            }
            if (su[i] < min) {
                min = su[i];
            }

        }
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);

    }
}
