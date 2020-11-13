public class Ex002 {
    public static void main(String[] args) {

        char ch[] = {'B', 'a', 'n', 'a', 'n', 'a'};
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < ch.length; i++) {
            if ('A' <= ch[i] && ch[i] <= 'Z') {
                count++;
            } else if ('a' <= ch[i] && ch[i] <= 'z') {
                count2++;
            }
        }
        System.out.println("배열안의 대문자의 갯수 : " + count + "개, 소문자의 갯수 : " + count2 + "개");

    }
}
