package variable_length_arguments;

public class Add {
    void add(int... num) {
        int sum = 0;
        for (int x : num) {
            sum += x;
        }
        System.out.println(sum);
    }
}
