package class033_package;

public class Car {
    private String color;
    private String gearType;
    private int door;

    //get
    public String getColor() {return color;}
    public String getGearType() { return gearType; }
    public int getDoor() { return door; }

    //set
    public void setColor(String color) { this.color = color; }
    public void setGearType(String gearType) { this.gearType = gearType; }
    public void setDoor(int door) { this.door = door; }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", gearType='" + gearType + '\'' +
                ", door=" + door +
                '}';
    }
    public Car() { }
    public Car(String color, String gearType, int door) {
        this.color = color; this.gearType = gearType; this.door = door;
    }
}
