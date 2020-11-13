

public class CalssArr002 {
    public static void main(String[] args) {
        // Apple 클래스배열을 이용하여 3개 공간 만들기
        Apple[] a = new Apple[3];
        // 데이터세팅
        a[0] = new Apple("RED",2,100,"iron");
        a[1] = new Apple("GREEN",1,1500,"hulk");
        a[2] = new Apple("GOLD",3,2000,"captain");
        /*a[0].setName("RED"); a[0].setNum(2); a[0].setPrice(1000); a[0].setOrder("iron");
        a[1].setName("GREEN"); a[0].setNum(1); a[1].setPrice(1500); a[1].setOrder("hulk");
        a[2].setName("GOLD"); a[0].setNum(3); a[2].setPrice(2000); a[2].setOrder("captain");*/
        // 출력
        System.out.println("::::클래스배열연습");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);


    }
}
