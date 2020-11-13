public class DAY013_4 {
    public static void main(String[] args) {

        for (char ch = 'A'; ch<='D'; ch++){
            System.out.println();
            for (char ch2 = 'A'; ch2 <= ch; ch2++){
                System.out.print(ch2);
            }
        }
    }
}
