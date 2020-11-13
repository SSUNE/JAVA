class FinalBasic{
    String name;
    final int age=10; // 1) final 상수 - 상수는 안 변하는 값

    void show(){
        System.out.println("::::::: STATEIC + FINAL");
        System.out.println(":: 이 름 : " + this.name);
        System.out.println(":: 나 이 : " + this.age);
    }

    @Override
    public String toString() {
        return "FinalBasic{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public FinalBasic(){ }
}

public class Class029 {
    public static void main(String[] args) {
        System.out.println(Math.PI); // static final
        //1. FinalBasic FinalBasic [name= , age=]
        //2. new 공간빌려오는
        //3. FinalBasic [name = null, age = 10]
        FinalBasic f1 = new FinalBasic();
        System.out.println(f1);
        f1.show();
    }
}
