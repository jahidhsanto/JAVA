package Super_Keyword_1;

public class B extends A {
    int x = 5;

    void display_1() {
        System.out.println("This value without super class: " + x);
    }

    void display_2() {
        System.out.println("This value with super class: " + super.x);
    }
}
