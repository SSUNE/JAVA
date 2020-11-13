public class Ex003 {
    public static void main(String[] args) {

        char ch[] = new char[52];
        int count = 0;
        char data = 'A';

        for (int i = 0; i < ch.length; i++) {
            ch[i] = data;
            if ((ch[i] == 'a') || (ch[i] == 'e') || (ch[i] == 'i') || (ch[i] == 'o') || (ch[i] == 'u')
                    || (ch[i] == 'A') || (ch[i] == 'E') || (ch[i] == 'I') || (ch[i] == 'O') || (ch[i] == 'U')) {
                count++;
            }
            data++;
            if (i == 25) {
                data = 'a';
            }
        }
        System.out.println("모음의 갯수 : " + count);
    }
}
