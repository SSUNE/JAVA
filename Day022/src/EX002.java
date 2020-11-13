class SutdaCard002 {
    int num;            // 카드와 숫자 사이의정수(변수에 들어갈 수 있는 데이터 예시 : 1~10)
    boolean isKwang;    // 광 이면 아니면 (변수에 들어갈 수 있는 데이터 예시 : true, false)

    SutdaCard002() { // 파라미터생성자가 나오는 순간  - 기본생성자는 수동호출로 변경이 된다.
        this.num = 1;
        this.isKwang = true;
    }
    SutdaCard002(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    String info() {
        // TODO 2. 3, false -> 3만출력 , 1, true -> 1k출력
        // TODO 2. 만약 isKwang가 true면 1K출력 => 숫자 + 출력 / 아니면 3출력 => 숫자만 출력
        if (isKwang == true){
            return this.num + "k";
        }else {
            return  Integer.toString(this.num);
        }
    }
}

public class EX002 {
    public static void main(String[] args) {
        SutdaCard002 card1 = new SutdaCard002(3, false);  // => 파라미터가 있는 생성자
        SutdaCard002 card2 = new SutdaCard002();                        // => 기본생성자셋팅 TODO 1. num은 숫자1, boolean true;으로 셋팅

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}
