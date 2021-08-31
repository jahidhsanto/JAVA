package variable_length_arguments;

public class Main {
    public static void main(String[] args) {
        Add ob = new Add();
        ob.add(10, 20);
        ob.add(10, 20, 30);
        ob.add(10, 20, 30, 40);
    }
}
