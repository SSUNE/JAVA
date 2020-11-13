

public class Apple_Print {
    //멤버변수
    //생성자
    public Apple_Print(){super();}
    //멤버함수
    public void show(Apple user) {
        System.out.println(":::::::APPLEORDER");
        System.out.println("::ORDER : " + user.getOrder());
        System.out.println("::NAME : " + user.getName());
        System.out.println("::NUM : " + user.getNum());
        System.out.println("::PRICE : " + user.getPrice());
        //System.out.println(user);

    }
    public void show(Apple []user) {
        for (int i = 0; i< user.length; i++) {
            System.out.println(":::::::APPLEORDER");
            System.out.println("::ORDER : " + user[i].getOrder());
            System.out.println("::NAME : " + user[i].getName());
            System.out.println("::NUM : " + user[i].getNum());
            System.out.println("::PRICE : " + user[i].getPrice());
        }
        //System.out.println(Arrays.toString(user));
    }

}
