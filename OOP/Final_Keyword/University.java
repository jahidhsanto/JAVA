package Final_Keyword;

public class University {
    final String NAME = "GUB";
    final int SEMESTER; // Blank final variable
    static final int CLUB; // Static Blank Final variable

    // Use constructor to initialize BLANK FINAL VARIABLE
    University() {
        SEMESTER = 12;
    }

    // Use static block to initialize STATIC BLANK FINAL VARIABLE
    static {
        CLUB = 17;
    }

    void display() {
        System.out.println("NAME = " + NAME);
        System.out.println("SEMESTER = " + SEMESTER);
        System.out.println("CLUB = " + CLUB);
    }
}
