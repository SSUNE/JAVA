public class For008 {
    public static void main(String[] args) {
        // 소문자 a~z까지 모음의 갯수를 출력하시오.


        int i = 0;

        // ver-1 모음 (a e i o u)
        // a가 모음이라면 카운트 증가
        /*
        if ('a' == 'a' ||'a' == 'e' ||'a' == 'i' ||'a' == 'o' ||'a' == 'u' ) {i++;}
        System.out.println("소문자 a~z까지 모음의 갯수" + i);

         */

       for (char a = 'a'; a<='z'; a++){
           //if ('a' == 'a' ||'a' == 'e' ||'a' == 'i' ||'a' == 'o' ||'a' == 'u' ) {i++;}
           switch (a) {
               case 'a' : case 'e' :case 'i' :case 'o' :case 'u' : i++;
               break;
           }
       }
        System.out.println("소문자 a~z까지 모음의 갯수 : " + i);





    }
}
