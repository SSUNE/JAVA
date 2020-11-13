public class Class028 {
    //1. 다음과 같이 코드를 작성하고 예상되눈 결과와 결과의 근거를 작성하시오.
    /* TODO
        1. System.out.println("main(String[] ags)이 시작되었음");  시작됨.
        2. firstMethod(); 호출
        3. firstMethod() 내부의 System.out.println("firstMethod()이 시작되었음"); 출력
        4. firstMethod() 내부의 secondMthod(); 호출
        5. secondMthod() 내부의 System.out.println("secondMthod()이 시작되었음"); 출력
        6. 그 아래의 System.out.println("secondMthod()이 끝났음"); 출력
        7. secondMthod()를 부른 firstMethod()로 다시 올라가서 System.out.println("firstMethod()이 끝났음"); 출력
        8. secondMthod()를 부른 main으로 가서 secondMthod() 호출
        9. secondMthod()로 다시가서 println 두줄 출력
        10. secondMthod()를 부른 main으로 가서 마지막 System.out.println("main(String[] ags)이 끝났음"); 출력
     */
    public static void main(String[] args) {
        System.out.println("main(String[] ags)이 시작되었음");
        firstMethod();
        secondMthod();
        System.out.println("main(String[] ags)이 끝났음");

    }

    static void firstMethod() {
        System.out.println("firstMethod()이 시작되었음");
        secondMthod();
        System.out.println("firstMethod()이 끝났음");

    }

    static void secondMthod() {
        System.out.println("secondMthod()이 시작되었음");
        System.out.println("secondMthod()이 끝났음");

    }
}
