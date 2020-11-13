class User002{
    String name;
    int age;

    void show(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
    User002(){
        name = "아이언맨";
        age = 55;
        // 초기화내용 비워둬도 되니까 무조건 쓰기
    }

}

public class Class007 {
    public static void main(String[] args) {
        // 1. 객체만들기 - 붕어빵틀(클래스, object)로 붕어빵(실체화 된것 : 인스턴스) 만들기
        //              2. new 클래스를 사용하는 어떤 곳에서 new를 이용하여 객체를 만들고(공간을 빌려온다),
        //              3. User002() : 실질적으로 유저가 사용하는 공간을 인스턴스변수 user가 사용할 수 있게 생성자(User002())가 초기화해줌.
        // 4. user는 참조하는 곳에 주소를 갖음.
        User002 user = new User002();   // user = [name = 아이언맨 |  age = 55 | shwo()]
        user.show();

        User002 user2 = new User002();  // user2 = [name = 아이언맨 |  age = 55 | shwo()]
        user2.name = "헐크"; user2.age = 10;  // user2 = [name = 헐크 |  age = 10 | shwo()]
        user2.show();
    }
}
