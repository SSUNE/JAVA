class TV001{
    //1.멤버변수
    String channel; // 제품이름
    int vloume; // 제품가격
    //2. 멤버함수
    public void show(){
        System.out.print("=====TV" + "\nTV채널 : " + channel + "\nTV볼륨 : " + vloume);
    }
}

public class Class004 {
    public static void main(String[] args) {

        //instance
        TV001 tv = new TV001();

        //pulic
        tv.channel = "JTBC";
        tv.vloume = 5;
        tv.show();
        
    }
}
