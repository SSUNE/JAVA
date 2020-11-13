import java.util.Scanner;

public class Equals001 {
    public static void main(String[] args) {

        // System.out.println("문자열(String 비교는 == 으로 처리해서는 안된다.");

        // 참조형은 주소를 가지고 있다 : String

        char op = '+'; //2byte 문자 1개밖에 못 집어 넣다!
        String a = "hello";                 // 주소확인1 : 601732395
        String b = a;                       // 주소확인2 : 601732395
        String c = new String("hello");     // 주소확인3 : 1569408374

        // ==       비교하는 대상의 (링크)를 비교
        // equals   비교하는 대상의 (실질적인 '값/내용')을 비교 (★★★★문자열 사용시 equals사용!!!!★★★★)
        System.out.println( a == b );       // 결과 : ture (주소를 비교)
        System.out.println( a == c );       // 결과 : false
        System.out.println( a.equals(b) );  // 결과 : ture (내용을 비교)
        System.out.println( a.equals(c) );  // 결과 : ture (내용을 비교)

        System.out.println("주소확인1 : " + System.identityHashCode(a));    // 주소확인1 : 601732395
        System.out.println("주소확인2 : " + System.identityHashCode(b));    // 주소확인1 : 601732395
        System.out.println("주소확인3 : " + System.identityHashCode(c));    // 주소확인3 : 1569408374



    }
}
