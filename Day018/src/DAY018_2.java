
public class DAY018_2 {
    public static void main(String[] args) {

        int[][] arr = new int[2][3];

        int data = 101;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = data++;
            }
            data = 201;
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
