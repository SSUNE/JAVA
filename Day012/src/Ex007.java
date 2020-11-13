public class Ex007 {
    public static void main(String[] args) {

        System.out.println("1. 0 ~ 0.9999xxxx : " + Math.random());
        System.out.println("2. 0.6(0) ~ 0.9999xxxx*6(5.9xxxx) : " + Math.random()*6);
        System.out.println("3. 0.6(0) ~ (int)0.9999xxxx*6(5) : " + (int)(Math.random()*6));
        System.out.println("4. 1 ~ 6 사이 : " + ((int)(Math.random()*6)+1));

    }
}
