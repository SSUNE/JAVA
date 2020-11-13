public class For2004 {
    public static void main(String[] args) {


        //for
        for (int i=0; i<5; i++){
            for (int j=0; j<i; j++){
                System.out.print(i);
            }
            System.out.println();
        }


        //while
        int i=0;
        while ( i<5){

            int j=0;
            while ( j<i){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }

        //do-while
        int ii=0;
        do {

            int ji=0;
            do {
                System.out.print(ii);
                ji++;
            }while ( ji<ii);
            System.out.println();
            ii++;
        }while ( ii<5);



    }
}
