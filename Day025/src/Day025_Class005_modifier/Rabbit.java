package Day025_Class005_modifier;

public class Rabbit {
    //멤버변수
    private int a_private; // 은닉된 멤버 변수 ( 클래스 내부에서만 접근이 가능하기에 멤버함수랑 생성자에만 접근이 가능하다.)
    protected int b_protected;
              int c_package;
    public    int d_public;


    //맴버함수

    //getter 은닉된 멤버변수(값을 읽고)
    public int getA_private() {return a_private;}
    //setter 은닉된 멤버변수(값을 넣고)
    public void setA_private(int a_private) {this.a_private = a_private;}

    public int getB_protected() {
        return b_protected;
    }

    public int getC_package() {
        return c_package;
    }

    public int getD_public() {
        return d_public;
    }

    public void setB_protected(int b_protected) {
        this.b_protected = b_protected;
    }

    public void setC_package(int c_package) {
        this.c_package = c_package;
    }

    public void setD_public(int d_public) {
        this.d_public = d_public;
    }


    @Override
    public String toString() {
        return "Rabbit{" +
                "a_private=" + a_private +
                ", b_protected=" + b_protected +
                ", c_package=" + c_package +
                ", d_public=" + d_public +
                '}';
    }

    //생성자
    public Rabbit() {super();}

    public Rabbit(int a_private, int b_protected, int c_package, int d_public) {
        this.a_private = a_private;
        this.b_protected = b_protected;
        this.c_package = c_package;
        this.d_public = d_public;
    }
}
