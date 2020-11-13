import java.util.Scanner;

public class MethodApi004 {
    public static void main(String[] args) {
        /*System.out.println("002. String");
        // 1. 문자열의 길이 length, 문자열찾기 indexOf
        // 2. 문자열일부분추출 substring
        // 3. 바꾸기 replace
        // 4. 패턴에 맞춰 문자열 자르기 split
        // 5. 대소문자 변환 toUpperCase, toLowerCase


        String str = "Apple, Banana, Coconut";
        System.out.println("1, length - 문자열길이 : " + str.length());
        // int[리턴값] java.lang.String.length[메서드명]()[파라미터 X]

        System.out.println("2. indexof('내가 찾고자 하는 문자열') - 문자열찾기 : " + str.indexOf("apple")); // 0
        System.out.println("2. indexof('내가 찾고자 하는 문자열') - 문자열찾기 : " + str.indexOf("banana")); // 6
        System.out.println("2. indexof('내가 찾고자 하는 문자열') - 문자열찾기 (못찾으면 -1리턴) : " + str.indexOf("melon")); // -1
        System.out.println("2. charAt('찾고자하는 문자번호') " + str.charAt(3));
        // 본인 입맛에 맞는 메서드를 골라서 사용하기 - char charAt(int index)

        System.out.println("3. replace('찾아서  , 바꾸기) " + str.replace("banana", "melon"));

        System.out.println("4. substring(시작, 어디전까지) - 문자열 Apple 일부분 추출 : " + str.substring(0, 5)); // a String containing the characters from start to end - 1
        System.out.println("4. substring(시작, 어디전까지) - 문자열 일부분 추출 : " + str.substring(str.indexOf("A"), str.indexOf(","))); // 가장 많이 사용하는 방식

        System.out.println("5. split('기준점') 기준점을 기점으로 문자열을 잘라서 배열로 리턴");
        String[] fruits = str.split(",");
        System.out.println(fruits[0] + "\t" + fruits[1] + "\t" + fruits[2]);

        System.out.println("6. 대문자 " + str.toUpperCase());
        System.out.println("6. 소문자 " + str.toLowerCase());*/

        String files = "Png, Jpg, Gif, Txt";
        // Q4) , 를 기준으로 문자열 분리후 myfile이라는 배열에 담기 - 다음과 같이 출력
        /*
            #1. Png#
            #2. Jpg#
            #3. Gif#
            #4. Txt#
         */
        String[] myfile = files.split(",");
        for (int i = 0; i < myfile.length; i++) {
            System.out.println("#" + (i + 1) + ". " + myfile[i] + "#");
        }

        // Q5) toUpperCase를 이용하여 Jpg, Gif를 대문자로 변환 후 배열에 담기,
        for (int i = 0; i < myfile.length; i++) {
            if (myfile[i].equals("Jpg")) {
                myfile[i] = myfile[i].toUpperCase();
            }else if(myfile[i].equals("Gif")){
                myfile[i] = myfile[i].toUpperCase();
            }
        }
            for (int i = 0; i<myfile.length; i++){
                System.out.println(myfile[i] + "\t");
            }

        // Q6) toLowerCase를 이용하여 Png를 소문자로 변환 후 배열에 담기
        for (int i = 0; i<myfile.length; i++){
            if (myfile[i].equals("Png")){
                myfile[i] = myfile[i].toLowerCase();
            }
        }
        for (int i = 0; i< myfile.length; i++){
            System.out.println(myfile[i] + "\t");
        }


        String colors = "Red, Green, Blue, Black";
        // Q7) indexOf와 substring을 이용하여 colors문자열에서 Green가 들어간 컬러를 찾아 문자열 일부분을 추출하시오.
        System.out.println(colors.substring(colors.indexOf("G"), colors.indexOf("n") + 1));




        /*// Q1) length - 아이디를 입력받기 / 아이디의 길이가 10자 미만이라면 무한반복으로 다시 입력받게 만들기
        String id = "";
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            System.out.println("ID입력하세요(최소 10자)");
            id = scanner.next();
            if (id.length() >= 10) { //10자 이상 입력하면 나오기
                break;
            }
        }
        // Q2) indexOf - 이메일 입력받기 / @가 없다면 admin@email.com의 형식으로 입력하셔야 합니다. 출력
        String admin = "";
        System.out.println("이메일 입력바랍니다.");
        admin = scanner.next();
        if (admin.indexOf("@") == -1) { // 문자열을 못찾으면 -1을 리턴하니까 찾기 후에 -1이 나온다면 @가 없다라는 뜻, 그래서 == -1 넣기
            System.out.println("admin@email.com의 형식으로 입력하셔야 합니다");
        }

        // Q3) http를 찾아서 https로 바꾸기 = String naver = "http://www.naver.com";
        String www = "http://www.naver.com";
        System.out.println(www.replace("http", "https"));*/

    }// end main
}
