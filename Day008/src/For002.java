public class For002 {
    public static void main(String[] args) {
        // 1 for문을 이용해서 다움과 같이 출력하시오 : 1 2 3 4 5
        // 2 for문을 이용해서 다음과 같이 출력하사오 : 5 4 3 2 1
        // 3 for문을 이용해서 다음과 같이 출력하사오 : JAVA1 JAVA2 JAVA3
        // 4 for문을 이용해서 다음과 같이 출력하사오 : HAPPY3 HAPPY2 HAPPY1

        for (int i=1; i<6; i++){
            System.out.print(i + "\t");    //ln빼서 오른쪽으로 나열되게 출력되도록
        }

        for (int i=5;i>0; i--){
            System.out.print(i + "\t");
        }

        for (int i=1; i<4; i++){
            System.out.print("JAVA"+i + "\t");
        }

        for (int i=3; i>0; i--){
            System.out.print("HAPPY"+i + "\t");
        }

    }
}
