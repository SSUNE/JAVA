package ClassArr005_package;

// 출력기능을 하는 역활
public class MoneyShow_ver {

    MoneyShow_ver(){super();}

    public void main(){
        System.out.println("======================================");
        System.out.println(":::::::::::::::::::WELCOM! " + Money_ver.getBANKNAME());
        System.out.println("======================================");
        }

    public void show(Money_ver user){
        main();
        System.out.println("[USER] " + user.getUser_name() + " 고객님의 정보입니다.");
        System.out.println("잔액 : " + user.getUser_won() + "");
    }

    public void show(Money_ver[] user){
        main();
        System.out.println("[USER]\t\tNAME\tBALANCE");
        System.out.println("-------------------------------------");
        for (int i = 0; i< user.length; i++){
            System.out.println("[USER]\t\t" + user[i].getUser_name() + "\t\t" + user[i].getUser_won() );
        }

    }

}
