public class For2001 {
    public static void main(String[] args) {

        //for
        for (int floor=1; floor<3; floor++){
            System.out.println("\n[" + floor + "층]");

            for (int room=1; room<4; room++){
                System.out.print(room + "호실");
            }
        }

        System.out.println();

        //while
        int floor=1;
        while (floor<3 ){
            System.out.println("\n[" + floor + "층]");

            int room=1;
            while (room<4){
                System.out.print(room + "호실");
                room++;
            }
            floor++;
        }

        System.out.println();

        //do-while
        int floor2=1;
        do{
            System.out.println("\n[" + floor2 + "층]");

            int room=1;
            do {
                System.out.print(room + "호실");
                room++;
            }while (room<4);
            floor2++;
        }while (floor2<3 );

    }
}
