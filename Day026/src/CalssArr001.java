public class CalssArr001 {
    public static void main(String[] args) {
        //클래스의 사용
        //int a;
        //(1.) A [name= , age=]
        //(2.) new 공간을 빌려오기
        //(3.) 생성자를 불러서 초기화 : A [name=null, age=0]
        //(4.) 사용할 수 있게 a1이 주소를 갖고 있다.

        A a1 = new A();
        a1.setName("sally"); a1.setAge(10);
        System.out.println(a1);

        //2. 클래스배열
        //int [] a = new int[3];
        A [] a2 = new A[3];
        System.out.println(a2);
        //(0) a2 = [ a2[0] = null | a2[1] = null | a2[2] = null ]
        //System.out.println(Arrays.toString(a2));
        //System.out.println(a2[0]); // null
        //a2[0].setName("s1"); System.out.println(a2[0]); //오류발생

        //a2[0] = new A();
        //(1) a2[0] = null, A [name= , age=]이러한 인스턴스공간을 만들 수 있음.
        //(2)
        //(3)
        //(4)
        a2[0] = new A();   a2[0].setName("s1"); System.out.println(a2[0]);
        a2[1] = new A();   a2[1].setName("s2"); System.out.println(a2[1]);
        a2[2] = new A();   a2[2].setName("s3"); System.out.println(a2[2]);
    }
}
