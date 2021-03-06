class StaticAInit{
    //멤버변수
    static int cv = 1;
    int        iv = 1;
    static {cv=2;}
    {iv=2;}

    public StaticAInit() {
        this.iv = 3;
    }
    //멤버함수


    //생성자


}

public class Class022 {
    public static void main(String[] args) {
        System.out.println("초기화 순서를 적으시오.");

        System.out.println("1. 클래스 변수 : cv  / 생성되는 위치 : method area") ;
        System.out.println("기본값     | 명시적 초기화    | 클래스초기화블럭 {}"); // 클래스초기화블럭에서 초기화하는게 제일 최고
        //                  cv = 0;    cv = 1         cv = 2
        System.out.println("클래스 변수의 값 : "+StaticAInit.cv);


        System.out.println("2. 인스턴스 변수 : iv     / 생성되는 위치 : heap area");
        System.out.println("기본값     | 명시적 초기화    | 인스턴스초기화블럭 {}     | 생성자"); // 생성자에서 초기화하는게 제일 최고
        //                  iv = 0;    iv = 1         iv = 2                iv = 3
        StaticAInit si = new StaticAInit();
        System.out.println(si.iv);
        System.out.println("인스턴스 변수의 값 : "+StaticAInit.cv);
    }
}
