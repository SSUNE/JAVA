public class Method010 {

    public static char lower(char ch){
         return (char) (ch + 32);
    }

    public static void main(String[] args) {
        char res = lower('A');
        System.out.println(res);

    }
}
