package ClassArr005_package;
//DTO역활
public class Money_ver {
    //
    static final String BANKNAME = "GREEN BANK";
    static double rate = 0.1;
    private String user_name;
    private long user_won;

    //GETTER
    public static String getBANKNAME() { return BANKNAME; }
    public static double getRate() { return rate; }
    public String getUser_name() { return user_name; }
    public long getUser_won() { return user_won; }
    //SETTER
    public static void setRate(double rate) { Money_ver.rate = rate; }
    public void setUser_name(String user_name) { this.user_name = user_name; }
    public void setUser_won(long user_won) { this.user_won = user_won; }

    @Override
    public String toString() { return "Money_ver{user_name='" + user_name + '\'' + ", user_won=" + user_won + '}'; }

    //
    public Money_ver(String name, long won) {
        this.user_name = name;
        this.user_won = won;
    }
    public Money_ver(){}

}
