public class Day014_5 {
    public static void main(String[] args) {

        int[] arr = new int[3];

        int data = 0;
        for (int i = 0; i < arr.length; i++) {
            data = data + 1000;
            arr[i] = data;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
