package Math_Class;

public class Main {
    public static void main(String[] args) throws Exception {
        int x = 20;
        int y = -50;

        int max = Math.max(x, y);
        System.out.println("Maximum: " + max);

        int min = Math.min(x, y);
        System.out.println("Minimum: " + min);

        int abs = Math.abs(y);
        System.out.println("Absolute: " + abs);

        double pow = Math.pow(x, y);
        System.out.println("Power: " + pow);

        double pi = Math.PI;
        System.out.println("PI: " + pi);

        // ---------------------------------------------------------
        System.out.println("\n\n");
        // ---------------------------------------------------------

        System.out.println(Math.abs(-9.5));
        System.out.println(Math.sqrt(25.0));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.PI);
        System.out.println(Math.log(2.0));
        System.out.println(Math.exp(1.0));
        System.out.println(Math.max(-2.3, 12.8));
        System.out.println(Math.min(-2.3, 12.8));
        System.out.println(Math.ceil(5.6));
        System.out.println(Math.floor(5.6));
    }
}
