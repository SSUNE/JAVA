public class Arr005 {
    public static void main(String[] args) {
        int[] arr = new int[3]; // new(공간빌려오기) int(정수형) [갯수]

        int data = 0;

        //ver-1
        /*arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;*/

        //ver-2
        /*data = data +10; arr[0] = data;
        data = data +10; arr[1] = data;
        data = data +10; arr[2] = data;*/

        //ver-3
        for (int i = 0; i < arr.length; i++) {
            data = data + 10;
            arr[i] = data;
        }

        for (int i = 0 ; i< arr.length; i++){
            System.out.print( arr[i] + "\t");
        }

    }
}
