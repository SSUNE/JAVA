public class Arr007 {
    public static void main(String[] args) {

        /*
        1. 배열이름이 ch 문자열공간 3개 만드시오.
        2. for + length를 이용하여 데이터를 대입하시오 : A, B, C, D, E
        3. for + length 이용해서 출력하시오.
         */
        char[] ch = new char[5];
        char data = 'A';
        for (int i = 0; i < ch.length; i++) {
            ch[i] = data;
            System.out.print(ch[i] + "\t");
            data += 1;
        }





        /*for(int i=0; i< ch.length; i++){
            data = (data + ); ch[i] = data;
        }*/


    }
}
