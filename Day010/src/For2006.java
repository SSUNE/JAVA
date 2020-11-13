public class For2006 {
    public static void main(String[] args) {


        //for
        for (int i=1; i<5; i++){
            for (int j=1; j<5; j++){
                if (i == j){
                    System.out.print("@");
                }else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }

        System.out.println();

        // while
        int i=1;
        while ( i<5){

            int j=1;
            while ( j<5){
                if (i == j){
                    System.out.print("@");
                }else {
                    System.out.print("#");
                }
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println();

        // do-while
        int i2=1;
        do {

            int j2=1;
            do {
                if (i2 == j2){
                    System.out.print("@");
                }else {
                    System.out.print("#");
                }
                j2++;
            }while ( j2<5);
            System.out.println();
            i2++;
        }while ( i2<5);


    }
}
