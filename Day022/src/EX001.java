class SutdaCard{
    int num;            // 카드와 숫자 사이의정수(변수에 들어갈 수 있는 데이터 예시 : 1~10)
    boolean isKwang;    // 광 이면 아니면 (변수에 들어갈 수 있는 데이터 예시 : true, false)

    SutdaCard(){ // 기본 생성자
    }
    //멤버함수
    @Override
    public String toString() {
        return "SutdaCard{" +
                "num=" + num +
                ", isKwang=" + isKwang +
                '}'; // 상태파악 System.out.println(card1);에 대한...
    }
}

public class EX001 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard();
        System.out.println("[num = " + card1.num + ", isKwang = " + card1.isKwang + "]");
        System.out.println(card1);
    }
}

