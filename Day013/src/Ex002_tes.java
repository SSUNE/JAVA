public class Ex002_tes {
    public static void main(String[] args) {

        int[] num = new int[30];

        for(int i = 0; i<num.length; i++) {

            num[i] = (int)(Math.random() * 10); // 0부터 9 범위 내의 숫자
            System.out.print(num[i] + ", ");
        }System.out.println();

        // 배열에 들어있는 숫자들이 각각 몇개 들어있는지 카운트 세기
        int[] count = new int[10];

        for(int i = 0; i<num.length; i++) {
            count[num[i]]++; // num[i] 의 값은 count[i]값과 동일 0~9
        }
        for(int i =0; i<count.length; i++) {
            System.out.println(i + "번 : " + count[i]); // 카운트 출력을 위한 구문
        }

    }

}
