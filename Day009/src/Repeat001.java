public class Repeat001 {
    public static void main(String[] args) {

        // for
        for (int i = 1; i<4; i++){
            System.out.println(i);
        }

        // while
        // 1. 초기값   2. 조건식   3. 증감문
        int i = 1;
        while (i<4) {
            System.out.println(i);
            i++;
        }

        // do - while
        System.out.println();
        i = 10;
        do {
            System.out.println(i);
            i++;
        } while (i<4);

    }
}
