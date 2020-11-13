class Sawon{
    //멤버변수
    int pay = 10000; // 인스턴스변수 - heap area저장
    static int su = 10; // 클래스변수 - Method area저장

    //static  int basicpay = pay; ///###000  인스턴스변수(new)해야하기에 ===== 오류남
    static  int basicpay2;  // 클래스변수 - Method area 저장
    static {basicpay2 = 20000;} // [기본값 : basicpay2=0; | 명시적초기화 X | 클래스초기화블록 : basicpay2 = 20000]

    //멤버함수
    public static void showSu(){
        System.out.println(su);
    } // ###001 클래스 메서드 - Method area ===== 오류안남
    // public static void showPay(){ System.out.println(this.pay); }
    // ###002 클래스 메서드 - Method area - 클래스메서드에 인스턴스변수를 사용할 수 없다.  ===== 오류남

    public void showAll001(){ // ###003 인스턴스메서드 : heap area 저장
        System.out.println(su); //3-1 . 인서턴스메서드에서 클래스변수사용이 가능함.
        System.out.println(this.pay); //3-2. 인서턴스메서드에서 인스턴스변수사용이 가능함.
    }

    public static void showAll002(){ // ###004 클래스메서드 : Method area 저장
        //showAll001(); // 클래스메서드는 인스턴스메서드를 호출할 수 없다. new하기도전에 올려야되서 오류남
        //System.out.println(this.pay); // 클래슴서드에서는 인스턴스변수를 사용 할 수 없다.
    }

    //생성자

}

public class Class023 {
    public static void main(String[] args) {
        Sawon sola = new Sawon();
    }
}
