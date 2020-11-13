public class ClassArr003_1 {
    public static void main(String[] args) {
        Apple[] user1 = new Apple[3];
        user1[0]=new Apple();
        user1[1]=new Apple();
        user1[2]=new Apple();

        Apple_Print print = new Apple_Print();
        print.show(user1[0]);
        print.show(user1);
    }
}

