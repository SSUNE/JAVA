public class Ex005 {
    public static void main(String[] args) {

        int count = 0;
        int [] su = {-3, 5, -1, 9, -7};
        for (int i = 0; i< su.length; i++){
            if (su[i] < 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
