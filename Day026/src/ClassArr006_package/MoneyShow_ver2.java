package ClassArr006_package;

// 출력기능을 하는 역활
public class MoneyShow_ver2 {

    MoneyShow_ver2(){super();}

    MoneyCard card = new MoneyCard();

    public void main(){

        System.out.println("======================================");
        System.out.println(":::::::::::::::::::WELCOM! " + Money_ver2.getBANKNAME());
        System.out.println("======================================");
        }

    public void show(Money_ver2 user){
        main();
        card.cardRanking(user);
        System.out.println("[USER] " + user.getUser_name() + " 고객님의 정보입니다.");
        System.out.println("잔액 : " + user.getUser_won() + "");
        System.out.println("등급 : " + user.getRanking() + "");
    }

    public void show(Money_ver2[] user){
        main();
        card.cardRanking(user);
        System.out.println("[USER]\t\tNAME\tBALANCE\t\tCARD");
        System.out.println("-------------------------------------");
        for (int i = 0; i< user.length; i++){
            System.out.println("[USER]\t\t" + user[i].getUser_name() + "\t\t" + user[i].getUser_won() + "\t\t" + user[i].getRanking() );
        }

    }

}
