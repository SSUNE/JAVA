public class Ex004_teacher {
    public static void main(String[] args) {
       /* 1+(-2)+3+(-4)+... 과 같은 식으로 계속더해나갔을때 , 몇까지 더해야 총합이 100이상이 되는지 계산하시오.
        for , while , do while문을 이용해서   처리하시오.*/

        //for
        int box = 0;
        int i = 1;
        for (i=1; box<100; i++){
            box += (i%2==1)? i : -i;
            if (box>=100){
                System.out.println(i);
            }
        }

        //while
        int box2 = 0;
        int w = 1;
        while (box2<100){
            box2 += (w%2==1)? w : -w;
            if (box2>=100){
                System.out.println(w);
            }
            w++;
        }

        //do-while
        int box3 = 0;
        int s = 1;
        do {
            box3 += (s%2==1)? s : -s;
            if (box3>=100){
                System.out.println(s);
            }
            s++;
        }while (box3<100);

    }
}
