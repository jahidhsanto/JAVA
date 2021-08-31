package Call_by_Value_Refference;

public class Main {
    public static void main(String[] args) {
        Call_by_Value ob = new Call_by_Value();
        int x = 10;
        System.out.println("x before call: " + x);

        ob.change(x);
        System.out.println("x after call: " + x);

        Call_by_Refference r1 = new Call_by_Refference();
        r1.name = "Jahid";
        System.out.println("r1 before call: " + r1.name);

        r1.change(r1);
        System.out.println("r1 after call: " + r1.name);
    }
}
