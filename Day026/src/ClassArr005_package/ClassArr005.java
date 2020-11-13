package ClassArr005_package;

public class ClassArr005 {
    public static void main(String[] args) {
        /*Money_ver[] user = new Money_ver[3];
        user[0] = new Money_ver("aaa",10000);
        user[1] = new Money_ver("bbb",20000);
        user[2] = new Money_ver("ccc",30000);*/

        Money_ver[] user = new Money_ver[]{
                new Money_ver("aaa",10000), new Money_ver("bbb",20000), new Money_ver("ccc",30000)
        };
        MoneyShow_ver print = new MoneyShow_ver();
        print.show(user[0]);
        print.show(user);

    }
}
