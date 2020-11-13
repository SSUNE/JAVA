class Animal_static{
    //멤버변수
    String name;
    int age;


    static String COMPANY = "(주)동물농장"; // 초기화 ver-1
    static int animal_num = 10;

    static String Boss;
    static String Location;
    static {Boss = "신동엽";  Location ="여의도";} // 초기화 ver-2

    //멤버함수

    @Override
    public String toString() {
        return "Animal_static{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void num_plus(){animal_num++;} // 클래스함수 // (static : method영역)
    public void show(){ // 인스턴스함수(heap영역)
        System.out.println(":::::::::::::::");
        System.out.println(":: 회사명 ::" + Animal_static.COMPANY);
        System.out.println(":: 이 름 ::" + this.name);
        System.out.println(":: 나 이 ::" + this.age);
        System.out.println(":: 식구수 ::" + Animal_static.animal_num);
    }

    //생성자
    public Animal_static() {super();}
    public Animal_static(String  name, int age) {super();this.name = name; this.age = age;}

}
public class Class021 {
    public static void main(String[] args) {
        System.out.println("회사명 : " + Animal_static.COMPANY);
        System.out.println("식구수 : " + Animal_static.animal_num);
        System.out.println("사장님 : " + Animal_static.Boss);
        System.out.println("회사위치 : " + Animal_static.Location);

        //1. Animal_static한 자료형으로 사용할 수 있는 인스턴스 공간은 [name | age]
        //2. new 공간빌려오기
        //3. Animal_static()생성자는 초기화 - Animal_static [name=null | age = 0]
        //4. cat이 주소를 가지고있으므로 접근해서 사용이 가능함.
        Animal_static cat = new Animal_static();
        cat.name = "sally";     cat.age = 10; // [name = sally, age = 10] -> heap area
        // cat.num_plus(); 돌아가기는 하지만 권장사항이 아님.
        Animal_static.num_plus(); // 권장사항 -> method area
        cat.show(); // (heap area)

    }
}
