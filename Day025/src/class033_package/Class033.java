package class033_package;

public class Class033 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setColor("white");
        c1.setGearType("auto");
        c1.setDoor(4);

        Car c2 = new Car("white", "auto", 4);
        System.out.println("c1의 " + c1);
        System.out.println("c2의 " + c2);
    }
}
