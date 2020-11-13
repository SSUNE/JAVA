class SutdaCard14{
    final int NUM;
    final boolean IS_KWANG;

    SutdaCard14(){
        this(1,true);
    }
/*
    //get
    public int getNUM() {return NUM; }
    public boolean isIS_KWANG() { return IS_KWANG; }

    //set
    public void setNUM(int NUM) { this.NUM = NUM; }
    public void setIS_KWANG(boolean IS_KWANG) { this.IS_KWANG = IS_KWANG; }*/

    SutdaCard14(int num, boolean isKwang){
        this.NUM = num;
        this.IS_KWANG = isKwang;
    }

    @Override
    public String toString() {
        return NUM + (IS_KWANG ? "K" : "");
    }
}

public class Ex020 {
    public static void main(String[] args) {
        SutdaCard14 sc = new SutdaCard14(1, true);
        System.out.println(sc);
    }
}


