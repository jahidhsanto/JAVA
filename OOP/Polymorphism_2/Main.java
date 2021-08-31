package Polymorphism_2;

public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        Shape r = new Rectangle(10, 20);
        Shape t = new Triangle(10, 20);

        System.out.println(s.area());
        System.out.println(r.area());
        System.out.println(t.area());
    }
}
