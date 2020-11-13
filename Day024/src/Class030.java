class Card1{
    final int NUMBER; // 인스턴스 변수 [기본값 | 명시적 초기화 | 블록초기화 | 생성자]
    final String KIND;

    public Card1(){this.NUMBER = 0; this.KIND = "";}
    public Card1(String KIND, int NUMBER) {
        super();
        this.NUMBER = NUMBER;
        this.KIND = KIND;
    }

    @Override
    public String toString() {
        return "Card1{" +
                "NUMBER=" + NUMBER +
                ", KIND='" + KIND + '\'' +
                '}';
    }
}

public class Class030 {
    public static void main(String[] args) {
        Card1 c = new Card1("HEART", 10);
        System.out.println();
    }
}
