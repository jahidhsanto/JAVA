package Overloading_Constructor;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();

        Teacher teacher2 = new Teacher("Badhon", "Female");
        teacher2.displayinformation();

        Teacher teacher3 = new Teacher("Jahid", "Male", 1878959101);
        teacher3.displayinformation();
    }
}
