public class Ex006 {
    public static void main(String[] args) {

        int count = 0;
        int[] su = {-3, 5, -1, 9, -7, 2, -11};
        for (int i = 0; i < su.length; i++) {
            if (su[i] % 2 == 1) {
                count+= su[i];
            }
        }
        System.out.println(count);

    }
}
