public class DAY020_2 {
    public static void main(String[] args) {
//이차원배열
        //a b c 00 01 02
        //A B C 10 11 12
        char[][] ch1 = new char[2][3]; // 2층 3칸

        char data = 'a';
        for (int floor = 0; floor < ch1.length; floor++) {
            for (int room = 0; room < ch1[floor].length; room++) {
                ch1[floor][room] = data++;
            }
            data = 'A';
        }


        for (int i = 0; i < ch1.length; i++) {
            for (int j = 0; j < ch1[i].length; j++) {
                System.out.print(ch1[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
