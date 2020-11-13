public class Method007 {

    public static int max(int a, int b, int c){
        int max = 0;
        max = (a>b)? a : (a>c)? a : (b>c)? b : c;
        return max;
    }

    public static void main(String[] args) {
        int res1 = max(3,5,7);
        System.out.println(res1);



    }
}
