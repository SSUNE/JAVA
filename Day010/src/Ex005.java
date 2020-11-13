public class Ex005 {
    public static void main(String[] args) {
       /* for, while, do while 버젼으로 만드시오.
 	    *
	    **
	    ***
	    ****
	    *****
    	******
    	*******
    	********
    	*********
	    **********
	    ***********
	    */

        //for
        for (int i=1; i<12; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        //while
        int i=1;
        while ( i<12){

            int j=1;
            while ( j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println();
        //do-while
        int i2=1;
        do {

            int j2=1;
            do {
                System.out.print("*");
                j2++;
            }while ( j2<=i2);
            System.out.println();
            i2++;
        }while ( i2<12);

    }
}
