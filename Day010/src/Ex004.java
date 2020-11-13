public class Ex004 {
    public static void main(String[] args) {
       /* 1+(-2)+3+(-4)+... 과 같은 식으로 계속더해나갔을때 , 몇까지 더해야 총합이 100이상이 되는지 계산하시오.
        for , while , do while문을 이용해서   처리하시오.*/

        int sum=0;
        for (int i=1;;i++){
            if (i%2 == 0) {
                sum -= i;
            }else {
                sum += i;
            }if (sum >= 100){
                break;
            }
            System.out.println(i);
        }

    }
}
