class PlayingCard {
    int kind; int num;  //(3) (4)
    static int width;   //(1)
    static int height;  //(2)

    //멤버함수
    public PlayingCard() {super();}
    public PlayingCard(int k, int n) {super(); this.kind = k; this.num = n;}
    //                  (5)    (6)

    
} //class end

public class EX008 {
    public static void main(String[] args) {
        System.out.println("클래스변수 변수, 인스턴스변수, 지역변수로 구분하시오.");
        System.out.println("[001] new안해도 사용이 가능한 공용으로 사용 - 클래스 변수 : (1)width, (2)height");
        System.out.println(PlayingCard.width + PlayingCard.height);
        // System.out.println(PlayingCard.kind); kind에 static이 붙지 않아서 사용불가.
        System.out.println(Math.PI); // s(static : new안해도 사용이가능한 - 공용으로 사용) f(final : 수정이 불가능한)
        System.out.println(Math.random());  // public static double random()

        System.out.println("[002] instance변수 : (3)kind, (4)num");
        // class : 설계도      / object(실체화가 가능한 것 : interface, abstract class )   / instance(실체화한것 : new해서 공간 빌려와서 사용가능 한 것)
        // [kinda | num | s(width | s(height)]
        PlayingCard card1 = new PlayingCard(); card1.kind = 1; card1.num = 2; // [kinda:1 | num:2 | s(width | s(height)]
        PlayingCard card2 = new PlayingCard(); card2.kind = 2; card1.num = 5; // [kinda:2 | num:5 | s(width | s(height)]

        System.out.println("[003] 지역변수 + (5) k, (6) n");
        System.out.println(" main에서의 지역변수 args, card1, card2");

    }
}
