public class DAY020_1 {
    public static void main(String[] args) {
        System.out.println("[ for ]");
        for (int i = 1; i<4; i++){
            System.out.print("class" + i + "\t");
        }

        System.out.println();
        System.out.println("[ while ]");
        int i = 1;
        while ( i<4){
            System.out.print("class" + i + "\t");
            i++;
        }

        System.out.println();
        System.out.println("[ do-while ]");
        int j = 1;
        do {
            System.out.print("class" + j + "\t");
            j++;
        }while ( i<4);
    }
}
