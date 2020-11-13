// 클래스는 멤버변수와 멤버함수로 구성된다
class User001 {
    //1. 멤버변수
    public String name;
    int age;

    //2. 멤버함수
    public void show() {
        System.out.println(name + "\t" + age);
    }

    public static void nexttime() {
        System.out.println("메모리할때 안내");
    }
}

public class Class001 {

    public static void main(String[] args) {
        //형식  자료형 변수명
        //		int	a;
        //클래스도 자료형이다.	틀[name/age/show()]
        User001 user1 = new User001();
        //new => 공간빌려오기 // User001() => [name:null / age : 0 / show();]
        System.out.println("1. 클래스도 자료형 - new 공간을 빌려오고 User001() 청소해서 사용할준비 해주기");
        System.out.println("2. user1은 여기에서 쓰라는 주소를 가지고 있음");
        System.out.println("3. .으로 이용해서 접근해서 사용이 가능함 - 예) user1.name, user1.age, user1.show");
        System.out.println(user1.name + "\t" + user1.age);
        user1.show();
        // public
        user1.name = "sally";
        user1.age = 10;
        user1.show();
        // static
        User001.nexttime();




        /* 객체지향 프로그램 (오브젝트 오리엔티드 프로그램)
         * 현실세계의 객체모델을 바탕으로 프로그램을 구조화하고 개발하는 프로그래밍 기법
         *
         * 		class	vs	object	vs	instance
         * 차이점:설계도
         * 					틀(실체화가 가능한것)
         * 								구현(실체화 한것)
         *
         * =====================================
         * 1.객체모델링(설계)
         * 클래스형태 : 멤버변수 + 멤버함수
         * 		1.멤버변수 name,kor,eng,math,total,avg
         * 	    2.멤버함수(메서드)	총점구하기 / 평균구하기 / 출력
         * -작성하려는 추장석진 기능목록을 정리
         * -클래스의 형태로 만드는것.
         *
         * 2. interface
         * 	1)object
         * 기능을 구현하지 않은 추상메서드들의 집합
         * public int total(kor,eng,math);
         * public int avg(total);
         * 	2)클래스 정의
         *
         * 3.객체 생성과 사용
         * 	1)클래스 객체의 생성 - new를통한 메모리할당, 생성자를 호출
         *
         *
         *
         *
         */

    }

}
