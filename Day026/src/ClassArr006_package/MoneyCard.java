package ClassArr006_package;

public class MoneyCard {
    public void cardRanking(Money_ver2[] user){
        for (int i = 0; i<user.length; i++){
            if (user[i].getUser_won() >= 25000){
                user[i].setRanking("gold");
            }else if (user[i].getUser_won() >= 15000){
                user[i].setRanking("silver");
            }else {
                user[i].setRanking("green");
            }
        }

    }
    public void cardRanking(Money_ver2 user){
        if (user.getUser_won() >= 25000){
            user.setRanking("gold");
        }else if (user.getUser_won() >= 15000){
            user.setRanking("silver");
        }else {
            user.setRanking("green");
        }

    }

    // 고객님 금액이 25000원이상이면 gold
    // 고객님 금액이 15000원이상이면 silver
    // 고객님 금액이 기본이면 green
}
