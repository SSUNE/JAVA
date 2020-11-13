public class For2003 {
    public static void main(String[] args) {


        //for
        for (int i=1; i<5; i++){
            for (int j=1; j<5; j++){
                System.out.print(j);
            }
            System.out.println();
        }


        //while
        int i=1;
        while ( i<5 ){
            int j=1;
            while ( j<5){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }



        //do-while
        int ii=1;
        do {
            int ji=1;
            do {
                System.out.print(ji);
                ji++;
            } while ( ji<5);
            System.out.println();
            ii++;
        }while ( ii<5 );


    }
}
