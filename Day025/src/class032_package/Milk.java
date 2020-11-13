package class032_package;

public class Milk {
    //멤버변수
    private int mno;
    private String mname;
    private int mprice;

    protected int hello;

    public void setMprice(int mprice) {
        this.mprice = mprice;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "mno=" + mno +
                ", mname='" + mname + '\'' +
                ", mprice=" + mprice +
                '}';
    }
}
