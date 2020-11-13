public class Ex004 {
    public static void main(String[] args) {

        char ch[] = {'B', 'a', 'n', 'a', 'n', 'a'};

        for (int i =0; i< ch.length; i++){
            if ('A' <= ch[i] && ch[i] <= 'Z') {
                ch[i] = (char) (ch[i] + 32);

            } else if ('a' <= ch[i] && ch[i] <= 'z') {
                ch[i] = (char) (ch[i] - 32);
            }
            System.out.print(ch[i]);
        }


    }
}
