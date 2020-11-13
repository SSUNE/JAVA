public class Ex003_techer {
    public static void main(String[] args) {

        char ch[] = new char[52];
        int count = 0;
        char data = 'A';

        for (int i = 0; i < ch.length; i++) {
            ch[i] = data++;



        }
        System.out.println("모음의 갯수 : " + count);
    }
}
