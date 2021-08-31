package Problem_2;

public class Main {
    public static void main(String[] args) {
        Shape area;

        area = new Rectangle();
        area.area(10, 20);

        area = new Circle();
        area.area(10,10);

        area = new Triangle();
        area.area(10, 20);
    }
}
