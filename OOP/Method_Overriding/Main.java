package Method_Overriding;

public class Main {
    public static void main(String[] args) {
        teacher t1 = new teacher();
        t1.name = "Jahid";
        t1.age = 24;
        t1.qualification = "BSC in CSE";
        t1.displayInformation();

        person p1 = new person();
        p1.name = "Badhon";
        p1.age = 20;
        p1.displayInformation();
    }
}
