class MyMath3 {
    //멤버변수

    //멤버함수 : X

    //생성자
     int add(int a, int b) {
        return a+b;
    }
     long add(int a, long b) {
        return a+b;
    }
     long add(long a, int b) {
        return a+b;
    }
     long add(long a, long b) {
        return a+b;
    }
     int add(int[] a) {
         int k = 0;
         for (int i=0; i<a.length; i++){
             k += a[i];
         }
         return k;
    }

}

public class Class018 {
    public static void main(String[] args) {
        // MyMathe3
        MyMath3 mm = new MyMath3();
        System.out.println("mm.add(3,3) 결과 : " + mm.add(3, 3));
        System.out.println("mm.add(3L,3) 결과 : " + mm.add(3L, 3));
        System.out.println("mm.add(3,3L) 결과 : " + mm.add(3, 3L));
        System.out.println("mm.add(3L,3L) 결과 : " + mm.add(3L, 3L));

        int[] a = {100, 200, 300};
        System.out.println("mm.add(a) 결과 : " + mm.add(a)); // return : int[] , String, int 중에서 하나 넣으면됨.
    }
}

