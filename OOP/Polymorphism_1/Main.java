package Polymorphism_1;

public class Main {
    public static void main(String[] args) {
        parent a;
        a = new subclass1();
        a.Print();
        a.Print2();
        a = new subclass2();
        a.Print();
    }
}
