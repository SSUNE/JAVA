public class For2005 {
    public static void main(String[] args) {


        //for
        for (int i=4; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        //while
        int i=4;
        while ( i>0){

            int j=0;
            while ( j<i){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i--;
        }


        //do-while
        int ii=4;
        do {

            int jj=0;
            do {
                System.out.print(ii);
                jj++;
            } while ( jj<ii);
            System.out.println();
            ii--;
        } while ( ii>0);



    }
}
