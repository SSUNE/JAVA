package ClassArr006_package;

public class Money_ver2 {
    //
    static final String BANKNAME = "GREEN BANK";
    static double rate = 0.1;
    private String user_name;
    private long user_won;
    private String ranking; // green, silver, gold

    //GETTER
    public static String getBANKNAME() { return BANKNAME; }
    public static double getRate() { return rate; }
    public String getUser_name() { return user_name; }
    public long getUser_won() { return user_won; }
    public String getRanking() { return ranking; }

    //SETTER
    public static void setRate(double rate) { Money_ver2.rate = rate; }
    public void setUser_name(String user_name) { this.user_name = user_name; }
    public void setUser_won(long user_won) { this.user_won = user_won; }
    public void setRanking(String ranking) { this.ranking = ranking; }

    @Override
    public String toString() { return "Money_ver{user_name='" + user_name + '\'' + ", user_won=" + user_won + '}'; }

    //
    public Money_ver2(String name, long won) {
        this.user_name = name;
        this.user_won = won;
    }
    public Money_ver2(){}
}
