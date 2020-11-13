public class Method006 {

    public static int abs (int a ){
        a = (a < 0)? a*-1 : a;
        return a;
    }

    public static void main(String[] args) {
        System.out.println("[BASIC001] return 값이 있는 경우");
        int res1 = abs(-3);
        System.out.println(res1); // 3
    }

}
