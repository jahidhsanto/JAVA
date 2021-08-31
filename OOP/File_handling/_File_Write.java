package Test;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class _File_Write {
    public static void main(String[] args) {
        String id, name;

        try {
            Formatter formatter = new Formatter("D:\\GUB\\5th Semester\\CSE 202\\LAB_CLASS\\src\\Test\\person\\Student.txt");

            Scanner input = new Scanner(System.in);
            System.out.println("How many student: ");
            int num = input.nextInt();

            for (int i = 1; i <= num; i++) {
                System.out.println("Enter student id and name: ");
                id = input.next();
                name = input.next();

                formatter.format("%s %s\r\n", id, name);

            }
            formatter.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
