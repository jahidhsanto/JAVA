package Test;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        double a = input.nextDouble();
        double b = 0;
        try {
            double c = a / b;

            int array[] = new int[5];

            array[10] = 32;


        } catch (ArithmeticException ea) {
            System.out.println("Sunno diye ki vag kora jay re pagla!!!");
        } catch (ArrayIndexOutOfBoundsException earray) {
            System.out.println("Array er index ta to vul hoise vi");
        } catch (Exception paisi) {
            System.out.println("Exception paisi vi");
        } finally {
            System.out.println("Exception Handling Hoi gese vi, Dhonnobad");
        }

    }
}
