public class Apple {
    //멤버변수
    private String name, order; // 이름, 주문자
    private int num, price; // 개수, 가격

    //맴버함수
    @Override
    public String toString() { return "Apple{name='" + name + '\'' + ", order='" + order + '\'' + ", num=" + num + ", price=" + price + '}'; }
    //getter & setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getOrder() { return order; }
    public void setOrder(String order) { this.order = order; }
    public int getNum() { return num; }
    public void setNum(int num) { this.num = num; }
    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    //생성자
    //기본
    public Apple() {
        this.name = "APPLE";
        this.order = "홍길동";
        this.num = 1000;
        this.price = 1;
    }
    //필드
    public Apple(String name, int num, int price, String order) {
        this.name = name;
        this.order = order;
        this.num = num;
        this.price = price;
    }
}
