import java.util.Arrays;

public class MethodApi005 {
    public static void main(String[] args) {
        String url = "http:www.CodeJohns. co.kr/join/index.html";

        System.out.println("1. 문자열출력 : " + url);
        System.out.println("2. 글자수(length) : " + url.length());
        System.out.println("3. ht(1)tp글자를 리턴 (charAt#, substring) : " + url.charAt(1));
        System.out.println("3. ht(1)tp글자를 리턴 (charAt , substring) : " + url.substring(1,2));

        System.out.println("4. /가 처음나타내는 위치 indexOf(찾을말) : ");
        int posision1 = url.indexOf("/");
        System.out.println(posision1);

        System.out.println("5. 두번째 /의 위치 indexOf(찾을말, 어디서부터):");
        int posision2 = url.indexOf("/", posision1+1);
        System.out.println(posision2);

        System.out.println("6. /의 마지막위치 찾기 : ");
        int posision3 = url.indexOf("/");
        System.out.println(posision3);

        System.out.println("7. 폴더이름 join의 문자열 추출(split 사용하지 말것) : ");
        //ver-1
        //String [] join_arr = url.split("/");
        //System.out.println(join_arr[3]);
        //ver-2
        posision1 = url.indexOf("/");   //  /1개
        posision2 = url.indexOf("/", posision1+1);   //  /2개
        posision3 = url.indexOf("/", posision2+1);   //  /3개
        int star = posision3+1;
        int end = url.indexOf("/",star+1);
        System.out.println(url.substring(star, end));

        System.out.println("8. index.html 부분의 문자열(substring) 다 추출 : ");
        System.out.println(url.substring(url.lastIndexOf("/") +1));

        System.out.println("9. 대문자 : " + url.toUpperCase());
        System.out.println("10. 소문자 : " + url.toLowerCase());

        System.out.println("11. 도메인 : ");
        //ver-1
        String [] join_arr = url.split("/");
        System.out.println(Arrays.toString(join_arr));
        System.out.println(join_arr[2]);


        //ver-2
        url = url.toLowerCase();
        int domain_start = url.indexOf("://")+3; // 4가나옴
        int domain_end = url.indexOf("/", domain_start);
        System.out.println(url.substring(domain_start, domain_end));

    }// end main
}
